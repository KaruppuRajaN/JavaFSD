package com.tcs.patterns;

public class TestConnection {

	public static void main(String[] args) {
		Connection conn = Connection.getConnection();
		System.out.println(conn);
		Connection conn1 = Connection.getConnection();
		System.out.println(conn1);
		Connection conn2 = Connection.getConnection();
		System.out.println(conn2);
	}

}
