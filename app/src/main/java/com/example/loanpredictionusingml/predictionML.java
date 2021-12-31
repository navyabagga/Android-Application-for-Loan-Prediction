package com.example.loanpredictionusingml;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;

public class predictionML extends AppCompatActivity
{
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
    Button button;
    ScrollView scroll;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_ml);
    }
    public void sendData(View view)
    {
        txt=(TextView) findViewById(R.id.textView);
        edit1=(EditText) findViewById(R.id.editTextNumber);
        text1=(TextView) findViewById(R.id.textView0);
        edit2=(EditText) findViewById(R.id.editTextNumber1);
        text2=(TextView) findViewById(R.id.textView1);
        edit3=(EditText) findViewById(R.id.editTextNumber2);
        text3=(TextView) findViewById(R.id.textView2);
        text31=(TextView) findViewById(R.id.textView20);
        edit4=(EditText) findViewById(R.id.editTextNumber3);
        text4=(TextView) findViewById(R.id.textView3);
        edit5=(EditText) findViewById(R.id.editTextNumber4);
        text5=(TextView) findViewById(R.id.textView4);
        edit6=(EditText) findViewById(R.id.editTextNumber5);
        text6=(TextView) findViewById(R.id.textView5);
        edit7=(EditText) findViewById(R.id.editTextNumber6);
        text7=(TextView) findViewById(R.id.textView6);
        edit8=(EditText) findViewById(R.id.editTextNumber7);
        text8=(TextView) findViewById(R.id.textView7);
        edit9=(EditText) findViewById(R.id.editTextNumber8);
        text9=(TextView) findViewById(R.id.textView88);
        text99=(TextView) findViewById(R.id.textView33);
        edit10=(EditText) findViewById(R.id.editTextNumber78);
        text10=(TextView) findViewById(R.id.textView8);
        button=(Button) findViewById(R.id.button);
        scroll=(ScrollView) findViewById(R.id.scrollView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate(edit1) && validate(edit2) && validate(edit3) && validate(edit4) &&
                        validate(edit5) && validate(edit6) && validate(edit7) && validate(edit8)
                        &&validate(edit9) && validate(edit10))
                {
                    signUp();
                }
            }
        });

    }

    private boolean validate(EditText editText) {
        if (editText.getText().toString().trim().length() > 0 && editText.getText().toString().trim().length() <= 1 ) {
            return true;
        }
        editText.setError("The given input is Invalid");
        editText.requestFocus();
        return false;
    }

    private void signUp() {
        final ProgressDialog progressDialog = new ProgressDialog(predictionML.this);
        progressDialog.setCancelable(false); // set cancelable to false
        progressDialog.setMessage("Please Wait"); // set message
        progressDialog.show();
        (Api.getClient().registration(edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9,
                edit10)).enqueue(new Callback<Response>()
                {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response)
                    {
                        Response signUpResponsesData = response.body();
                        newActivity1();
                        progressDialog.dismiss();
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t)
                    {
                        newActivity2();
                    }
                });

        }
    public void newActivity1() {
        Intent intent = new Intent(this, canBeSanctioned.class);
        startActivity(intent);
    }
    public void newActivity2() {
        Intent intent = new Intent(this, canNotBeSanctioned.class);
        startActivity(intent);
    }
}
