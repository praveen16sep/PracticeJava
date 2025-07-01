import java.util.Arrays;
import java.util.List;

public class StringNameMaxLengthString {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "watermelon");

        String maxString = strings.stream()
                                  .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                                  .orElse(null); // returns null if the list is empty

        System.out.println("String with max length: " + maxString);
	}

}
