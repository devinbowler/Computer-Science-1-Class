import java.util.Scanner;

/*
 * Devin Bowler
 * 4-3-2022
 * This program will accept a number of books read and outputs how many 
 * points that is.
 */


public class SummerReading {

	//This is the method for returning the number of points.
    public static int computePoints(int books) {
    	//Here I set points to 0 to start.
        int points = 0;
        //If the number if entered books is less than 5 then the points
        //will equal the number of books.
        if (books <= 5)

            points = books;
        //If the number of books exceed 5 but are lower than 10 then the
        //number of books subtracted by 5 to find the remainder after 5 to
        //then multiply by the 3 points for each book between 5 and 10, then 5
        //is added back.
        else if (books > 5 && books <= 10)

            points = 5 + 3 * (books - 5);

        //Otherwise if the user read over 10 books then the first 5 points
        //are given and then 15 points from 5-10, then the amount of books
        //is taken subtracted by 10 (first 10 books) and multiplied by 5(points).
        else

            points = 5 + 3 * 5 + 5 * (books - 10);

        return points;

    }

    public static void main(String args[]) {

    	//Initialize the scanner.
        Scanner x = new Scanner(System.in);
        //Ask for the number of books read.
        System.out.print("Enter number of books read : ");
        //Gets the next line as an integer.
        int num_books = Integer.parseInt(x.nextLine());
        //Integer points is equal 
        int points = computePoints(num_books);
        //Gets number of points back from the method and displays it.
        System.out.println("Points : " + points);

    }
}
