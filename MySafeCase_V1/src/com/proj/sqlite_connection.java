package com.proj;
import java.sql.*;

public class sqlite_connection {
	  public static void main( String args[] ) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
	         stmt = c.createStatement();
	         String req = "INSERT INTO Accounts VALUES ('hey', 'Paul');"; 
	         stmt.executeUpdate(req);
	         stmt.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
}
