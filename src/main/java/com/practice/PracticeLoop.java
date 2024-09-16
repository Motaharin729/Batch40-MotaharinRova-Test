package com.practice;

public class PracticeLoop {		
	public void TestLoop() {
		 System.out.println("Positive Looping");
		 // printing value from 1 to 10
		 int a;
		 for(a=1;a<=10;a++) //incremental condition ++ = a+1
		 {
			 System.out.println("value "+ a);
		 }	 
		 // print 5 to 1
		 System.out.println("Negative  Looping");
		 for(int b=5;b>=1;b--) // condition -- = b-1
		 {
			 System.out.println("B "+ b);
		 }	 	
	}
	public static void main(String[] args) {
		PracticeLoop obj = new PracticeLoop();
		obj.TestLoop();
	}
}
