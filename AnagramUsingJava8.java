import java.util.stream.Collectors;

public class AnagramUsingJava8 {
	public static void main(String[] args) {
		 String s1="race";
		 String s2="raec";
		 
		 
		 String sorts1=s1.chars().sorted()
				 .mapToObj(c ->String.valueOf((char) c))
				 .collect(Collectors.joining());
		 String sorts2=s2.chars().sorted()
				 .mapToObj(c ->String.valueOf((char) c))
				 .collect(Collectors.joining());
		 if(sorts1.equals(sorts2))
		 {
			 System.out.println("anagram");
		 }
		 else
		 {
			 System.out.println("Not anagram");
		 }
	}
}