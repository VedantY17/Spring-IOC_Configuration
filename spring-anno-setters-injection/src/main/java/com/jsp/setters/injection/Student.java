package com.jsp.setters.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private String email;
	private long cno;

	@Value(value = "1234")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "vedant")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "vedant@mail")
	public void setEmail(String email) {
		this.email = email;
	}

	@Value(value = "8104880818")
	public void setCno(long cno) {
		this.cno = cno;
	}

	public Student() {
		System.out.println("object created");
	}

	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(cno);
	}

}
