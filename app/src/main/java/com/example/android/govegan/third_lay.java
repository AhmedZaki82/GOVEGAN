package com.example.android.govegan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tsultrim on 12/16/17.
 */

public class third_lay extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_lay);


    }

    public void next_3(View view) {


        RadioButton answer1 = (RadioButton) findViewById(R.id.first_r);
        RadioButton answer2 = (RadioButton) findViewById(R.id.second_r);
        RadioButton answer3 = (RadioButton) findViewById(R.id.third_r);
        RadioButton answer4 = (RadioButton) findViewById(R.id.fourth_r);

        boolean check1 = answer1.isChecked();
        boolean check2 = answer2.isChecked();
        boolean check3 = answer3.isChecked();
        boolean check4 = answer4.isChecked();

        if (check4) {
            Toast.makeText(this, getString(R.string.proudJ), Toast.LENGTH_SHORT).show();
        } else if (check1) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_SHORT).show();

            return;
        } else if (check2) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_SHORT).show();

            return;
        } else if (check3) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_SHORT).show();

            return;
        } else {

            Toast.makeText(this, getString(R.string.chooseAnswerJ), Toast.LENGTH_SHORT).show();
            return;
        }

        nextToFifthPage(view);


    }

    private void nextToFifthPage(View view) {
        Intent intent = new Intent(this, fourth_lay.class);
        startActivity(intent);

    }
}
