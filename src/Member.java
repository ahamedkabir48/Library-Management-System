public class Member extends User {

    private int borrowedBooksCount;
    public static final int MAX_BORROW_LIMIT = 5;




    // Parameterized Constructor
    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }


    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }


    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }
    @Override
    public void displayDashboard() {
        System.out.println("This is Member Dashboard and Book Borrowed is : " +getBorrowedBooksCount());

    }
    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
