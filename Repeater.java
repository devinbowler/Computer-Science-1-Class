public class Repeater {

	//This method takes in a string and int and prints out the string
	//aslong as i is less than the passed int value.
	public static void repeat(String input, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(input);
		}
	}
}
