package com.aaslin.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TeacherInterfaces implements InitializingBean, DisposableBean {
	
	@Override
	public void destroy() {
		System.out.println("\nMethod destroyed through DisposableBean interface");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\nin afterProperties method through InitializingBean");
	}
}
