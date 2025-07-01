
public class TargetSumOfArray {

	public static void main(String[] args) {
		int[] array={12,7,8,10,6,4,3};
		int target =10;
		
		for(int i=0; i< array.length; i++)
		{
			for(int j=i+1; j< array.length; j++) {
				if(array[i]+array[j]==target)
				{
					System.out.println("index for integers:  "+ i +" ::  "+j);
				}
			}
		}

	}

}
