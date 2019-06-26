package microBlog;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePost {

    public Post createPost(ArrayList<Post> list, User user) {
        Post newPost = createPostContent(user);
        addPostToList(list, newPost);
        return newPost;
    }


    public Post createPostContent(User user) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Post: ");
        String content = keyboard.nextLine();
        Post newPost = new Post(user, content);
        return newPost;
    }

    public void addPostToList(ArrayList<Post> list, Post post) {
        list.add(post);
    }





}
