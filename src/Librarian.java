import java.awt.print.Book;

public class Librarian extends User{

    private String employeeNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Librarian(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayDashboard() {
        System.out.println("This is Librarian Dashboard Employee Number is : " + getEmployeeNumber() );
    }


    @Override
    public boolean canBorrowBooks() {
        return false;
    }
    public void addBook(Book book) {
            //will implement in next module
    }
    public void removeBook(Book book) {
        //will implement in next module
    }
}
