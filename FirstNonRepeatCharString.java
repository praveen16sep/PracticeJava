import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praveenpkumar";
		
		Map<Character, Long> charCount=s.chars().mapToObj(c->(char)c).
				collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new,  Collectors.counting()));
		
		char ch =
				charCount.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry :: getKey)
		.findFirst().orElse(null);
		System.out.println(ch);

	}

}
