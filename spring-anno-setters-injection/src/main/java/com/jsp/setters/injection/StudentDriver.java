package com.jsp.setters.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Student student = (Student) applicationContext.getBean("student");
		student.printDetails();

	}

}
