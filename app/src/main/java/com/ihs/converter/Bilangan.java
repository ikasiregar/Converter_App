package com.ihs.converter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by IHS on 5/11/2017.
 */

public class Bilangan extends AppCompatActivity {

    Button proses, bersih;
    EditText edtAwal, edtHasil;
    Spinner pilihan1, pilihan2;
    int p;
    String hasil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bilangan);

        proses = (Button) findViewById(R.id.btnProses);
        bersih = (Button) findViewById(R.id.btnBersih);
        edtAwal = (EditText) findViewById(R.id.edtInput);
        edtHasil = (EditText) findViewById(R.id.edtHasil);
        pilihan1 = (Spinner) findViewById(R.id.spinner1);
        pilihan2 = (Spinner) findViewById(R.id.spinner2);


        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pil1= pilihan1.getSelectedItem().toString();
                String pil2= pilihan2.getSelectedItem().toString();

                if (pil1.equals("Biner")){
                    if (pil2.equals("Desimal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 2);
                        hasil = String.format("%d", p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Hexadesimal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 2);
                        hasil = Integer.toHexString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Oktal")){
                        p=Integer.parseInt(edtAwal.getText().toString(), 2);
                        hasil = Integer.toOctalString(p);
                        edtHasil.setText(hasil);
                    }else {
                        String a = (edtAwal.getText().toString());
                        hasil = a;
                        edtHasil.setText(hasil);
                    }
                }else if (pil1.equals("Desimal")){
                    if(pil2.equals("Biner")){
                        p = Integer.parseInt(edtAwal.getText().toString());
                        String hasil = Integer.toBinaryString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Hexadesimal")){
                        p = Integer.parseInt(edtAwal.getText().toString());
                        String hasil = Integer.toHexString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Oktal")){
                        p = Integer.parseInt(edtAwal.getText().toString());
                        String hasil = Integer.toOctalString(p);
                        edtHasil.setText(hasil);
                    }else{
                        String a = (edtAwal.getText().toString());
                        hasil= a;
                        edtHasil.setText(hasil);
                    }
                }else if (pil1.equals("Hexadesimal")){
                    if (pil2.equals("Biner")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 16);
                        String hasil = Integer.toBinaryString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Desimal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 16);
                        String hasil = Integer.toString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Oktal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 16);
                        String hasil = Integer.toOctalString(p);
                        edtHasil.setText(hasil);
                    }else {
                        String a = (edtAwal.getText().toString());
                        hasil= a;
                        edtHasil.setText(hasil);
                    }
                }else if (pil1.equals("Oktal")){
                    if (pil2.equals("Biner")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 8);
                        String hasil = Integer.toBinaryString(p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Desimal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 8);
                        String hasil = String.format("%d", p);
                        edtHasil.setText(hasil);
                    }else if (pil2.equals("Hexadesimal")){
                        p = Integer.parseInt(edtAwal.getText().toString(), 8);
                        String hasil = Integer.toHexString(p);
                        edtHasil.setText(hasil);
                    }else {
                        String a = (edtAwal.getText().toString());
                        hasil= a;
                        edtHasil.setText(hasil);
                    }
                }
            }
        });


        bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilihan1.setSelection(0);
                pilihan2.setSelection(0);
                edtAwal.setText("");
                edtHasil.setText("");
            }
        });
    }
}
