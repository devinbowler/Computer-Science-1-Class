import java.util.*;
// Devin Bowler
// March 7th, 2022
// This program will have a 'computer' you are facing in rock paper scissors and you can win lose or draw.
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner to read inputs.
		
		boolean win; //Make a win boolean to set to true or false later.
		int computer = (int)(Math.random() * 3); //Set computer variable to a random number 0-3 to get the computers choice.
		
		System.out.println("Choose one of the following, Rock (0), Paper(1), Scissor(2): "); //Ask user to input their choice.
		int player = input.nextInt(); //Store their choice.
		
		System.out.print("The computer chose ");

		switch (computer) //The computer switch statement changes the output said based on what was randomly picked.
		{
			case 0: System.out.print("Rock."); break;
			case 1: System.out.print("Paper."); break;
			case 2: System.out.print("Scissors.");
		}
		
		System.out.print(" You Chose ");
		switch (player) //The player switch statement changes the output said based on what was chosen by the player.
		{
			case 0: System.out.print("Rock."); break;
			case 1: System.out.print("Paper."); break;
			case 2: System.out.print("Scissors. ");
		}
		
		if (computer == player) //If the computer and player both have the same number it prints their was a draw.
			System.out.println(" It is a draw");
		else //In the else if win is true based on comparing the player and computer number then you win, else you lose.
		{
			win = (player == 2 && computer == 1) ||
							  (player == 0 && computer == 2) || 
							  (player == 1 && computer == 0);
			if (win)
				System.out.println(" You won.");
			else
				System.out.println(" You lose.");
	}
  }

}
