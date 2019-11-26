package com.example.dharamproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    RadioButton r1,r2,r3,r4;
    RadioGroup radioGroup;
    TextView t1;
    Double calculatedValue2 = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.number1);
        e2 = (EditText) findViewById(R.id.number2);



        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        t1 = (TextView) findViewById(R.id.result);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



                try {
                // checkedId is the RadioButton selected
                Double value1 = Double.parseDouble(e1.getText().toString());
                Double value2 = Double.parseDouble(e2.getText().toString());

                switch (checkedId){
                    case R.id.radio0:
                         calculatedValue2 = (value1 + value2);

                        t1.setText(calculatedValue2.toString());
                        break;
                    case R.id.radio1:
                         calculatedValue2 = (value1 - value2);

                        t1.setText(calculatedValue2.toString());

                        break;
                    case R.id.radio2:
                         calculatedValue2 = (value1 * value2);

                        t1.setText(calculatedValue2.toString());
                        break;
                    case R.id.radio3:
                         calculatedValue2 = (value1 / value2);

                        t1.setText(calculatedValue2.toString());
                        break;
                        default:
                            break;
                }

                }catch (Exception e){
                    alert(e.toString());
                }


            }
        });



    }
    public void alert(String  mesage) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
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
