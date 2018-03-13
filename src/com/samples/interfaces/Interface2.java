package com.samples.interfaces;

public interface Interface2 {

	default void log () {
		System.out.println("Logging from Interface2.");
	}
	
	static void print () {
		System.out.println("Printing from Interface2.");
	}
}
