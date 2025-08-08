package com.aaslin.assignments.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   
	public static void main(String[] args) throws Exception {
//        Lazy loading
//		  BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Student student = (Student) factory.getBean("studentBean");
//        student.displayStudent();
//
//     	  Eager loading
//        System.out.println("hello");	
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//             College college = (College) context.getBean("collegeBean");
//             college.displayCollege();
////             
        ApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
        Teacher t = (Teacher) aac.getBean("teacher");
        t.destroy();
//            
//        @SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Faculty faculty = (Faculty)context.getBean("facultyBean");
//        faculty.showCourse();

		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
////    	Library library = (Library) context.getBean("libraryBean");
////    	library.showBook();
//    	University university =context.getBean("universityBean",University.class);
//    	university.show();
              
    }
}

