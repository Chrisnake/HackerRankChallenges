	package Easy;
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	public class CompareTheTriplets 
	{

	    static protected int alice = 0;
	    static protected int bob = 0;
	    
	     // Complete the compareTriplets function below.
	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
	    {   
	       List<Integer> finalScore = new ArrayList<Integer>();
	       checkWin(tripletsLogic(a.get(0), b.get(0)));
	       checkWin(tripletsLogic(a.get(1), b.get(1)));
	       checkWin(tripletsLogic(a.get(2), b.get(2)));
	       finalScore.add(alice);
	       finalScore.add(bob);
	       
	       return finalScore;
	    }
	    
	    static int tripletsLogic(int a, int b)
	    {
	    	int logic = 0;
	        if(a > b)  
	        {
	        	logic = 1; //if alice score is more than bobs return 1, therfore alice wins the point
	        }
	        
	        else if(a < b) //if bobs score is better then return 2
	        {
	        	logic = 2;
	        }
	        
	        else if(a == b)
	        {
	        	logic = 0;
	        }
	        else
	        {
	        	logic = 99;
	        }
			System.out.println(logic);
	        return logic;
	    }
	    
	    static void checkWin(int check)
	    {
	        if(check == 1)
	        {
	            alice++;
	        }
	        if(check == 2)
	        {
	            bob++;
	        }
	    }

	    public static void main(String[] args) throws IOException 
	    {
	    	tripletsLogic(2, 3);
	    }
	}
