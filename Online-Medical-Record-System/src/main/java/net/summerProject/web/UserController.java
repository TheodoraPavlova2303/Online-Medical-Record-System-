package net.summerProject.web;


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

@Controller
public class UserController {
	
	private static final String User_Name = "test"; 
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private MRServiceImpl mrServiceImpl; 
    
    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private MedicalRecordValidator mrValidator;
    
   
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
    User_Name = userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
     //   model.addAttribute(User_Name, userService.findById(id));
        userService.save(userForm);
        return "redirect:/welcome";
    }
    
        @RequestMapping(value = {"/medicalFormCreate"}, method = RequestMethod.GET)
    public String welcomeGet(Model model) {
    	model.addAttribute("medicalForm", new MedicalRecord());
        return "medicalFormCreate";
    }
    
    @RequestMapping(value = "/medicalFormCreate", method = RequestMethod.POST)
    public String welcomePost(@ModelAttribute("medicalForm") MedicalRecord medicalForm, BindingResult bindingResult, Model model) {
	mrValidator.validate(medicalForm, bindingResult);
	mrServiceImpl.save(medicalForm, userService.findByUsername((String)model.asMap().get(User_Name)));
    	if(bindingResult.hasErrors() ) {
    		return "medicalFormCreate"; 
    	}
    	return "redirect:/success";
    }
    
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
    return "welcome";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    
    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String about(Model model) { 
    	return "about";
    }
    
    @RequestMapping(value = {"/success"}, method = RequestMethod.GET)
    public String success(Model model) {
    	return "success";
    }
    
    @RequestMapping(value = {"/medicalFormView"}, method = RequestMethod.GET)
    public String medicalFormView(Model model) {
    	return "medicalFormView";
    }
    
    @RequestMapping(value = {"/appointmentBooking"}, method = RequestMethod.GET)
    public String appointmentBooking(Model model) {
    	return "appointmentBooking";
    }
    
}
