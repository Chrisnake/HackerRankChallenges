package Easy;

import java.io.IOException;

public class DiagonalDifference 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen
	 * @ParameterInput The first line contains a single integer n, the number of rows and columns in the matrix arr. 
     * @ParameterInput Each of the next lines describes a row, arr[i]vand consists of n space-separated integers arr[i][j].
	 */
	
	public static void main(String[] args) throws IOException 
	 {
		 int[][] arr = {{1, 20, 1},
				 	    {10, 1, 30}, 
				 	    {1, 10, 1}}; 
		 
		 diagonalDifference(arr);
	 }
	
	static int diagonalDifference(int[][] arr) 
	{
		int d1Sum = 0;
		int d2Sum = 0;
		int d2 = 0;
		for(int i = 0; i < arr.length; i++) //TODO: The diagonals (1) will always have position where [n,n]. The diagonals (2) will always have
		{
			d1Sum = d1Sum + arr[i][i];
		}
		
		for(int i = arr.length; i < 0; i--)
		{
			d2Sum = d2Sum + arr[i][d2];
		}
		d2++;
	
		System.out.println(d1Sum); System.out.println(d2Sum);
		System.out.println(Math.abs(d1Sum + d2Sum));
		return(Math.abs(d1Sum + d2Sum));
    }
}
