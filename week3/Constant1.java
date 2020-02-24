package week3;

public class Constant1 {

	public static void main(String[] args) {
		final float PI = 3.14f;

		int r = 8;

		System.out.println("Circle with radius: " + r);
		System.out.println("Area = " + (PI * r * r));
		System.out.println("Circumference = " + (2 * PI * r));
		System.out.println("Volume = " + (4.0f / 3.0f * PI * r * r * r));
		System.out.println("Surface Area = " + (4.0f * PI * r * r));

		r = 10;
		System.out.println("\nCircle with radius: " + r);
		System.out.println("Area = " + (PI * r * r));
		System.out.println("Circumference = " + (2 * PI * r));
		System.out.println("Volume = " + (4.0f / 3.0f * PI * r * r * r));
		System.out.println("Surface Area = " + (4.0f * PI * r * r));
	}
}
