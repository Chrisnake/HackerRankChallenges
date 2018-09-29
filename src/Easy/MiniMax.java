package Easy;

import java.io.IOException;
import java.util.Arrays;

public class MiniMax 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/mini-max-sum/problem
	 * @ParameterInput A single line of five space-separated integers.
	 */
	
	public static void main(String[] args) throws IOException 
	{
		 int[] ar = {1, 2, 3, 4, 5}; 
		 miniMaxSum(ar);
	}
	
	static void miniMaxSum(int[] arr) 
	{
		long maximumSum = 0;
		long minimumSum = 0;
		Arrays.sort(arr); //Sorts array from lowest to highest
		for(int i = 4; i > 0; i--)
		{
			maximumSum = maximumSum + arr[i];
		}
		for(int i = 0; i < 4; i++)
		{
			minimumSum = minimumSum + arr[i];
		}
		
		System.out.println("Minimum sum is : " + minimumSum);
		System.out.println("Maximum sum is : " + maximumSum);
    }
}
