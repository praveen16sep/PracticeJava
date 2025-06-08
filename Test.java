package com.javacoe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry={1, 2, 3, 4, 5};
		//int[] arry1=arry;
		int length=arry.length;
		//int a=0;
		for(int i=1 ; i< length;i++)
		{
			arry[i]=arry[i-1]+arry[i];
		
		}
		for(int j=0;j<arry.length;j++)
		{
			System.out.println(arry[j]);
		}
		

	}

}
//1,3,6,10,15,

