package by.htp.library.controller;
import by.htp.library.service.FillEmployeeBookTable;
import by.htp.library.service.RenameBook;
import by.htp.library.service.ViewReportOnEmployee;

public class Main {

	public static void main(String[] args) {
		try{
			FillEmployeeBookTable ft = new FillEmployeeBookTable();
			ViewReportOnEmployee vr = new ViewReportOnEmployee();
			RenameBook rn = new RenameBook();
			//ft.fillEmployeeBookTable();
			vr.employeeReadMoreOneBook();
			vr.employeeReadTwoBook();
			//rn.renameBook();
			//ft.closeConnection();
		}
catch(Exception exc){
	exc.printStackTrace();
}
	}		
}
	
