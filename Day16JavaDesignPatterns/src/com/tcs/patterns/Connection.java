package com.tcs.patterns;

//Singleton
public class Connection {
	private static Connection conn=null;
	private Connection() {}
	public static Connection getConnection() {
		if(conn == null) {
			conn = new Connection();
			return conn;
		}
		return conn;
	}
}

