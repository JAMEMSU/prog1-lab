package week3;

public class Mult2 {
	public static void main(String[] args) {
		for(int i=1; i<=12; i++) {
			for(int j=2; j<=12; j++) {
				System.out.print(j + "x" + i + " = " + (i*j) + " | ");
			}
			System.out.println();
		}
	}
}
