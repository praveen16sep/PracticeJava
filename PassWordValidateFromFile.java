import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 1-2,A,UYAMaaSA
10-12,S,ALJLLSSMSS
3-6,B,HBBKIBBBlibHi
 */
public class PassWordValidateFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> lstring=Arrays.asList("1-2,A,UYAMaaSA", "10-12,S,ALJLLSSMSS", "3-6,B,HBBKIBBBlibHi");
		File file= new File("D:\\fileFolder\\input.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			//while(sc.hasNextLine())
			//{
			// String line =sc.nextLine();
			 //System.out.println("read file "+line);
			//}
		
		
		
		//Iterator<String> itr=lstring.iterator();
		int countcheck;
		
		//while(itr.hasNext())
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			String[] str=s.split(",");
			String ss=str[2];
			char c1=str[1].charAt(0);
			String[] a=str[0].split("-");
			int b =Integer.parseInt(a[0]);
			int cc=Integer.parseInt(a[1]);
			System.out.println("===============");
			
			countcheck= (int) ss.chars().mapToObj(c->(char)c).filter(s1-> s1==c1).count();
			
			if(countcheck>=b && countcheck<=cc)
			{
				System.out.println(s+" is valid password");
				
			}
			else
			{
				System.out.println(s+" not valid password");
			}
			
			
		}
		
	
		

	}

}