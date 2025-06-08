package com.TestExample.Exception;

public class MultipleCatch {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		try
		{
			int a=1/0;
			System.out.println(a);
			
		}
		catch(Exception e)
		{
			System.out.println("111111111111");
		}

	}

}
