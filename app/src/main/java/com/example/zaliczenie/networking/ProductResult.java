package com.example.zaliczenie.networking;

import com.google.gson.annotations.SerializedName;
public class ProductResult {
    @SerializedName("id")
    String id;

    @SerializedName("login")
    String login;

    @SerializedName("content")
    String content;

    public String  getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    @SerializedName("date")
    String date;
}
