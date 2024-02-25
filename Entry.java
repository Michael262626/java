package chapterThree;

import java.time.LocalDateTime;
import java.util.UUID;

public class Entry {
    private UUID id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(UUID id, String title, String body){
        this.id = id;
        this.body = body;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    }
    public UUID getId(){
        return id;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setBody(String newBody){
        this.body = newBody;
    }
}
