package com.chainsys.springproject.beans;

public abstract class MainCourse {
	public String name;
}

class SouthIndian extends MainCourse {
	public SouthIndian() {
		name = "Rice";
	}
}

class NorthIndian extends MainCourse {
	public NorthIndian() {
		name = "Chapatti";
	}
}

class Chinese extends MainCourse {
	public Chinese() {
		name = "Noodels";
	}
}