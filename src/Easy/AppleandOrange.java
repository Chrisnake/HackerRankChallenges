package Easy;
import java.io.IOException;

public class AppleandOrange 
{
	/**
	 * @HackerRankLink https://www.hackerrank.com/challenges/apple-and-orange/problem
	 * @ParameterInput s: integer, starting point of Sam's house location.
	 * @ParameterInput t: integer, ending location of Sam's house location.
	 * @ParameterInput a: integer, location of the Apple tree.
	 * @ParameterInput b: integer, location of the Orange tree.
	 * @ParameterInput apples: integer array, distances at which each apple falls from the tree.
	 * @ParameterInput oranges: integer array, distances at which each orange falls from the tree.
	 */
	
	 public static void main(String[] args) throws IOException 
	 {
		
	 }
	 
	// Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {
    	int[] apple = distanceTree(a, apples); //Calculate apples distances from the apple tree
    	int[] orange = distanceTree(b, oranges); //Calculate oranges distances from the orange tree
    	
    	int appleCount = 0;
    	int orangeCount = 0;
    	
    	for(int i = 0; i < apple.length; i++)
    	{
    		if(apple[i] > s && apple[i] < t)
    		{
    			appleCount++;
    		}
    	}
    	
    	for(int ii = 0; ii < orange.length; ii++)
    	{
    		if(orange[ii] > s && orange[ii] < t)
    		{
    			orangeCount++;
    		}
    	}
    	
    	System.out.println(appleCount);
    	System.out.println(orangeCount);
    }
	
    static int[] distanceTree(int tree, int[] fruit) //Calculates the distance from the tree that the fruit drops at.
    {
    	int[] distances = new int[fruit.length];
    	for(int i = 0; i < fruit.length; i++)
    	{
    		distances[i] = tree + fruit[i];
    	}
    	
    	return distances;
    }
    
}
