import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecondRepeatedCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Helelo Worldd";
		
		Map<Character, Long> countchar=input.chars().
				mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
	Optional<Character> op=countchar.entrySet().stream().filter(entry->entry.getValue()>1)
			//.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			
			.map(Map.Entry::getKey).skip(1).findFirst();
	System.out.println(op.orElse(null));
			
		

	}

}
