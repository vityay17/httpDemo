package com.mysoft;

/**
 * Created by Riczard on 08.10.2016.
 */
public class Post {
    int id;
    String txt;

    public Post() {
    }

    public Post(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
