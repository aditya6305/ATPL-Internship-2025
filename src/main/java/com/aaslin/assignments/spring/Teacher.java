package com.aaslin.assignments.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public  class Teacher implements InitializingBean, DisposableBean {
//	public Teacher() {
//		System.out.println("Teacher constructor");
//	}
//	//xml
//	public void teacherInit()  {
//		System.out.println("Teacher initialized using xml init-method");
//	}
//	public void teacherDestroy() {
//		System.out.println("Teacher is destroyed using xml destroy-mehtod");
//	}
	
	// Interface 
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Teacher initialized using afterPropertySet() ");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Teacher destroyed using destroy() method");
	}
	// Annotations 
	
//	@PostConstruct
//	public void constructTeacher() {
//		System.out.println("Teacher initialized using postConstruct() method");
//	}
//	@PreDestroy
//	public void destroyTeacher() {
//		System.out.println("Teacher initialized using preDestroy() method");
//	}

	
	
}
