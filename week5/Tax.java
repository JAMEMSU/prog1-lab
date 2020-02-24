package week5;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		int numb = 3;
		int[] ids = new int[numb];
		String[] names = new String[numb];
		String[] surnames = new String[numb];
		double[] incomes = new double[numb];
		double[] taxes = new double[numb];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("numb:" + numb);
		for(int i=0; i<ids.length; i++) {
			System.out.println((i+1) + "/" + numb + "...");
			System.out.print("id:");
			ids[i] = sc.nextInt();
			System.out.println("name:");
			names[i] = sc.next();
			System.out.println("surname:");
			surnames[i] = sc.next();
			System.out.print("income:");
			incomes[i] = sc.nextDouble();
		}
		
		for(int i=0; i<ids.length; i++) {
			double tax = 0;
			if(incomes[i] < 150000) {
				taxes[i] = 0;
			} else if(incomes[i] < 300000) {
				taxes[i] = (incomes[i]-300000) * 1.15;
			} else if(incomes[i] < 500000) {
				taxes[i] = 150000*1.15 + 
						(incomes[i]-500000) * 1.2;
			} else if(incomes[i] < 750000) { 
				taxes[i] = 150000*1.15 +
						200000*1.2 +
						(incomes[i]-750000) * 1.3;
			} else if(incomes[i] < 1000000) {
				taxes[i] = 150000*1.15 +
						200000*1.2 +
						250000*1.3 +
						(incomes[i] - 750000) * 1.4;
			} else {
				taxes[i] = 150000*1.15 +
						200000*1.2 +
						250000*1.3 +
						250000*1.45 +
						(incomes[i] - 1000000) * 1.6;
			}
		}
		
		System.out.print("no\t|\t");
		System.out.print("\tid\t");
		System.out.print("\tname\t");
		System.out.print("\tsurname\t");
		System.out.print("\tincome\t");
		System.out.println("\ttax\t");
		for(int i=0; i<ids.length; i++) {
			System.out.println("\t" + i + "\t|" +
					"\t" + ids[i] + "\t|" +
					"\t" + names[i] + "\t|" +
					"\t" + surnames[i] + "\t|" +
					"\t" + incomes[i] + "\t|" +
					"\t" + taxes[i] + "\t|");
			
		}
	}
}
