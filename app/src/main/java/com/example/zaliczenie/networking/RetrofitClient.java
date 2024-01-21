package com.example.zaliczenie.networking;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private APIs apis;

    private RetrofitClient(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://tgryl.pl/shoutbox/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if(instance==null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public APIs getApis(){
        return  apis;
    }
}
