package com.example.nuedamanuelb.welcome;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Snooze_apiserver {

    @GET("Post")
    Call<List<Post>> getPosts();
}
