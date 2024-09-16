package com.practice;

public class TestAnimal extends TestAbstract {
	
	public String s1 = "Tiger";
	public String s2 = "Dog";
	protected String s3 = " eats";
	private static String s4 = "Orange with black strips";
	//default String s5= "white with black dots";
	
	@Override
	public void color() {
		
		System.out.println(this.s1+ " color is  "+TestAnimal.s4 );
	}


	@Override
	public void sound() {
		
		System.out.println(this.s1 + " Roar");
	}

	
	public void eat() {
		System.out.println(this.s2 + this.s3+" bone");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is abstraction method overriding");
		
		TestAnimal obj = new TestAnimal();
		obj.sound();
		obj.eat();
		System.out.println(s4);
		obj.color();
		
	}
	
}
