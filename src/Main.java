//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create two instances of User
        User user1 = new User("John", "Doe", "johndoe@example.com", "password123");
        User user2 = new User("Jane", "Smith", "janesmith@example.com", "password456");

        // Use getters and setters
        System.out.println("User1's first name: " + user1.getFirstName());
        user1.setLastName("Johnson");
        System.out.println("User1's new last name: " + user1.getLastName());

        System.out.println("User2's email: " + user2.getEmail());
        user2.setPassword("newpassword789");
        System.out.println("User2's password changed.");
    }
}

// Separate User class
class User {
    // Private fields for encapsulation
    private String firstName;
    private String lastName;
    private String email;
//    private String password;

    // Constructor
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Setters
//    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
