public class Librarian extends User{
    public Librarian(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian");
    }


    @Override
    public boolean canBorrowBooks() {
        return false;
    }
}
