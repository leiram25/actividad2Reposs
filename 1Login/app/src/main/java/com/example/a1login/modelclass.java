package com.example.a1login;



public class modelclass {

    private int imageIcon;
    String title;
    String body;

    public modelclass(int imageIcon, String title, String body) {
        this.imageIcon = imageIcon;
        this.title = title;
        this.body = body;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
