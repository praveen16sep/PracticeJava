package com.javacoe;

public class MaxSumSuarraySzeKUsingSlidWindow {

		// TODO Auto-generated method stub
		 public static int findMaxSumSubarray(int[] arr, int k) {
		        int maxSum = 0;
		        int windowSum = 0;
		        int windowStart = 0;

		        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
		            windowSum += arr[windowEnd]; // Add the next element

		            // Slide the window, we don't need to slide until we hit size k
		            if (windowEnd >= k - 1) {
		                maxSum = Math.max(maxSum, windowSum);
		                windowSum -= arr[windowStart]; // Remove the element going out
		                windowStart++;                 // Slide the window ahead
		            }
		        }

		        return maxSum;
		    }

		    public static void main(String[] args) {
		        int[] arr = {2, 1, 5, 1, 3, 2};
		        int k = 3;
		        int result = findMaxSumSubarray(arr, k);
		        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
		    }

}
