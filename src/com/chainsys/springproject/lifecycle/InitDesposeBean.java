package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDesposeBean implements DisposableBean, InitializingBean {
	private String city;
	private String pincode;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called: " + hashCode());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is created");
	}

	public InitDesposeBean() {
		System.out.println("InitDesposeBean object created: " + hashCode());
	}

	public void setUp() {
		System.out.println("starting InitDesposeBean...");
	}

	public void close() {
		System.out.println("closing InitDesposeBean...");
	}

	public void print() {
		System.out.println("InitDesposeBean print called...");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}