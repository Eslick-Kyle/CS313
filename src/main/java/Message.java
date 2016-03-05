/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KyleE
 */
public class Message {
    private String user;
    private String post;

    public Message(String user, String post) {
        this.user = user;
        this.post = post;
    }

    public Message() {
        this.user = "";
        this.post = "";
    }
    

    public String toFile() {
        return user + "~!~" + post;
    }
    
    public void loadFromFile(String str) {
        String[] parts = str.split("~!~");
        this.user = parts[0];
        this.post = parts[1];
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    
}
