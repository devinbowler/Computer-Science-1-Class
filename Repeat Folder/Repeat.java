import java.util.Scanner;

/*
 * Devin Bowler
 * 4/20/22
 * This program will take in a string and number or a number and number
 * and repeat the string or number as many times as the second number is.
 */
public class Repeat {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Take an input for a number or word as a string, then take in the number of times to print the string.
		System.out.println("Enter a word or number: ");
		String firstInput = input.nextLine();
		System.out.println("Enter the amount of times you want to repeat the word or number: ");
		int secondInput = input.nextInt();
		
		//Call the method with the two inputs as arguments.
		Repeater.repeat(firstInput, secondInput);
	}

}
