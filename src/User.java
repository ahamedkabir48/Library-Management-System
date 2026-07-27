public abstract class User {
    private String UserId;
    private String name;
    private String contactInfo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public String getUserId() {
        return UserId;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private String generateUniqueId() {
        return "0";
    }
    public User( String name, String contactInfo)
    {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User other)
    {
        this.UserId = other.UserId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
