package net.summerProject.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import net.summerProject.model.User;
import net.summerProject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

    //this methods saves the user at registration with encrypted password 
	
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
    //this method is used to uniquely identify the registered user
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
	
	//these two methods are used for validating is the user's password and email are unique

	@Override
	public User findByPassword(String password) {
		return userRepository.findByPassword(password);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}

