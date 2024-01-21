package com.example.zaliczenie.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIs {
    @GET("messages")
    Call<List<ProductResult>> getMessage();
}
