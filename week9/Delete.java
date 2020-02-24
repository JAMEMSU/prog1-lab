package week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

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
			
			String sql = "DELETE FROM users WHERE id = "+id+"";
			
			int rec = s.executeUpdate(sql);
			if(rec == 1) {
				System.out.println("Delete User Success !!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
