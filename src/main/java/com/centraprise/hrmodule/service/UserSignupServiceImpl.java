package com.centraprise.hrmodule.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.model.Role;
import com.centraprise.hrmodule.model.User;
import com.centraprise.hrmodule.model.UserRegistration;
import com.centraprise.hrmodule.repository.UserRepository;

@Service
public class UserSignupServiceImpl implements UserSignupService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;

	@Override
	public User findByusername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User save(UserRegistration registration) {

		User user = new User();
		user.setUsername(registration.getUsername());
		user.setPassword(bcryptPasswordEncoder.encode(registration.getPassword()));
		Set<Role> roles = new HashSet<>();
		Role role = new Role();
		role.setRolename("admin");
		roles.add(role);
		user.setRoles(roles);
		return userRepository.save(user);
	}

}
