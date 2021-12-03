package com.example.loanpredictionusingml;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface ApiInterface {
    @FormUrlEncoded
    @POST("/retrofit/register.php")
        // API's endpoints
    Call<Response> registration(@Field("gender") Integer gender,
                                      @Field("married") Integer married,
                                      @Field("dependents") Integer dependents,
                                      @Field("education") Integer education,
                                      @Field("self_employed") Integer self_employed,
                                      @Field("applicant income") Integer applicant_income,
                                      @Field("coapplicant income") Integer coapplicant_income,
                                      @Field("loan amount") Integer loan_amt,
                                      @Field("loan amount term") Integer loan_amt_term,
                                      @Field("credit history") Integer credit_history,
                                      @Field("property area") Integer property_area);
}
