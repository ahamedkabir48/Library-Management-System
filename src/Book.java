public abstract class Book implements Lendables{
    private String isbn;
    private String title;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    private String author;
    private boolean isAvailable;

    @Override
    public boolean lend(User user) {

        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println(user.getName() + " borrowed " + title);
            return true;
        }

        return false;
    }

    @Override
    public void returnBook(User user) {

        isAvailable = true;
        System.out.println(user.getName() + " returned " + title);
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
