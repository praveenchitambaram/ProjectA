package com.chainsys.springproject.autowire;

import javax.annotation.PostConstruct;
//import javax.annotation.Resources; //@Resource not working

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation;

public class Car {
	@Autowired
	private Engine petrolEngine;
	@Autowired
	private Wheel alloy;

	public Car() {
		System.out.println(" Car Object created " + hashCode());
	}

	public void start() {
		System.out.println("start AnnotationLc...");
	}

	public void stop() {
		System.out.println("stop AnnotationLc...");
	}

	public void move() {
		alloy.rotate();
	}
}
@Component("SportsCar")
class SportsCar extends Car {
	public SportsCar() {
		System.out.println("sports car object created: "+hashCode());
	}
	@Component("SuvCar")
	class SuvCar extends Car {
		public SuvCar() {
			System.out.println("Suv car object created: "+hashCode());
		}
	}
}