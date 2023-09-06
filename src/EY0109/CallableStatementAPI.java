package EY0109;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallableStatementAPI {
	static {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn = null; 
	CallableStatement stmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			
			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Password@M1";
		    conn = DriverManager.getConnection(dbURL);
			if(conn != null) {
				System.out.println("Connection established using connection conn1");
			}
			
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee name");

			String empName = sc.nextLine();
			System.out.println("Enter employee role");
			String empRole = sc.nextLine();
			System.out.println("Enter employee city");
			String empCity = sc.nextLine();
			System.out.println("Enter employee Country");
			String empCountry = sc.nextLine();
			
			stmt = conn.prepareCall("{call insertemployee2(?,?,?,?,?,?)}");
			stmt.setInt(1,id);
			stmt.setString(2,empName);
			stmt.setString(3,empRole);
			stmt.setString(4,empCity);
			stmt.setString(5,empCountry);
			
			stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
			stmt.executeUpdate();
			String result = stmt.getString(6);
			
			System.out.println("Employee record save success:" +result);
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			        try {
			            stmt.close();
			            conn.close();
			            sc.close();
			        }catch(SQLException e) {
			            e.printStackTrace();

			        }

			    }
			
		}
}
