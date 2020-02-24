package week5;

import java.util.Scanner;

public class IdInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student number:");
		int stdNumb = sc.nextInt();
		
		int[] ids = new int[stdNumb];
		for(int i=0; i<ids.length; i++) {
			System.out.print("ids[" + i + "]:");
			ids[i] = sc.nextInt();
		}
		
		for(int i=0; i<ids.length; i++) {
			System.out.println("-- ids[" + i + "]:" +
					ids[i]);
		}
	}
}
