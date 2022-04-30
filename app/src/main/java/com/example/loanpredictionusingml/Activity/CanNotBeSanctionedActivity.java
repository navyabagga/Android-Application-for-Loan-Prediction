package com.example.loanpredictionusingml.Activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loanpredictionusingml.R;

public class CanNotBeSanctionedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_not_be_sanctioned);
        ImageView img=(ImageView) findViewById(R.id.imageView2);
    }

}