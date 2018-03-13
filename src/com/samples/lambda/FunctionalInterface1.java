package com.samples.lambda;

@FunctionalInterface 
public interface FunctionalInterface1 {
	void run();
	
	default void runner() {
		System.out.println("FunctionalInterface1.runner()");
		//run();
	}
	
	static void staticRunner() {
		System.out.println("FunctionalInterface1.staticRunner()");
	}
}
