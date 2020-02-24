package week2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		String name = sc.next();
		String desc = sc.next();
		double price = sc.nextDouble();
		System.out.println(
				"id:" + id
				+ ", name:" + name
				+ ", desc:" + desc
				+ ", price:" + price
				);
	}

}
