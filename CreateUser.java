package microBlog;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUser {

    Scanner keyboard = new Scanner(System.in);

    public User createUserInformation() {
        System.out.println("Type your new username: ");
        String username = keyboard.nextLine();
        System.out.println("Avatar URL: ");
        String avatarUrl = keyboard.nextLine();
        System.out.println("First Name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Last Name: ");
        String lastName = keyboard.nextLine();
        System.out.println("E-mail address: ");
        String email = keyboard.nextLine();
        User newUser = new User(avatarUrl, username, firstName, lastName, email);
        return newUser;
    }

    public User createNewUser(ArrayList<User> list) {
        User newUser = createUserInformation();
        addUserToList(list, newUser);
        return newUser;
    }

    public void addUserToList(ArrayList<User> list, User newUser) {
        list.add(newUser);
    }

}
