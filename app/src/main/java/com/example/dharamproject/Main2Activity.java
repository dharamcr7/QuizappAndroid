package com.example.dharamproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    Integer  mScore = 0;
    TextView t1;
    Button button;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click


                if (radioButton1.isChecked()){
                    mScore++;

                }
                if (radioButton2.isChecked()){
                    mScore++;

                }
                if (radioButton3.isChecked()){
                    mScore++;

                }if (radioButton4.isChecked()){
                    mScore++;

                }if (radioButton5.isChecked()){
                    mScore++;

                }

               t1.setText(mScore.toString());
                button.setClickable(false);
            }
        });



        t1.setText(mScore.toString());

    }
    private void initViews(){
        radioButton1 = (RadioButton) findViewById(R.id.radio01);
        radioButton2 = (RadioButton) findViewById(R.id.radio13);
        radioButton3 = (RadioButton) findViewById(R.id.radio24);
        radioButton4 = (RadioButton) findViewById(R.id.radio34);
        radioButton5 = (RadioButton) findViewById(R.id.radio42);

        t1 = (TextView)findViewById(R.id.score);

        button = (Button)findViewById(R.id.SubmitButton);
    }
    public void alert(String  mesage) {
        AlertDialog alertDialog = new AlertDialog.Builder(Main2Activity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(mesage);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

    }
    }

