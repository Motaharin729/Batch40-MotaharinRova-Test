package com.practice;

public class TestEncapsulation {

	private int a;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		
		TestEncapsulation obj = new TestEncapsulation();
		obj.setA(7);
		obj.setName("Ammu");
		System.out.println(obj.getA());
		System.out.println(obj.getName());

	}
	
}
