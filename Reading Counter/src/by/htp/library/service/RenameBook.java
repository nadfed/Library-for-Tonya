package by.htp.library.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class RenameBook {
	
public void renameBook(){
	
	System.out.println("enter title of the book that you want to rename:");
	Scanner sc = new Scanner(System.in);
	String exBrief = sc.nextLine();
	System.out.println("enter new title of the book:");
	String newBrief = sc.nextLine();
	try{
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		Statement myStmt = myConn.createStatement();
		String query = "update book set brief = ? where brief = ?";
		PreparedStatement preparedStmt = myConn.prepareStatement(query);
	      preparedStmt.setString   (1, newBrief);
	      preparedStmt.setString(2, exBrief);
	      preparedStmt.executeUpdate();
	      String query2 = "select * from book where brief = '" + newBrief +"'";
	     ResultSet myRes3 = myStmt.executeQuery(query2);
	     int index = 0;
	      while (myRes3.next()){
	    	  System.out.println("Book is updated");  
	    	  index++;
	      }
	      if (index ==0){
	    	  System.out.println("No book with title " + exBrief + " in the Database.");  
	      }
	}
	catch(Exception exc){
		exc.printStackTrace();
	}
	
}
}
