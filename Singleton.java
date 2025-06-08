package com.javaprogram;

public class Singleton {
	
	private static Singleton s=null;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance() {
	if(s==null)
	{
		s=new Singleton();	
		
	}
	
	return s;
	}
	

}
