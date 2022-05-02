import java.util.Scanner;

/*
 * Devin Bowler
 * 4-5-2022
 * This program will take three names of city's in any form and put it 
 * into correct capitalization form.
 */
public class CapitalizeCorrectly {
	//Method for capitalization of the city string.
	 public static String capitalize(String word) {
		 //Take the first letter of String word (which is representing c1-c3).
		 String upper=word.substring(0,1);
		 //Take the remaining letters of String word (which is representing c1-c3).
		 String lower=word.substring(1,word.length());
		 //Convert the first letter to uppercase.
		 upper = upper.toUpperCase();
		 //Convert the remaining letters to lowercase.
		 lower = lower.toLowerCase();
		 //Take these two new sub strings and combined them into a new string called finalWord.
		 String finalWord = upper + lower;
		 //Return finalWord to c1-c3.
		 return finalWord;
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask for three cities and store them into three separate strings.
		System.out.print("Enter the first city name (1/3): ");
		String c1 = input.nextLine();
		
		System.out.print("Enter the second city name (2/3): ");
		String c2 = input.nextLine();
		
		System.out.print("Enter the third city name (3/3): ");
		String c3 = input.nextLine();
		
		//Call the method three times using each city, while setting c1-c3 as the 
		//returned value from the method.
		c1 = capitalize(c1); 
		c2 = capitalize(c2); 
		c3 = capitalize(c3); 	
		
		//Output all three cities in correct capitalization.
		System.out.println("Capitilized First City: " + c1);
		System.out.println("Capitilized Second City: " + c2);
		System.out.println("Capitilized Third City: " + c3);
		
		
	}

}
