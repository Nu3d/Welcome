package com.example.nuedamanuelb.welcome;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int capsuleID;

    private int id;

    private String realm;

    private String username;

    private String email;

    private Boolean emailVerfied;

    @SerializedName("body")
    private String getRealm;


    public int getCapsuleID() {
        return capsuleID;
    }

    public int getId() {
        return id;
    }

    public String getRealm() {
        return realm;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getEmailVerfied() {
        return emailVerfied;
    }

    public String getGetRealm() {
        return getRealm;
    }
}
