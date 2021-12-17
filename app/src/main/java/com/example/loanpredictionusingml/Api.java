package com.example.loanpredictionusingml;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Api {
    private static Retrofit retrofit = null;
    public static ApiInterface getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://loan-prediction-fast-api.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //Creating object for our interface
        ApiInterface api = retrofit.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
