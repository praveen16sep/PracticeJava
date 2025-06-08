package com.javaprogram;

public class AccessSingeltonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();
		System.out.println("a: "+a.hashCode());
		System.out.println("b: "+b.hashCode());
		if(a==b)
		{
			System.out.println("same");
		}
		

	}

}
