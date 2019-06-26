package microBlog;

public class User {

    private String avatarUrl;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    public int userID;

    private static int userCounter = 0;

    public User() { }

    public User(String avatarUrl, String username, String firstName, String lastName, String email) {
        userCounter++;
        this.userID = userCounter;
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "#" + this.userID + "- " + this.username;
//                + "First Name: " + this.firstName + "\n"
//                + "Last Name: " + this.lastName + "\n"
//                + "Avatar URL: " + this.avatarUrl + "\n"
//                + "E-mail address: " + this.email + "\n";
    }
}

