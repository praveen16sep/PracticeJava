package com.javaprogram;

public class ImmutableClass {
	
	public static void main(String[] args) {
		System.out.println("dkask");
		Pancard p=new Pancard("test", "Ram");
		System.out.println(p.getPanCard());
	}

}


final class Pancard
{
private final String panCard ;
public final String cardHolderName;
	
	
	public Pancard(String pan, String cardHolderName) {
		this.panCard=pan;
		this.cardHolderName=cardHolderName;
		
	}
	
	public String getPanCard()	
	{
		return panCard;
		
	}
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	
	public String toString() {
		return "pancard: "+ panCard +" cardholder: "+ cardHolderName;
		
	}
}
