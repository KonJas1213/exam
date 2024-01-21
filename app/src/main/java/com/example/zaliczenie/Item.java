package com.example.zaliczenie;

public class Item {


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String login;
    String content;
    String id;
    String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public Item(String login, String content, String date, String id) {
        this.login = login;
        this.content = content;
        this.id = id;
        this.date = date;
    }


}
