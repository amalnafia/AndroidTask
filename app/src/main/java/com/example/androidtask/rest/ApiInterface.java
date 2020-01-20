package com.example.androidtask.rest;

import com.example.androidtask.model.JobResponse;
import com.example.androidtask.request.Request;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("JobVacancy/GetAvailableJob")
    Call<JobResponse> getEmployee(@Body Request body);
}
