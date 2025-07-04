import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,3,5,2,1,8};
		Set<Integer> pre=new HashSet<Integer>();
		
		for(int i : arr)
		{
			pre.add(i);
		}
		
		int min= Arrays.stream(arr).min().orElse(0);
		int max=Arrays.stream(arr).max().orElse(0);
		
		List<Integer> missingElement=new ArrayList<Integer>();
		for(int j=min; j<=max; j++)
		{
			if(!pre.contains(j))
			{
				missingElement.add(j);
			}
		}
		System.out.println(missingElement);
		

	}

}
