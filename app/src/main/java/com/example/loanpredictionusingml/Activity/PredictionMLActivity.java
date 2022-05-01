package com.example.loanpredictionusingml.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.loanpredictionusingml.R;
import com.example.loanpredictionusingml.network.ApiInterface;
import com.example.loanpredictionusingml.network.UserListRequest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PredictionMLActivity extends AppCompatActivity {
    TextView txt;
    EditText edit1;
    TextView text1;
    EditText edit2;
    TextView text2;
    EditText edit3;
    TextView text3;
    TextView text31;
    EditText edit4;
    TextView text4;
    EditText edit5;
    TextView text5;
    EditText edit6;
    TextView text6;
    EditText edit7;
    TextView text7;
    EditText edit8;
    TextView text8;
    EditText edit9;
    TextView text9;
    TextView text99;
    EditText edit10;
    TextView text10;
    EditText edit11;
    TextView text11;
    Button button;
    ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_ml);
        txt = (TextView) findViewById(R.id.textView);
        edit1 = (EditText) findViewById(R.id.editTextNumber);
        text1 = (TextView) findViewById(R.id.textView0);
        edit2 = (EditText) findViewById(R.id.editTextNumber1);
        text2 = (TextView) findViewById(R.id.textView1);
        edit3 = (EditText) findViewById(R.id.editTextNumber2);
        text3 = (TextView) findViewById(R.id.textView2);
        text31 = (TextView) findViewById(R.id.textView20);
        edit4 = (EditText) findViewById(R.id.editTextNumber3);
        text4 = (TextView) findViewById(R.id.textView3);
        edit5 = (EditText) findViewById(R.id.editTextNumber4);
        text5 = (TextView) findViewById(R.id.textView4);
        edit6 = (EditText) findViewById(R.id.editTextNumber5);
        text6 = (TextView) findViewById(R.id.textView5);
        edit7 = (EditText) findViewById(R.id.editTextNumber6);
        text7 = (TextView) findViewById(R.id.textView6);
        edit8 = (EditText) findViewById(R.id.editTextNumber7);
        text8 = (TextView) findViewById(R.id.textView7);
        edit9 = (EditText) findViewById(R.id.editTextNumber8);
        text9 = (TextView) findViewById(R.id.textView88);
        text99 = (TextView) findViewById(R.id.textView33);
        edit10 = (EditText) findViewById(R.id.editTextNumber66);
        text10 = (TextView) findViewById(R.id.textView66);
        edit11 = (EditText) findViewById(R.id.editTextNumber78);
        text11 = (TextView) findViewById(R.id.textView8);
        button = (Button) findViewById(R.id.button);
        scroll = (ScrollView) findViewById(R.id.scrollView);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().toString().isEmpty() && edit2.getText().toString().isEmpty() &&
                        edit3.getText().toString().isEmpty() && edit4.getText().toString().isEmpty() &&
                        edit5.getText().toString().isEmpty() && edit6.getText().toString().isEmpty() &&
                        edit7.getText().toString().isEmpty() && edit8.getText().toString().isEmpty() &&
                        edit9.getText().toString().isEmpty() && edit10.getText().toString().isEmpty() &&
                        edit9.getText().toString().isEmpty()) {
                    Toast.makeText(PredictionMLActivity.this, "A Field is Empty", Toast.LENGTH_SHORT).show();
                } else {
                    int gender = Integer.parseInt(edit1.getText().toString());
                    int married = Integer.parseInt(edit2.getText().toString());
                    int dependents = Integer.parseInt(edit3.getText().toString());
                    int education = Integer.parseInt(edit4.getText().toString());
                    int self_employed = Integer.parseInt(edit5.getText().toString());
                    int applicant_income = Integer.parseInt(edit6.getText().toString());
                    int coapplicant_income = Integer.parseInt(edit7.getText().toString());
                    int loan_amt = Integer.parseInt(edit8.getText().toString());
                    int loan_amt_term = Integer.parseInt(edit9.getText().toString());
                    int credit_history = Integer.parseInt(edit10.getText().toString());
                    int property_area = Integer.parseInt(edit10.getText().toString());
                    postData(gender, married, dependents, education, self_employed, applicant_income, coapplicant_income,
                            loan_amt, loan_amt_term, credit_history, property_area);
                }
            }
        });
    }

    public void postData(int gender, int married, int dependents, int education, int self_employed, int applicant_income,
                         int coapplicant_income, int loan_amt, int loan_amt_term, int credit_history, int property_area) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://loan-prediction-fast-api.herokuapp.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface retrofitAPI = retrofit.create(ApiInterface.class);
        UserListRequest modal = new UserListRequest(gender, married, dependents, education,
                self_employed, applicant_income, coapplicant_income, loan_amt, loan_amt_term, credit_history, property_area);
        Call<ServerResponse> call = retrofitAPI.createPost(modal);
        call.enqueue(new Callback<ServerResponse>() {
            @Override
            public void onResponse(@NonNull Call<ServerResponse> call, @NonNull Response<ServerResponse> response) {
                Toast.makeText(PredictionMLActivity.this, "Data Sent for Evaluation",
                        Toast.LENGTH_SHORT).show();

                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                edit5.setText("");
                edit6.setText("");
                edit7.setText("");
                edit8.setText("");
                edit9.setText("");
                edit10.setText("");
                edit11.setText("");

                String ans = "";
                if (response.body() != null)
                    ans = ans + response.body().getPrediction();
                else
                    Log.d("RAGHAV", response.toString());

                Log.d("RAGHAV", ans);

                Log.d("RAGHAV", "onResponse: " + response.body().getPrediction().toString());
                if (ans.equals("Loan can be Sanctioned")) {
                    newActivity1();
                } else if (ans.equals("Loan can not be Sanctioned")) {
                    newActivity2();
                }
            }

            @Override
            public void onFailure(@NonNull Call<ServerResponse> call, @NonNull Throwable t) {
                Toast.makeText(PredictionMLActivity.this, "Error is found: " + t.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void newActivity1() {
        Intent intent = new Intent(this, CanBeSanctionedActivity.class);
        startActivity(intent);
    }

    public void newActivity2() {
        Intent intent = new Intent(this, CanNotBeSanctionedActivity.class);
        startActivity(intent);
    }
}