package com.practice;

public class TestTryCatchBlock {
 
	
	public void checked() {
	
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("World");
		
	}
	
	public static void main(String[] args) {
		TestTryCatchBlock obj = new TestTryCatchBlock();
		obj.checked();
		//obj.trycatchblock();
	}
}
