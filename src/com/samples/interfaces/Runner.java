package com.samples.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		Runnable runnable =  ( ) -> {
			System.out.println("Running..");
		};
		runnable.run();
		Interface1 obj1 = new Interface1 () {
			@Override
			public void log() {
				System.out.println("Logging from implementation1.");
			}
		};
		Interface1.print();
		obj1.log();
		System.out.println("\n-------\n");
		Interface2 obj2 = new Interface2() {
		};
		Interface2.print();
		obj2.log();
		
		
	}
}
