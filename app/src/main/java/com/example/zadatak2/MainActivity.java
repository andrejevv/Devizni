package com.example.zadatak2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText evri;
    private EditText dolari;
    private EditText kursE;
    private  EditText kursD;
    private TextView ed;
    private TextView dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        evri=(EditText) findViewById(R.id.Evri);

        dolari=(EditText) findViewById(R.id.Dolari);

        kursE=(EditText) findViewById(R.id.KursE);

        kursD=(EditText) findViewById(R.id.KursD);

        ed=(TextView) findViewById(R.id.EvriDinari);

        dd=(TextView) findViewById(R.id.DolariDinari);


    }
    public void pretvoriEvro(View view){
        double iznosE=Double.parseDouble(evri.getText().toString());
        double kurs=Double.parseDouble(kursE.getText().toString());


        double rez=iznosE*kurs;

        ed.setText("Din - " + String.valueOf(rez));


    }
    public void pretvoriDolar(View view){

        double iznosD=Double.parseDouble(dolari.getText().toString());

        double kurs=Double.parseDouble(kursD.getText().toString());

        double rez=iznosD*kurs;

        dd.setText("Din - " + String.valueOf(rez));
    }
}