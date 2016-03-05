
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KyleE
 */
public class FileMessageDataHandler implements MessageDataHandler {
    public String fileName;
    @Override
    public void addMessage(Message message) {
          try {
               BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));
               writer.write(message.toFile() + "\n");
               writer.close(); 

          } catch (IOException e) { 
               e.printStackTrace();
          }
     }

    public FileMessageDataHandler(String fileName) {
        this.fileName = fileName;
    }
    
    @Override  
    public List<Message> getPosts() {
        List<Message> posts = new ArrayList<>();
        try {
               BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

               String line;

               while ((line = reader.readLine()) != null) {
                    Message message = new Message();
                    message.loadFromFile(line);
                    posts.add(message);
               }
          } catch (IOException e) { 
               e.printStackTrace();
          }
        return posts;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
