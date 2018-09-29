package Easy;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SockMerchant 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/sock-merchant/problem
	 * @ParameterInput The first line contains an integer n, the number of socks represented in ar. 
     * @ParameterInput The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile..
	 */

	 public static void main(String[] args) throws IOException 
	 {
		 int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20}; 
		 sockMerchant(9, ar);
	 }
	 
	 static int sockMerchant(int n, int[] ar) 
	 {
		 Set<Integer> sockSet = new HashSet<>();
		 int pairs = 0;
		 for(int i = 0; i < n; i++)
		 {
			 if(!sockSet.contains(ar[i])) //If the sockSet does not contain the element yet, then add it to the sockset. 
			 {
				 System.out.println("Adding to set :" + ar[i]);
				 sockSet.add(ar[i]); //Therefore add the element into the set
			 }
			 else
			 {
				 pairs++;
				 sockSet.remove(ar[i]); //After declaring there is a pair remove it from the socket.
			 }
		 }
		 System.out.println("Pairs: " + pairs);
		 return(pairs);
	 }
}
