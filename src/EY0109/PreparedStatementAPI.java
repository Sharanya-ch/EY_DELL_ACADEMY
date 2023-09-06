package EY0109;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementAPI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch (ClassNotFoundException e ) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null; 
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Password@M1";
		    conn = DriverManager.getConnection(dbURL);
			if(conn != null) {
				System.out.println("Connection established using connection conn1");
			}
			String query = "UPDATE dept_tab set mgr_id = ? WHERE location_id = ?" ; 
			ps = conn.prepareStatement(query);
			ps.setString(1,"King1");
			ps.setInt(2, 7001);
			
			int rows = ps.executeUpdate();
			
			if(rows != 0) System.out.println("Update completed successfully ");
			else System.out.println("Update could not be done");
			String selectQuery = " SELECT * FROM dept_tab WHERE location_id = ? ";
		    ps = conn.prepareStatement(selectQuery);
		    ps.setInt(1, 7001);
		    
		    rs = ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println(
		    			rs.getInt(1) + "\t" +rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			            }

			        } catch(Exception e) {
			            e.printStackTrace();

}}}