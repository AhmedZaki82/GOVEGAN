package com.example.android.govegan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Tsultrim on 12/16/17.
 */

public class fourth_lay extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_lay);

        TextView textClimate = (TextView) findViewById(R.id.climate);
        textClimate.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textMovies = (TextView) findViewById(R.id.movies);
        textMovies.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textCelebrities = (TextView) findViewById(R.id.celebrities);
        textCelebrities.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textHealthy = (TextView) findViewById(R.id.healthy);
        textHealthy.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void second(View view) {

        again(view);
    }


    public void again(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
