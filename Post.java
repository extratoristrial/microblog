package microBlog;

public class Post {

    private static int postCounter = 0;
    private User user;
    private int postID;
    private String content;
    private String url;

    public Post() {
        postCounter++;
        this.postID = postCounter;
    }

    public Post(User user, String content) {
        postCounter++;
        this.user = user;
        this.postID = postCounter;
        this.content = content;
    }

    public Post(User user, String content, String url) {
        postCounter++;
        this.user = user;
        this.postID = postCounter;
        this.content = content;
        this.url = url;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostID() {
        return this.postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {

        return
                "Username: " + this.user.getUsername() + "\n" +
                "Post ID: " + this.postID + "\n"
                + "Post: " + this.content + "\n";

    }

}




