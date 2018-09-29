package Easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SickTravellers 
{
	protected static int day = 1;
	protected static String[] names;
	protected static Set<String> PicadillySet = new HashSet<>();
	protected static Set<String> UxbridgeSet = new HashSet<>();
	protected static Set<String> SalsburySet = new HashSet<>();
	
	 static String[] traceDisease(String[] initialStates) 
	 {
		 //INPUT "Wilson SICK PaloAlto PaloAlto PaloAlto DC DC London PaloAlto"
		 getNames(initialStates); //Gets the names of the users in the initial states.
		 
		 //FIRST CHECK THE NAME, AND THEN SEE THE OFFICE THEY ARE IN FOR THE DAY. DAY 1 == PaloAlto
		 //THEN CHECK TO SEE WHO ELSE IS IN THE SAME OFFICE, THEN CHECK THEIR STATES
		 //IF ANY MEMBERS STATE IS SICK OR RECOVERING THEY BECOME SICK
		 for(int i = 0; i < initialStates.length; i++)  //Goes through every user and determine their office location depending on the day
		 {
			if(getOffice(day,getUser(i, initialStates)).equals("Picadilly")); //GETS THE OFFICE OF THE USER DEPENDING ON THE DAY. works on predetermined locations for now..
			{
				boolean illness = false;
				while(!illness) //while the illness boolean is false, check to see if there are any users in the array from the picadilly office are ill. 
				{
					//IF ONE PERSON IS ILL (If one person in the office at the specific day is ill or recovering) THEN MAKE ILLNESS BOOLEAN TRUE
					//illness = true;
					//If they are 
				}
				
				if(illness == true)
				{
					//GET THE USERS FROM THE PICADILLY ARRAY AND CHANGE THEIR STATE TO SICK IF THEY WERE HEALTHY, AND DO NOTHING IF THEY WERE RECOVERING.
				}
			}
			if(getOffice(day,getUser(i, initialStates)).equals("Uxbridge"));
			{
				boolean illness = false;
				while(!illness) //while the illness boolean is false, check to see if there are any users in the array from the picadilly office are ill. 
				{
					 
				}
			}
			if(getOffice(day,getUser(i, initialStates)).equals("Salsbury"));
			{
				boolean illness = false;
				while(!illness) //while the illness boolean is false, check to see if there are any users in the array from the picadilly office are ill. 
				{
					 
				}
			}
		 }
	 }
	 
	 static String[] getUser(int user, String[] initialStates) //Returns the string of the user at position 
	 {
		 String userString = initialStates[user];
		 String[] splitUser = userString.split(" ");
		 return splitUser; //This returns the values from String array, NAME = 0, STATE = 1, LOCATIONS TO GO TO = 3;
	 }
	 
	 static String getState(String[] userSplit) //Returns the state of the user using the split string from each iteration of initialstates.
	 {
		 return(userSplit[1]);
	 }
	
	 static void getNames(String[] initialStates) //Returns the string of the user at position 
	 {
		 for(int i = 0; i < initialStates.length; i++)
		 {
			 String userString = initialStates[i];
			 String[] splitUser = userString.split(" ");
			 names[i] = splitUser[0];
		 }
	 }
	 
	 static String getOffice(int whatDay, String[] userDetails) //RETURNS THE LOCATION OF THE USER AT A CERTAIN DAY.
	 {
		 String office = userDetails[whatDay]; //This returns the location that the user is at at the day chosen in the parameter 
		 return(office);
	 }
}
