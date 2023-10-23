package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value(value = "102")
	int id;
	@Value(value = "vedant")
	String name;
	@Value(value = "ved@mail")
	String email;

	public Employee() {
		System.out.println("object created");
	}

	public void printEmpDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
