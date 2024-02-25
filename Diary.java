package chapterThree;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Diary {
    private static String userName;
    private String passWord;
    private int id;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void createEntry(String title, String content) {
        Entry entry = new Entry(generateEntryId(), title, content);
        entries.add(entry);
    }

    private int getId() {
        return id;
    }

    public void lock() {
        isLocked = true;
    }

    boolean isLocked() {
        return isLocked;
    }
    private UUID generateEntryId(){
        return UUID.randomUUID();
    }

    public void unlockDiary(String userPassword) throws InvalidPinException {
        if (userPassword.equals(passWord)) {
            isLocked = false;
        } else {
            throw new InvalidPinException("Invalid pin");
        }
    }

    public List<Entry> getEntry() {
        if (!isLocked) {
            return entries;
        } else {
            return null;
        }

    }

    public void setPassword(String password) {
        this.passWord = password;

    }

    public void deleteEntry(int id) {
        id--;
        if (!isLocked) entries.remove(id);
    }

    public Entry findEntry(UUID id) {
        if (!isLocked) {
            for (Entry entry : entries) {
                if (entry.getId().equals(id))
                    return entry;
            }
        }
        return null;
    }

    public void updateEntry(UUID id, String newTitle, String newBody) {
        if(!isLocked)
            for(Entry entry : entries){
                if(entry.getId().equals(id)) {
                    entry.setTitle(newTitle);
                    entry.setBody(newBody);
                }
            }
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public static String getUserName(){
        return userName;
    }
}
