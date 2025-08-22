//package com.aaslin.spring_security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class RoleConfig {
//
//	@SuppressWarnings("removal")
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests(auth -> auth.requestMatchers("/admin/dashboard")
//				.hasRole("ADMIN").requestMatchers("/user/profile").hasRole("USER").anyRequest()
//				.authenticated()).formLogin(form ->form.permitAll()).httpBasic();
//		return http.build();
//	}
//	@Bean
//	public InMemoryUserDetailsManager userDetailsService() {
//		UserDetails admin = User.withUsername("admin")
//				.password("{noop}admin").roles("ADMIN").build();
//		
//		UserDetails user = User.withUsername("aditya")
//				.password("{noop}aditya").roles("USER").build();
//		return new InMemoryUserDetailsManager(admin,user);
//	}
//	
//}
