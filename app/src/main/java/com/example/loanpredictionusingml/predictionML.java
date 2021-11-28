package com.example.loanpredictionusingml;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;

public class predictionML extends AppCompatActivity
{
    JsonObjectRequest jsonObjectRequest;
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
    RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_ml);
    }
    public void sendData(View view)
    {
        HashMap<String, Integer> data = new HashMap<>();
        String url="http://127.0.0.1:8000";
        queue = Volley.newRequestQueue(this);
        txt=(TextView) findViewById(R.id.textView);
        edit1=(EditText) findViewById(R.id.editTextNumber0);
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

        data.put("edit1",e1);
        data.put("edit2",e2);
        data.put("edit3",e3);
        data.put("edit4",e4);
        data.put("edit5",e5);
        data.put("edit6",e6);
        data.put("edit7",e7);
        data.put("edit8",e8);
        data.put("edit9",e9);
        data.put("edit10",e10);


        jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, url, new JSONObject(data), new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response)
                    {
                        String ans = null;
                        try
                        {
                            ans = response.getString("ans"); //I'll take out the value whose key is ans
                        }
                        catch (JSONException e)
                        {
                            e.printStackTrace();
                        }
                        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        // TODO: Handle error
                        Toast.makeText(getApplicationContext(),"Opps something went wrong",Toast.LENGTH_LONG).show();
                    }

                });
        queue.add(jsonObjectRequest);
    }
}