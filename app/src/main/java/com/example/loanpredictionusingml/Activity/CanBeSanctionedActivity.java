package com.example.loanpredictionusingml.Activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loanpredictionusingml.R;

public class CanBeSanctionedActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_be_sanctioned);
        ImageView img2=(ImageView) findViewById(R.id.imageview1);
    }
}
