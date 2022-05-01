package com.example.loanpredictionusingml.Activity;

import androidx.annotation.Keep;

@Keep

public class ServerResponse {
    String prediction;

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public ServerResponse(String prediction) {
        this.prediction = prediction;
    }
}