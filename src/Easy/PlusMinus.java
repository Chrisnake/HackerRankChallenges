package Easy;

import java.io.IOException;
import java.text.DecimalFormat;

public class PlusMinus 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/plus-minus/problem
	 * @ParameterInput The first line contains an integer, n, denoting the size of the array. 
     * @ParameterInput The second line contains  space-separated integers describing an array of numbers 
	 */

	public static void main(String[] args) throws IOException 
	{
		 int[] ar = {10, 20, 20, 10, 10, 30, 50, 0, -20}; 
		 plusMinus(ar);
	}
	
	static void plusMinus(int[] arr) 
	{
		float positiveCount = 0, negativeCount = 0, zeroCount = 0;
		for(int check: arr)
		{
			if(check > 0)
			{
				positiveCount++;
			}
			else if(check == 0)
			{
				zeroCount++;
			}
			else if(check < 0)
			{
				negativeCount++;
			}
		}
		
		System.out.println(positiveCount / arr.length);
		System.out.println(negativeCount / arr.length);
		System.out.println(zeroCount / arr.length);
	}
	
}
