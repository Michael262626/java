package chapterThree;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void addToDiary(String title, String body){
        this.add(title, body);
    }
    public Diary findByUsername(String userName){
        for(Diary diary : diaries){
            if(Diary.getUserName().equals(userName)) return diary;
        }
        return null;
    }
    public void delete(String title, String body){
        this.remove(title, body);
    }
}
