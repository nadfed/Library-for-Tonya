package by.htp.library.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

import by.htp.library.dao.BookDao;


public class FillEmployeeBookTable {
	private Connection myConn;
	private Statement myStmt;
public  void fillEmployeeBookTable (){
	
	
	int b = 0; // employee_id at DB
	int a = 0; // book_id at DB
	String fillEmployeeBookQuery = null;
	Random random = new Random();	
	
	try{
myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
myStmt = myConn.createStatement();
for (int i = 1; i<102; i++){
	a = random.nextInt(43)+1;
	b = random.nextInt(11)+1;
	fillEmployeeBookQuery = "insert into employee_book (book_id, employee_id, id) values ("+a+", "+b+", "+i+")";
	myStmt.executeUpdate(fillEmployeeBookQuery);
	}
		
}
catch(Exception exc){
exc.printStackTrace();
}
}		
public void closeConnection() {
    try {
        
        if (myStmt != null) {
        	myStmt.close();
        }
        if (myConn != null) {
            myConn.close();
        }
    } catch (java.sql.SQLException ex) {
        ex.getMessage();
    }
}
}


