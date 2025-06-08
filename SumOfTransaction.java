package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfTransaction {
	
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("2022-01-01", 100),
			    new Transaction("2022-01-01", 200),
			    new Transaction("2022-01-02", 300),
			    new Transaction("2022-01-02", 400),
			    new Transaction("2022-01-03", 500)
			);

			Map<String, Integer> sumByDay = transactions
			                        .stream()
			                        .collect(Collectors.groupingBy(Transaction::getDate,
			                               Collectors.summingInt(Transaction::getAmount)));
			System.out.println(sumByDay);
	}

}
