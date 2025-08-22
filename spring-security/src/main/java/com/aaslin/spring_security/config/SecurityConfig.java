package com.aaslin.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.aaslin.spring_security.service.CustomUserDetailsService;

@Configuration
public class SecurityConfig {
	private final CustomUserDetailsService customUserDetailsService;
	public SecurityConfig (CustomUserDetailsService customUserDetailsService) {
		this.customUserDetailsService=customUserDetailsService;
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public DaoAuthenticationProvider authentication() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customUserDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) 
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/register","/public/**").permitAll() 
                .anyRequest().authenticated()         
            )
            .formLogin(form -> form
            		.permitAll()
            )
            .logout(logout -> logout
                .permitAll()
            );

        return http.build();
        
    }
	
	
//	//Security rules who can access which end point.
//	@Bean
//	//authorizeHttpRequests()- Authorization decides access per reuqest 
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//		/*auth -> auth.requestMatchers("hello").permitAll() .anyRequest().authenticated())- In the below line it says that except the end point 
//		 * /hello all other requests needs to be login before get into that endpoint.
//		*/
//		//formLogin(form -> form.permitAll()) - It enables springs default login page.
//		http.authorizeHttpRequests(auth -> auth.requestMatchers("hello").permitAll() .anyRequest().authenticated()).formLogin(form -> form.permitAll());
//		return http.build();
//	}
//	@Bean
//	public InMemoryUserDetailsManager userDetailsService() {
//		//noop means no encoding and roles means autority.without noop spring will throw the error like there is no passwordEncoder is mapped.
//		
//		//withUsername() - It creates a user builder with a specific username and returns to userbuilder 
//		
//		// UserBuilder is a final class so we cannot inherited it.
//		
//		// User implement user details here so the methods in the UserDetails can be used in the User.
//		UserDetails user = User.withUsername("aditya").password("{noop}12345").roles("USER").build();
//		//After login spring stores the user details into the spring securit context.
//		return new InMemoryUserDetailsManager(user);
//	}
//	
	

}
