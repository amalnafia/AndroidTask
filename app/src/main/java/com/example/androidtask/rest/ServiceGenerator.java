package com.example.androidtask.rest;

import android.graphics.Bitmap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    public static final String API_BASE_URL = "http://108.60.209.97/JobShop/api/";

    private static <T> T builder(Class<T> endpoint) {
        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(endpoint);
    }
}
