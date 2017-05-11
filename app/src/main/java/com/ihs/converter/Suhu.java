package com.ihs.converter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by IHS on 5/11/2017.
 */

public class Suhu extends AppCompatActivity implements View.OnClickListener {
    Button clear, hitung;
    EditText input;
    TextView txtHasil;
    double result;
    Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        input = (EditText) findViewById(R.id.edtInput);
        clear = (Button) findViewById(R.id.btnclear);
        hitung =(Button) findViewById(R.id.btnhitung);
        spinner = (Spinner) findViewById(R.id.spinsuhu);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        clear.setOnClickListener(this);
        hitung.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnclear:
                input.setText("");
                txtHasil.setText("");
                break;
            case R.id.btnhitung:
                String text = input.getText().toString();
                if (text.isEmpty()){
                    Toast.makeText(Suhu.this, "Suhu awal masih kosong",
                            Toast.LENGTH_SHORT).show();
                }else {
                    double nsuhu = Double.parseDouble(text);
                    int posisi = spinner.getSelectedItemPosition();
                    switch (posisi){
                        case 0:
                            result = 4.0 / 5.0 * nsuhu;
                            break;
                        case 1:
                            result= (9.0 / 5.0) * nsuhu + 32;
                            break;
                        case 2:
                            result= nsuhu + 273;
                            break;
                        case 3:
                            result= 5.0 / 4.0 * nsuhu;
                            break;
                        case 4:
                            result= 9.0 / 4.0 * nsuhu + 32;
                            break;
                        case 5:
                            result=5.0 /4.0 * nsuhu + 273;
                            break;
                        case 6:
                            result= 5.0 / 9.0 * (nsuhu - 32);
                            break;
                        case 7:
                            result= 4.0 / 9.0 * (nsuhu - 32);
                            break;
                        case 8:
                            result=5.0 /9.0 *(nsuhu -32);
                            break;
                        case 9:
                            result= nsuhu-273;
                            break;
                        case 10:
                            result= 4.0 / 5.0 * (nsuhu -273);
                            break;
                        case 11:
                            result= 9.0 / 5.0 *(nsuhu - 273) * 32;
                            break;
                    }
                    txtHasil.setText("Hasil Konversi: " + result);
                }
                break;
        }

    }
}
