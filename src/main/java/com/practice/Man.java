package com.practice;

public interface Man extends TestInterfaceHuman,Woman  {
	public String   x= "Multiple level inheritance in Interface ";
	
	public default void name() {
		System.out.println("Teacher name is  Rezwan");
	}
	
	public static void main(String[] args) {
		System.out.println(x);
	
	}
	

}

