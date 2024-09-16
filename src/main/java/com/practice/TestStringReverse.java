package com.practice;

public class TestStringReverse {

	// reverse string using negative loop
	public void getReversedString(String value) {
		
		for(int a=(value.length()-1);a>=0;a--) {
			System.out.print(value.charAt(a));
			}
	}
	// reverse string with reverse() method
	public void getReversedStringWithStringBuilder(String country) {
	
		StringBuilder sb= new StringBuilder(country);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		TestStringReverse obj = new TestStringReverse();
		//obj.getReversedString("United State Of America");
		obj.getReversedStringWithStringBuilder("Bangladesh");
	}
	
}
