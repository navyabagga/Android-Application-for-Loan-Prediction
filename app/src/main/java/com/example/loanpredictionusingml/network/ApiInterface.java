package com.example.loanpredictionusingml.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface ApiInterface
{
    @POST("/predict/")
    Call<UserListResponse> createPost(@Body UserListResponse userlistresponse);
}
