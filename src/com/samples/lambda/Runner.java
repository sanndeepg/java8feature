package com.samples.lambda;

public class Runner {

	public static void main(String[] args) {
		
		FunctionalInterface1 interface1 = () -> {
			FunctionalInterface1.staticRunner();
			System.out.println("Start, \nRunning, \nEnded.");
		};
		
		interface1.run();
	}
	
}
