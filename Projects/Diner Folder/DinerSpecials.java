import java.util.Arrays;
import java.util.Scanner;

/*
 * Devin Bowler
 * 4/24/22
 * This program will prompt dinner options to a user to complete an order.
 */
public class DinerSpecials {
	
	static int randomS = 0;

	public static void main(String[] args) {
		//Input scanner.
		Scanner input = new Scanner(System.in);
		
		//Set randomS to the result of dailySpecial method which is a random
		//number within the range of the diner special menu.
		randomS = DinnerOrders.dailySpecial(DinnerOrders.menu);
		
		//Ask the user to enter the number correlation to a item of food and print out
		//the menu and speical of the day.
		System.out.println("Welcome to the Diner! Order what # item (in order) you want,\nenter -1 once you're done!: \n");
		System.out.println("Todays Menu: " + Arrays.toString(DinnerOrders.menu));
		System.out.println("Todays Special is: The " + DinnerOrders.menu[randomS] + ", so the " 
		+ DinnerOrders.menu[randomS] + " is $1 cheaper.");
		
		//Variables to hold a loop and total variable.
		double orderTotalOut = 0;
		boolean orderDone = false;
		
		//Accept order inputs until -1 is entered.
		System.out.println("\n\nWhat would you like to order?: ");
		while (orderDone == false) {
			int order = input.nextInt();
			
			if (order == -1) {
				orderDone = true;
				break;
			}
			
			//Checks to see if user number entered is valid, if so it will
			//take the order number and send it through the getMenu, orderItem, and 
			//getReciept methods.
			if (order >= 1 && order <= DinnerOrders.menu.length) {
			String tempOrder = DinnerOrders.getMenu(order);
			String receiptReturn = DinnerOrders.orderItem(order);
			DinnerOrders.getReciept(receiptReturn);
			orderTotalOut = DinnerOrders.getTotal(order);
			System.out.println("You sucessfully ordered " + tempOrder + ".");
			}
			else {
				System.out.println("Invalid number, try again.");
			}
		
			//After all the methods are run it outputs the getReciept variable finalReceipt
			//and the order total, and gives a goodbye message.
		}
		
		System.out.println("\s\s\s\sYour Receipt \n" + DinnerOrders.finalReceipt + "\nTotal: $" + orderTotalOut);
		
		System.out.println("Thanks for dining with us!");
	}

}
