package com.practice;

public class TryUnchecked {
	
	int a = 3;
	int b;
	public void unchecked() {
		System.out.println(a);
		try {
			b = a/0;		
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("there is an exception");
		}
		System.out.println(b);
	}
	public void interchange() {
		//string to int
		String str = "123";
		int num = Integer.parseInt(str);
		System.out.println(num); // Output: 123
		
		// int to string
		int num2 = 42;
		String str2 = String.valueOf(num2);
		System.out.println(str2); 
		//2. Integer.toString()

		int num3 = 177;
		String str3 = Integer.toString(num3);
		System.out.println(str3); 
		
		int num4 = 99;
		String str4 = String.format("%d", num4);
		System.out.println(str4); 
	}
	
	public static void main(String[] args) {
		TryUnchecked obj = new TryUnchecked();
		obj.unchecked();
		obj.interchange();
	
	}
}
