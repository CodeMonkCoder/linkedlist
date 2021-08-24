package com.ldll;

public class tester {

	public static void main(String[] args) {
		String input = "C:\\Users\\Yash.Kumar\\Downloads\\input.txt";
		String output = "C:\\Users\\Yash.Kumar\\Downloads\\output.txt";
		Fileoperations obj = new Fileoperations();

		// step 1
		long start = System.currentTimeMillis();
		obj.simplefilewriter(input);
		long end = System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("Time Taken in Step 1:" + elapsedTime + " ms");

		// step 2
		start = System.currentTimeMillis();
		linkedlist ll = new linkedlist();
		obj.linkedlistwriter(input, ll);
		end = System.currentTimeMillis();
		elapsedTime = end - start;
		System.out.println("Time Taken in Step 2:" + elapsedTime + " ms");

		// step 3
		start = System.currentTimeMillis();
		sorter test=new sorter();
		test.quicksortlist(ll.gethead(),ll.gettail());
		end = System.currentTimeMillis();
		elapsedTime = end - start;
		System.out.println("Time Taken in Step 3:" + elapsedTime + " ms");

		// step 4
		start = System.currentTimeMillis();
		obj.fileoutputwriter(output, ll.gethead());
		end = System.currentTimeMillis();
		elapsedTime = end - start;
		System.out.println("Time Taken in Step 4:" + elapsedTime + " ms");
	}

}
