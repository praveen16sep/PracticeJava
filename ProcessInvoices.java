package com.java8program;

import java.util.Arrays;
import java.util.Comparator;

public class ProcessInvoices {
	
	
	public static void main(String[] args) {

	      //declare array of invoice objects
	      Invoice[] invoices = {
	        new Invoice(83, "Electric sander", 7, 57.98),
	        new Invoice(24, "Power saw", 18, 99.99),
	        new Invoice(7, "Sledge hammer", 11, 21.50),
	        new Invoice(77, "Hammer", 76, 11.99),
	        new Invoice(39, "Lawn mower", 3, 79.50),
	        new Invoice(68, "Screw driver", 106, 6.99),
	        new Invoice(56, "Jig saw", 21, 11.00),
	        new Invoice(3, "Wrench", 34, 7.50)};

	    /*  System.out.println("\nInvoices mapped to description and invoice amount");
	      Arrays.stream(invoices)
	        .sorted(Comparator.comparing(invoice.getQuantity() * invoice.getPrice()))
	        .map(invoice -> String.format("Description: %-15s     Invoice amount:  $%,6.2f", invoice.getPartDescription(), (invoice.getQuantity() * invoice.getPrice())))
	        .forEach(invoice -> System.out.printf("%s%n", invoice));
*/
}
}
