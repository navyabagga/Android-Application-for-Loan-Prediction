package com.example.loanpredictionusingml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img= (ImageView) findViewById(R.id.imageView);
        TextView txt= (TextView) findViewById(R.id.textView);
        TextView txt2=(TextView) findViewById(R.id.editTextTextMultiLine);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity()
    {
        Intent intent = new Intent(this, predictionML.class);
        startActivity(intent);
    }
}