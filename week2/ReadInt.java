package week2;

import java.io.*; 

public class ReadInt {

	public static void main(String[] args) {
		BufferedReader wow;
		wow = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Insert value:");
			String inData = wow.readLine();
			System.out.println("inData:" + inData);
			int intData = Integer.parseInt(inData);
			System.out.println("intData:" + intData);
		} catch (Exception ex) {
			// System.out.println("Error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}
}