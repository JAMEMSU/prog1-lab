package week1;

import java.util.Scanner;

public class ReceiveData {

	/** * @param args * the command line arguments */
	public static void main(String[] args) {
		System.out.println("ReceiveData.main()"); // Display a message.
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		String name = sc.next();
		String surname = sc.next();
		double mark = sc.nextDouble();
	}
}