package com.example.rutujabanswal.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rutuja Banswal on 21-02-2018.
 */

public interface Api {

  String BASE_URL =  "https://simplifiedcoding.net/demos/";
  @GET("marvel")
    Call<List<Hero>> getHeros();

}
