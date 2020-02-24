package week6;

import java.util.Scanner;

public class Grader {
	public static void main(String[] args) {
		int id = getIDInt();
		// int id = getIDString();
		double mark = getMarkDouble();
		// double mark = getMarkString();
		char grade = decideGrade(mark);
		System.out.println("grade:" + grade);
	}
	
	public static double getMarkString() {
		
		double mark = -1;
		while(mark < 0 || mark > 100) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Mark:");
				String strmark = sc.next();
				mark = Double.parseDouble(strmark);
				sc.reset();
			}catch(Exception ex) {
				System.out.println("Error! " 
						+ ex.getMessage());
			}
		}
		return mark;
	}

	
	public static double getMarkDouble() {
		double mark = -1;
		while(mark < 0 || mark > 100) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Mark:");
				mark = sc.nextDouble();
				sc.reset();
			}catch(Exception ex) {
				System.out.println("Error! " 
						+ ex.getMessage());
			}
		}
		return mark;
		
	}
	public static int getIDInt() {
		int id = -1;
		while(id < 0 || id > 100) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter ID:");
				id = sc.nextInt();
				sc.reset();
			}catch(Exception ex) {
				System.out.println("Error! " 
						+ ex.getMessage());
			}
		}
		return id;
		
	}
	
	public static int getIDString() {
		
		int id = -1;
		while(id < 0) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter ID:");
				String strid = sc.next();
				id = Integer.parseInt(strid);
				// double id = Double.parseDouble(strid);
				sc.reset();
			}catch(Exception ex) {
				System.out.println("Error! " 
						+ ex.getMessage());
			}
		}
		return id;
	}
	
	public static char decideGrade(double mark) {
		char grade = ' ';
		if(mark < 50) {
			grade = 'F';
		} else if(mark < 60) {
			grade = 'D';
		} else if(mark < 70) {
			grade = 'C';
		} else if(mark < 80) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		return grade;
	}
}
