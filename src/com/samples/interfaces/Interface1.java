package com.samples.interfaces;

public interface Interface1 {

	
	default void log () {
		System.out.println("Logging from Interface1.");
	}
	
	static void print () {
		System.out.println("Printing from Interface1.");
	}
	
}
