package com.example.learning_retrofit;

import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("name")
    private String Name;


    public Results(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}