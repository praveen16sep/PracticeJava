package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FequencyEachWord {

	public static void main(String[] args) {
		String sentence = "alex brian charles alex charles david eric david";
		List<String> lst=Arrays.stream(sentence.split(" ")).collect(Collectors.toList());
		
		Map<String, Integer> wordsMapWithCount =lst.stream().collect(Collectors.toMap(Function.identity(), word -> 1, Math::addExact));

		  System.out.println(wordsMapWithCount);
		  System.out.println("--------------------");
		  System.out.println("only the duplicate words and their number of occurences"+'\n');
		Map<String, Integer> dupWordsMapWithCount = wordsMapWithCount.entrySet()
			    .stream().filter(e -> e.getValue() > 1)
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

			System.out.println(dupWordsMapWithCount);
	}

}
