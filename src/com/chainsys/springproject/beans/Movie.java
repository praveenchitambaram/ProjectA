package com.chainsys.springproject.beans;

public class Movie {
	public String title;
	public String director;
	public Movie(String filmtitle, String filmdirector) {
		// this.title=title; // this.title is global variable, and title is local variable
		title = filmtitle; // this is similar to this.title=filmtitle , but using this. prefix is not compulsary
		director = filmdirector; // this is similar to this.director=filmdirector , but using this. prefix is not compulsary
		// as there are no local variables by name title, or director so here they will implicitly refer to global variable
		// note : if title and director are not globally declare then it will be undeclared variable cannot be resolved a variable 
		// if the parameter names are similar to the global variables
		// then there is an ambiguity between the local variable (parameter) and global variable
		// hence this, prefix is used for referring the global variable 
		// title title will be referring the local variable on both side of the = operator (x=x) self assigning
		System.out.println(title);
		System.out.println(director);
	}
}