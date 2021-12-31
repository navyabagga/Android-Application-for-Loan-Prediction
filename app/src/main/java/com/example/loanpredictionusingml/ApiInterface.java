package com.example.loanpredictionusingml;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface ApiInterface {
    @FormUrlEncoded
    @POST("/retrofit/register.php")

    /*Call<Response> registration(@Field("gender") Number gender,
                                      @Field("married") Number married,
                                      @Field("dependents") Number dependents,
                                      @Field("education") Number education,
                                      @Field("self_employed") Number self_employed,
                                      @Field("applicant income") Number applicant_income,
                                      @Field("coapplicant income") Number coapplicant_income,
                                      @Field("loan amount") Number loan_amt,
                                      @Field("loan amount term") Number loan_amt_term,
                                      @Field("credit history") Number credit_history,
                                      @Field("property area") Number property_area,
    Callback<Response> callback);*/


    /*Call<Response> registration(String toString,
                                EditText edit2,
                                EditText edit3,
                                EditText edit4,
                                EditText edit5,
                                EditText edit6,
                                EditText edit7,
                                EditText edit8,
                                EditText edit9,
                                EditText edit10, Callback<Response> callback);*/

    Call<Response> registration(EditText edit1, EditText edit2, EditText edit3, EditText edit4, EditText edit5, EditText edit6, EditText edit7, EditText edit8, EditText edit9, EditText edit10);
}
