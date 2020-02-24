package week1;

import java.util.Scanner;

/**
 * * The DisplayData class receive student ID, name, surname and mark from the *
 * user.
 */
public class DisplayData {

	/** * @param args * the command line arguments */
	public static void main(String[] args) {
		System.out.println("DisplayData.main()"); // Display a message.

		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		String name = sc.next();
		String surname = sc.next();
		double mark = sc.nextDouble();
		System.out.print("id:" + id + ", name:" + name + ", surname:" + surname + ", mark:" + mark);
	}
}