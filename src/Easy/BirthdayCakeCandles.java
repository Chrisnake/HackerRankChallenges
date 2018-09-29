package Easy;

import java.io.IOException;

public class BirthdayCakeCandles 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/birthday-cake-candles/problem
	 * @ParameterInput The first line contains a single integer, n, denoting the number of candles on the cake. 
     * @ParameterInput The second line contains n space-separated integers, where each integer i describes the height of candle i.
	 */
	
	public static void main(String[] args) throws IOException 
	{
		 int[] ar = {1, 2, 3, 5, 5};
		 birthdayCakeCandles(ar);
	}
	
	static int birthdayCakeCandles(int[] ar) 
    {
		int max = 0, count = 0;
		for(int i: ar)
		{
			if(i > max)
			{
				max = i;
			}
		}
		
		for(int i: ar)
		{
			if(i == max)
			{
				count++;
			}
		}
		
		System.out.println(count);
		return(count);
    }
}
