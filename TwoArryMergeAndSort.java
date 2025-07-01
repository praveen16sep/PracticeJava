import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArryMergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,5, 3,6};
		int[] arr2= {2,8, 7,4};

		          int[] sortedMergArry = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				  .sorted().toArray();
		          for(int i=0; i<sortedMergArry.length;i++)
		          {
		        	  System.out.print(sortedMergArry[i]+ " ");
		          }
		        

	}

}
