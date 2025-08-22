package com.aaslin.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aaslin.spring_security.model.UserEntity;
import com.aaslin.spring_security.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	public CustomUserDetailsService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		UserEntity user = userRepository.findByUsername(username)
				.orElseThrow(()->new UsernameNotFoundException("User not found"));
		return User.builder().username(user.getUsername())
				.password(user.getPassword()).roles(user.getRoles()).build();
	}
}
