package com.javacoe;

public class MaxSumSubArraywithSizeK {

	public static void main(String[] args) {
		/* Example
         Input: [2, 1, 5, 1, 3, 2], k=3 
         Output: 9
         Explanation: Subarray with maximum sum is [5, 1, 3].
		 */
		int[] arr= {2, 1, 5, 1, 3, 2};
		int n=arr.length;
		int k=3;

		int summax=0;

		for(int i=0; i+k<=n;i++)
		{
		  int temp=0;
		  
		  for(int j=i; j<i+k; i++)
		  {
		      temp=temp+arr[j];
		  }
		  
		  if(temp>summax)
		  summax=temp; 
		  
		}
		
		System.out.println("summax : "+summax);

	}

}
