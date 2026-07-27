//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User student = new Student("Kabir", "kabir@gmail.com");
        User librarian = new Librarian("John", "john@gmail.com");

        student.displayDashboard();
        System.out.println(student.canBorrowBooks());

        librarian.displayDashboard();
        System.out.println(librarian.canBorrowBooks());

        Member member2 = new Member("Kabir", "kabir@gmail.com", 3);

        member2.displayDashboard();
        System.out.println("Can Borrow Books: " + member2.canBorrowBooks());


        Member member = new Member("Mani", "Mani@gmail.com" , 6);
        member.displayDashboard();
        System.out.println("Can Borrow Books: " + member.canBorrowBooks());


    }
}