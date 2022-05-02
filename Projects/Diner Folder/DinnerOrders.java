public class DinnerOrders {

		//We make an array for the diner specials, an array with corresponding prices, and int for the index
		//daily special and a double for the meal total.
		static String menu[] = {"Garden Salad", "Chili Soup", "Chicken Wrap",
						        "Turkey Club", "Fish Basket"};
		
		//An array of the item prices which corrisponding with menu indexs.
		static double itemPrice[] = {4.99, 2.95, 7.99, 8.75, 9.99};
		
		//The following are variables made static so they can be used within the
		//methods and outside of the class if needed.
		static double orderTotal = 0;
		
		static String userOrder;
		
		static String receipt = "";
		
		static String finalReceipt = "";

	//The dailySpecial method gets a random number within the menus range
	//and returns the result to find the special of the day.
	public static int dailySpecial(String[] meals) {
			int random = (int) (Math.random() * meals.length);
			return random;
	}
	
	//The getMenu method is going to take the users number and -1 so the
	//number matches the correct index, then it stores the menus matching string
	//in userOrder and returns it.
	public static String getMenu(int order) {
		userOrder = menu[order - 1];
		return userOrder;
	}
	
	//orderItem takes in the users entered number and uses it to find the
	//corresponding meal and price to then return to receiptReturn.
	public static String orderItem(int itemNumber) {
		receipt += itemNumber + "." + "\s" + menu[itemNumber - 1] + "\t$" + itemPrice[itemNumber - 1] + "\n";
		return receipt;
	}
	
	//The getTotal method takes in the users entered number and finds the corresponding
	//price and keep adding it until done, it checks if the number corresponds with the 
	//daily special number and if so takes $1 off the total then returns it.
	public static double getTotal(int orderTotal1) {
		orderTotal += itemPrice[orderTotal1 - 1];
		if (orderTotal1 == DinerSpecials.randomS + 1) {
			orderTotal = orderTotal - 1;
		}
		else {
			return orderTotal;
			}
		return orderTotal;
	}
	
	//Finally the getReciept method takes in a string which we are using the return
	//of orderItem and we are just re defining it as finalReceeipt to then print out
	//in DinerSpecials.
	public static void getReciept(String receiptReturn) {
		finalReceipt = receipt;
		
	}
	

}
