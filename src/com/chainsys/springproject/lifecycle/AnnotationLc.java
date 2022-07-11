package com.chainsys.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// not working from java9 and higher versions
public class AnnotationLc {
	public AnnotationLc() {
		System.out.println("AnnotationLc object is created: " + hashCode());
	}

	@PostConstruct
	public void start() {
		System.out.println("start AnnotationLc...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("stop AnnotationLc...");
	}

	public void print() {
		System.out.println("print AnnotationLc called");
	}
}