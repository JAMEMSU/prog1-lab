package week3;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		for(int i=1; i<=12; i++) {
			System.out.println(i + "x" + num + "=" + (i*num));
		}
	}
}
