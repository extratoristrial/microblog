package microBlog;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    CreateUser createU = new CreateUser();
    CreatePost createP = new CreatePost();
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Post> postList = new ArrayList<>();

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome!");
        displayMenu();
        int selection;
        selection = keyboard.nextInt();
        keyboard.skip("\n");
        if (selection != 0) {
            processSelection(selection);
        }
    }

    public void displayMenu() {
        System.out.println("Main menu\n" +
                "1) Create New User\n" +
                "2) Post as existing user\n" +
                "3) Print all posts\n" +
                "4) Print all users\n" +
                "0) Quit\n");
        System.out.println("What would you like to do?");
    }

    public void processSelection(int selection) {
        switch (selection) {
            case 1:
                createU.createNewUser(userList);
                run();
                break;
            case 2:
                chooseUser();
                User currentUser = currentUser();
                createP.createPost(postList, currentUser);
                run();
                break;
            case 3:
                viewPosts();
                run();
                break;
            case 4:
                viewUsers();
                run();
                break;
        }
    }

    public void viewPosts() {
        for (Post post : postList) {
            System.out.println("------------------------------------------");
            System.out.println(post.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("\n");
    }

    public void viewUsers() {
        for (User user : userList) {
            System.out.println("------------------------------------------");
            System.out.println(user.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("\n");
    }


    public void chooseUser() {
        System.out.println("To create a post, you must first choose a user. Choose a user by typing the number next to the username below, or type 'new' to create a new user.");
        viewUsers();
    }

    public User currentUser() {
        User currentUser;
        Scanner keyboard = new Scanner(System.in);
        String selectionString = keyboard.nextLine();
        if (selectionString.contains("new".toLowerCase())) {
            currentUser = createU.createNewUser(userList);
        } else {
            int selectionNum = Integer.parseInt(selectionString) - 1;
            currentUser = userList.get(selectionNum);
        }
        return currentUser;
    }

}
