package edu.usc.zhan643;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection2DB {
	/**
	 * @uml.property  name="username"
	 */
	private String username = "ame505";
	/**
	 * @uml.property  name="password"
	 */
	private String password = "000000";
	//private String database = "users";
	/**
	 * @uml.property  name="conn"
	 */
	public static Connection conn = null;
	public Connection2DB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Can not regisiter MySQL driver!");
			e.printStackTrace();
			System.exit(-1);
		}
		
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", username, password);
		} catch(SQLException e) {
			System.out.println("Can not connect to database: " + username);
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	/**
	 * @return
	 * @uml.property  name="conn"
	 */
	public Connection getConn() {
		return this.conn;
	}
}
