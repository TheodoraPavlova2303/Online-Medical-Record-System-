package net.summerProject.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.summerProject.model.MedicalRecord;
import net.summerProject.model.User;
import net.summerProject.service.MRServiceImpl;
import net.summerProject.service.UserService;
import net.summerProject.validator.MedicalRecordValidator;
import net.summerProject.validator.UserValidator;

//this class is mapping the Http requests with the appropriate JSP pages 

@Controller
public class UserController {
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private MRServiceImpl mrServiceImpl; 
    
    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private MedicalRecordValidator mrValidator;
    
   //registration Get request 
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }
    
    //registration POST request 

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
    userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.save(userForm);
        return "redirect:/welcome";
    }
    
    //Create Medical Record GET and POST requests 
    
    @RequestMapping(value = {"/medicalFormCreate"}, method = RequestMethod.GET)
    public String welcomeGet(Model model) {
    	model.addAttribute("medicalForm", new MedicalRecord());
        return "medicalFormCreate";
    }
    
    @RequestMapping(value = "/medicalFormCreate", method = RequestMethod.POST)
    public String welcomePost(@ModelAttribute("medicalForm") MedicalRecord medicalForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
	mrValidator.validate(medicalForm, bindingResult);
	mrServiceImpl.save(medicalForm, userService.findByUsername(request.getUserPrincipal().getName()));
    	
	if(bindingResult.hasErrors() ) {
    		return "medicalFormCreate"; 
    	}
    	return "redirect:/welcome";
    }
    
    //GET request for welcome page 
    
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
    return "welcome";
    }
    
    //GET request for login page 
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    
    //GET request to view the Medical Record 
      
    @RequestMapping(value = {"/medicalFormView"}, method = RequestMethod.GET)
    public String medicalFormView(Model model) {
    	return "medicalFormView";
    }
    
}