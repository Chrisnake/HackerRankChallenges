package Easy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/migratory-birds/problem
	 * @ParameterInput The first line contains an integer denoting n, the number of birds sighted and reported in the array arr.
     * @ParameterInput The second line describes arr as n space-separated integers representing the type numbers of each bird sighted.
	 */
	
	 public static void main(String[] args) throws IOException 
	 {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		migratoryBirds(arr);
	 }
	 
	 static int migratoryBirds(List<Integer> arr) 
	 {	
		 int maximum = 0, maxPosition = 0;
		 int ary[] = new int[arr.size()];
	        
		 for(int i = 0; i < ary.length; i++ )
		 {
			 ary[arr.get(i)]++; 
		 }
	        
		 for(int i = 0; i < ary.length; i++)
		 {
			 if(ary[i] > maximum) //If the value at array i is greater than the maximum
             {
             maximum = ary[i];
             maxPosition = i;
             }
		 }
		 System.out.println(maxPosition);
		return maxPosition;
	 }
}
