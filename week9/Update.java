package week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/pro1" + "?user=root&password=");
			
			s = connect.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID:");
			String id = sc.next();
			System.out.println("Enter Firstname:");
			String firstname = sc.next();
			System.out.println("Enter Lastname:");
			String lastname = sc.next();
			System.out.println("Enter Email:");
			String email = sc.next();
			
			String sql = "UPDATE users SET firstname = '"+firstname+"'"
					+ ",lastname='"+lastname+"',email='"+email+"' WHERE id = "+id+"";
			

			
			int rec = s.executeUpdate(sql);
			if(rec == 1) {
				System.out.println("Update User Success !!");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
