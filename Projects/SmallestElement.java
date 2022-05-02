import java.util.Scanner;

/*
 * Devin Bowler
 * 4/22/22
 * This program will find the largest element, smallest element, largest element index,
 * and average of the array.
 */
public class SmallestElement {

	public static void main(String[] args) {
		//Enter ten numbers and store in list.
		System.out.print("Enter ten numbers (Seprated by Spaces): ");
		Scanner input = new Scanner(System.in);

		double[] list = new double[10];
		
		//For loop to store the 10 inputed v
		for(int i = 0; i < 10; i++)
		{
		list[i] = input.nextDouble();
		}
		
		//Call each method and assign its return value to a variable.
		double m = minFind(list);
		double n = maxFind(list);
		double o = averageFind(list);
		double u = maxIndexFind(list);

		//Output each value using the method variables above.
		System.out.println("Min: " + m);
		System.out.println("Max: " + n);
		System.out.println("Max Index: " + u);
		System.out.printf("Average: %.2f", o);
	
			}
	
	//The following are 4 methods that each step through the array 'list'
	//and one method finds the lowest value and stores it, one finds the highest,
	//one finds the highest as well but instead of setting the return value to the
	//index value you just return the index number, and lastly a method that finds the
	//average by adding up all of the numbers in the array and divides them by the array length.
	public static double minFind(double[] list) {
		double m = list[0];
		for(int i=1; i < list.length; i++) {
			if (list[i] < m) {
				m = list[i];
			}
		}
		return m;
	}
	
	public static double maxFind(double[] list1) {
		double n = list1[0];
		for(int i=1; i < list1.length; i++) {
			if (list1[i] > n) {
				n = list1[i];
			}
		}
		return n;
	}
	
	public static double maxIndexFind(double[] list1) {
		double y = list1[0];
		for(int i=1; i < list1.length; i++) {
			if (list1[i] > y) {
				y = i;
			}
		}
		return y;
	}
	
	public static double averageFind(double[] list2) {
		double total = 0;
		double o = list2[0];
		for(int i=1; i < list2.length; i++) {
			total = total + list2[i];
		}
		return total/list2.length;
	}
}
