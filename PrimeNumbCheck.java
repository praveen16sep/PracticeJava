package com.javaprogram;

public class PrimeNumbCheck {
	
	public static void checkprime(int a) {
       int i, flag=0;
		
		if(a==0 || a==1)
		{
			System.out.println("it is not prime");
		}
		
		for( i=2; i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("It is not prime number");
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("it is prime");
		}
		
		
	}

	public static void main(String[] args) {
		checkprime(9);
		

	}

}
