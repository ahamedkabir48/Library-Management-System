public abstract class User {
    private String UserId;
    private String name;
    private String contactInfo;

    private static int totalUsers = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }


    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public static int getTotalUsers() {
        return totalUsers;
    }

    // Getters
    public String getUserId() {
        return UserId;
    }

    protected final String generateUniqueId() {
        totalUsers++;
        return "USER" + totalUsers;
    }
    public User( String name, String contactInfo)
    {
        this.UserId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User other)
    {
        this.UserId = other.generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
