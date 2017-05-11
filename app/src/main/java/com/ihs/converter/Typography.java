package com.ihs.converter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by IHS on 5/10/2017.
 */

public class Typography extends AppCompatActivity {

    private Spinner sp;
    private EditText editAngka, edCelcius, edReamur, edKelvin, edFahrenhait;
    private String[] list={"C","R","F","K"};
    Double awal, celcius, reamur, fahrenheit, kelvin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.typography);

        editAngka = (EditText) findViewById(R.id.edAngka);
        edCelcius = (EditText) findViewById(R.id.ed_C);
        edKelvin = (EditText) findViewById(R.id.ed_K);
        edReamur = (EditText) findViewById(R.id.ed_R);
        edFahrenhait = (EditText) findViewById(R.id.ed_F);
        sp = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, R.layout.typography);
        sp.setAdapter(adapter);
        konversi();
    }

    public void konversi() {
        String satuan = String.valueOf(sp.getSelectedItemPosition());
        if(editAngka.getText().toString().equals("")){
            Toast.makeText(getBaseContext(), "Masukkan suhu awal, default suhu awal = 0 jika tidak dimasukkan suhu awal", Toast.LENGTH_LONG).show();
            awal = 0.0;
        }else{
            awal = Double.parseDouble(editAngka.getText().toString());
        }
        if(satuan.equals("0")){
            celcius = awal;
            reamur = 0.8 * awal;
            fahrenheit = (1.8 * awal) + 32;
            kelvin = awal + 273;

            edCelcius.setText(String.valueOf(celcius));
            edReamur.setText(String.valueOf(reamur));
            edFahrenhait.setText(String.valueOf(fahrenheit));
            edKelvin.setText(String.valueOf(kelvin));
        }else if(satuan.equals("1")){
            celcius = 1.25 * awal;
            reamur = awal;
            fahrenheit = (2.25 * awal) + 32;
            kelvin = celcius + 273;

            edCelcius.setText(String.valueOf(celcius));
            edReamur.setText(String.valueOf(reamur));
            edFahrenhait.setText(String.valueOf(fahrenheit));
            edKelvin.setText(String.valueOf(kelvin));
        }else if(satuan.equals("2")){
            celcius = 0.55555 *(awal - 32);
            reamur = 0.44444 * (awal-32);
            fahrenheit = awal;
            kelvin = celcius + 273;

            edCelcius.setText(String.valueOf(celcius));
            edReamur.setText(String.valueOf(reamur));
            edFahrenhait.setText(String.valueOf(fahrenheit));
            edKelvin.setText(String.valueOf(kelvin));
        }else if(satuan.equals("3")){
            celcius = awal-273;
            reamur = 0.8 * (awal-273);
            fahrenheit = (1.8 * (awal-273)) + 32;
            kelvin = awal;

            edCelcius.setText(String.valueOf(celcius));
            edReamur.setText(String.valueOf(reamur));
            edFahrenhait.setText(String.valueOf(fahrenheit));
            edKelvin.setText(String.valueOf(kelvin));
        }
    }
    }
