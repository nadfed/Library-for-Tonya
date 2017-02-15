package by.htp.library.dao;

public class BookDao {
	private static final String ADD_BOOK = "insert into books(id, brief, publish_year, author) values (?,?,?,?)";
	private static final String UPDATE_BOOK = "update book set brief = ? where brief = ?";
	private static final String DELETE_BOOK = "delete from books where id=?";
	private static final String FIll_EMPLOYEE_BOOK_TABLE = "insert into employee_book (book_id, employee_id, id) values (?, ?, ?)";
}
