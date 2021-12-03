package com.example.loanpredictionusingml;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
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
        int e1=Integer.parseInt(String.valueOf(edit1.getText()));
        text1=(TextView) findViewById(R.id.textView0);
        edit2=(EditText) findViewById(R.id.editTextNumber1);
        int e2=Integer.parseInt(String.valueOf(edit2.getText()));
        text2=(TextView) findViewById(R.id.textView1);
        edit3=(EditText) findViewById(R.id.editTextNumber2);
        int e3=Integer.parseInt(String.valueOf(edit3.getText()));
        text3=(TextView) findViewById(R.id.textView2);
        text31=(TextView) findViewById(R.id.textView20);
        edit4=(EditText) findViewById(R.id.editTextNumber3);
        int e4=Integer.parseInt(String.valueOf(edit4.getText()));
        text4=(TextView) findViewById(R.id.textView3);
        edit5=(EditText) findViewById(R.id.editTextNumber4);
        int e5=Integer.parseInt(String.valueOf(edit5.getText()));
        text5=(TextView) findViewById(R.id.textView4);
        edit6=(EditText) findViewById(R.id.editTextNumber5);
        int e6=Integer.parseInt(String.valueOf(edit6.getText()));
        text6=(TextView) findViewById(R.id.textView5);
        edit7=(EditText) findViewById(R.id.editTextNumber6);
        int e7=Integer.parseInt(String.valueOf(edit7.getText()));
        text7=(TextView) findViewById(R.id.textView6);
        edit8=(EditText) findViewById(R.id.editTextNumber7);
        int e8=Integer.parseInt(String.valueOf(edit8.getText()));
        text8=(TextView) findViewById(R.id.textView7);
        edit9=(EditText) findViewById(R.id.editTextNumber8);
        int e9=Integer.parseInt(String.valueOf(edit9.getText()));
        text9=(TextView) findViewById(R.id.textView88);
        text99=(TextView) findViewById(R.id.textView33);
        edit10=(EditText) findViewById(R.id.editTextNumber78);
        int e10=Integer.parseInt(String.valueOf(edit10.getText()));
        text10=(TextView) findViewById(R.id.textView8);
        button=(Button) findViewById(R.id.button);
        scroll=(ScrollView) findViewById(R.id.scrollView);

    }
    private boolean validateEmail() {
        String email = emailId.getText().toString().trim();

        if (email.isEmpty() || !isValidEmail(email)) {
            emailId.setError("Email is not valid.");
            emailId.requestFocus();
            return false;
        }

        return true;
    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean validate(EditText editText) {
        // check the lenght of the enter data in EditText and give error if its empty
        if (editText.getText().toString().trim().length() > 0) {
            return true; // returns true if field is not empty
        }
        editText.setError("Please Fill This");
        editText.requestFocus();
        return false;
    }

    private void signUp() {
        // display a progress dialog
        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setCancelable(false); // set cancelable to false
        progressDialog.setMessage("Please Wait"); // set message
        progressDialog.show(); // show progress dialog

        // Api is a class in which we define a method getClient() that returns the API Interface class object
        // registration is a POST request type method in which we are sending our field's data
        // enqueue is used for callback response and error
        (Api.getClient().registration(name.getText().toString().trim(),
                emailId.getText().toString().trim(),
                password.getText().toString().trim(),
                "email")).enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, Response<Response> response) {
                signUpResponsesData = response.body();
                Toast.makeText(getApplicationContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.d("response", t.getStackTrace().toString());
                progressDialog.dismiss();

            }
        });
    }

}