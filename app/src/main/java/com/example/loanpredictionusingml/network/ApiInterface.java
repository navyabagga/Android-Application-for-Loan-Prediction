package com.example.loanpredictionusingml.network;


import com.example.loanpredictionusingml.Activity.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface ApiInterface
{
    @POST("/predict")
    Call<ServerResponse> createPost(@Body UserListRequest userlistresponse);
}