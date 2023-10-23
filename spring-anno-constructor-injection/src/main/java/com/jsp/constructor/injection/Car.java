package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	int modelnumber;
	String brand;
	String color;
	
	public Car(@Value(value = "123") int modelnumber, @Value(value = "BMW") String brand, @Value(value = "Red") String color) {
		this.modelnumber = modelnumber;
		this.brand = brand;
		this.color = color;
	}
	
	public void printDetails() {
		System.out.println(modelnumber);
		System.out.println(brand);
		System.out.println(color);
	}

}
