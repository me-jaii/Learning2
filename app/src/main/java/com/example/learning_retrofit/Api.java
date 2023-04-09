package com.example.learning_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/marvel";

    @GET("marvel")
    Call<List<Results>> getsuperHeroes();
}