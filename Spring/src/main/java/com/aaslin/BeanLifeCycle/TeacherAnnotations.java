package com.aaslin.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("teacherAnnotation")
public class TeacherAnnotations {
	
	@PostConstruct
	public void init() {
		System.out.println("\nMethod initialized through annotation");	
	}
	@PreDestroy 
	public void destroy() {
		System.out.println("\nMethod destroyed through annotation");
	}
}
