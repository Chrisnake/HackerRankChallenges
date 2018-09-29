package Easy;

import java.io.IOException;

public class AVeryBigSum 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/a-very-big-sum/problem
	 * @ParameterInput The first line of the input consists of an integer n. 
     * @ParameterInput The next line contains n space-separated integers contained in the array.
	 */
	
	public static void main(String[] args) throws IOException 
	 {
		 long[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20}; 
		 aVeryBigSum(ar);
	 }
	 
	static long aVeryBigSum(long[] ar) 
	{
		long sum = 0;
		for(long i: ar)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		return (sum);
    }
}
