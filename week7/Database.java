package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) {

		Connection connect = null;
		Statement s = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/pro1" + "?user=root&password=");
			
			
			s = connect.createStatement();
			

			String sql = "SELECT * FROM users ";

			ResultSet rec = s.executeQuery(sql);

			while ((rec != null) && (rec.next())) {
				System.out.print(rec.getString("id"));
				System.out.print("-");
				System.out.print(rec.getString("firstname"));
				System.out.print("-");
				System.out.print(rec.getString("lastname"));
				System.out.print("-");
				System.out.print(rec.getString("email"));
				System.out.println("");
			}

	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
