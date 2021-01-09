package com.example.retrofitapp2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

//https://run.mocky.io/     v3/d862875d-7960-498c-b538-a1f3ffea1b9a
    @GET("v3/d862875d-7960-498c-b538-a1f3ffea1b9a")
    Call<List<Movie>> getMovies();
}
