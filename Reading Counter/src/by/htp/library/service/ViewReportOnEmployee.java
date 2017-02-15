package by.htp.library.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class ViewReportOnEmployee {

	public void employeeReadMoreOneBook(){
		String query = null;
		System.out.println();
		System.out.println("Report 1:");
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
			Statement myStmt = myConn.createStatement();
			ResultSet myRes = myStmt.executeQuery ("select employee.name, count(distinct(book_id)) AS Has_books from employee join employee_book on employee.id = employee_book.employee_id group by name having count(distinct(book_id)) > 1");

			while(myRes.next()){
				System.out.println("Employee: " + myRes.getString("employee.name")+ ", " + "Read Books: " + " " + myRes.getString("Has_books") );
			}
			
			
		}
catch(Exception exc){
	exc.printStackTrace();
}
		
	}
	
	public void employeeReadTwoBook(){
		System.out.println();
		System.out.println("Report 2:");
		
		String query = null;
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
			Statement myStmt = myConn.createStatement();
		
	ResultSet myRes1 = myStmt.executeQuery ("select employee.name, employee.date_of_birth, count(distinct(book_id)) AS Has_books from employee join employee_book on employee.id = employee_book.employee_id group by name having count(distinct(book_id)) <= 2");

	while(myRes1.next()){
		System.out.println("Employee: " + myRes1.getString("employee.name")+ ", " +" DOB: " + myRes1.getString("employee.date_of_birth")+ "," + "Read Books: " + " " + myRes1.getString("Has_books") );
	}
	}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
}
	

