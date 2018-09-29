package Easy;

import java.io.IOException;
import java.util.ArrayList;

public class PalindromeIndex 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/palindrome-index/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
	 * @ParameterInput The first line contains an integer q, the number of queries.  
     * @ParameterInput Each of the next q lines contains a query string Si.
     * @Rules A palindrome is where a String reversed is the same as it is normal.
     * @Notes-----------------------------------------------------------------------------------
	 * 1) Go through the string
	 * 2) We only have to check half of the string to prove if it is palindrome
	 * 3) If string is even, we do length/2 and test that amount of characters. If string is odd we only test length - 1/2, because the middle will always be the same reversed.
	 * 3) If the character at one position is not the same on the other end of the string then it is simply ot a palindrome.
	 * 4) If we check one half and they are the same then it is a palindrome, thus we save time and reduce complexity.
	 * @Notes-----------------------------------------------------------------------------------
	 */
	public static void main(String[] args) throws IOException 
	{
		 palindromeIndex("HeeH");
	}
	
	static int palindromeIndex(String s) 
	{	
		int palindromeIndex = 0;
		if(s.length() % 2 == 0) //If its an odd number, check to see if it is the character that needs to change. 
		{
			char[] halfOne = new char[s.length()/2];
			char[] halfTwo = new char[s.length()/2];
			
			for(int i = 0; i < s.length() / 2; i++) //Add the first half of the string to a char arraylist
			{
				halfOne[i] = s.charAt(i);
				System.out.println("First half of string character: " + s.charAt(i));
			}
			for(int ii = s.length() - 1; ii > s.length() / 2 - 1; ii--) //Add the second half backwards, starting with the last character.
			{
				int inc = 0;
				halfTwo[inc] = s.charAt(ii);
				System.out.println("Second half of string character: " + s.charAt(ii));
				inc++;
			}
			
			 palindromeIndex = compareHalves(s, halfOne, halfTwo);
		}
		
		System.out.println(palindromeIndex);
		return palindromeIndex;
    }
	
	static int compareHalves(String s, char[] halfOne, char[] halfTwo) //Recursive call that continues to be called until successful.
	{
		int Index = 0;
		for(int c = 0; c < s.length(); c++)
		{	
			if(halfOne[c] != halfTwo[c]) //If there is not a match between the both halves
			{
				return(-1);
			}
		}
		return Index;
	}
}
