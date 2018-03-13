package com.samples.iterable.streams;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ListIterators {

	public static void main(String[] args) {
	
		System.out.println("Parallel stream & Sequential Stream, difference demo: ");
		
		List<String> list = new ArrayList();
		list.add("Sandeep G");
		list.add("Sandeep Gangadhar");
		list.add("Sandeep Ganga");
		list.add("Sandip Gangadhar");
		
		System.out.println("Items in the list: " + list);
	    Stream<String> pstream = list.parallelStream();
	    
	    Stream<String> stream = list.stream();
		
	    System.out.println("\n\nParallel Stream iteration..");
	    pstream.forEach(item -> System.out.println(item));
	    System.out.println("\n\nStream iteration..");
	    stream.forEach(item -> System.out.println(item));
	}
}
