package com.example.bmi_bhuwan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txheight,txweight,etd;
    Button btc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txheight = findViewById(R.id.txheight);
        txweight = findViewById(R.id.txweight);
        etd = findViewById(R.id.etd);
        btc = findViewById(R.id.btc);

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double H,W,Result;
                H=Double.parseDouble(txheight.getText().toString());
                W=Double.parseDouble(txweight.getText().toString());

                BMI_Bhuwan bmi=new BMI_Bhuwan(H,W);

                Result=bmi.calculate();

                etd.setText(""+Result);

                if (Result<18.5){
                    Toast.makeText(MainActivity.this, "Under Weight", Toast.LENGTH_LONG).show();
                }
                else if (Result>18.5  && Result<24.9){
                    Toast.makeText(MainActivity.this, "Normal Weight", Toast.LENGTH_LONG).show();
                }

                else if (Result>25  && Result<29.9){
                Toast.makeText(MainActivity.this, "Over Weight", Toast.LENGTH_LONG).show();
            }
                else if (Result>30){
                Toast.makeText(MainActivity.this, "too much Weight", Toast.LENGTH_LONG).show();
            }

            }
        });

    }
}
