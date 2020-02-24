package week2;

public class IfStatement {
	public static void main(String[] args) {
		String username = "maTeo";
		String password = "1234";

		if (username != "mateo") {
			System.out.println("Your username has a permission.");
		}

		if (username == "mateo" && password == "1234") {
			System.out.println("You're now logged in.");
		}
	}
}