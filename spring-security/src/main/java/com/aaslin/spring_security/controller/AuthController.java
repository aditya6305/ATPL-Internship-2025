//package com.aaslin.spring_security.controller;
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.aaslin.spring_security.model.UserEntity;
//import com.aaslin.spring_security.repository.UserRepository;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
////
//	private final UserRepository userRepository;
//	private final PasswordEncoder passwordEncoder;
//	public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//		this.passwordEncoder=passwordEncoder;
//		this.userRepository=userRepository;
//	}
//
//
//	@PostMapping("/register")
//		public String register(@RequestBody UserEntity user) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		userRepository.save(user);
//		return "user registered successfully";
//	}
//	
//
//     @GetMapping("/user")
//     public String userAccess() {
//         return "Hello User, you are authenticated!";
//     }
//
//     @GetMapping("/admin")
//     public String adminAccess() {
//         return "Hello Admin, only admins can see this!";
//     }
//}
