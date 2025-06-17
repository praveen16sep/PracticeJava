package com.javacoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*apple 1-2 p
banana 2-3 a 
mango 2-3 z 12
grape 1-1 g
Chiku 2-3 z ww*/
public class PasswordvalidateFromFile {
	
	public static void main(String[] args) {
		//File file= new File("C://Users//PraveenKumar//Downloads//fileProg//input.txt");
		List<String> ls1= new ArrayList<String>();
		List<String> ls=Arrays.asList("banana 2-3 a", "apple 1-2 p");
		int countcheck ;
		try {
			Iterator<String> itr=ls.iterator();
			
			//Scanner scanner= new Scanner(file);
			while(itr.hasNext())
			{
				//String[] s=scanner.n().split(" ");
				String[] s=itr.next().split(" ");
				int numbOfString=s.length;
				String ss=s[0];
				
				char c1=s[2].charAt(0);
				System.out.println("char:  "+c1);
				 countcheck =
					 (int) ss.chars().mapToObj(c->(char)c).filter(s1->s1.equals(c1)).count();
				 System.out.println("length: "+numbOfString+" countcheck:: "+countcheck);
				 
				//int charcount= s[]
				if(numbOfString==3 && countcheck>0) {
					System.out.println(">>>>>>>>>");
			   ls1.add(ss);
				}
			}
			System.out.println(ls1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
