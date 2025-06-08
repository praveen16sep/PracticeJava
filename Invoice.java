package com.java8program;
public class Invoice {

   private final int partNumber; 
   private final String partDescription;
   private int quantity;
   private double price;

   // constructor
   public Invoice(int partNumber, String partDescription, int quantity, double price) {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      if (price < 0.0) // validate price
         throw new IllegalArgumentException("Price per item must be >= 0");

      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.quantity = quantity;
      this.price = price;
   } // end constructor

//get and set accessors 

}