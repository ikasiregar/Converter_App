package com.ihs.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btSuhu, btnBilangan, btnTypho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSuhu = (Button) findViewById(R.id.btnSuhu);
        btnBilangan= (Button) findViewById(R.id.btnBilangan);
        btnTypho = (Button) findViewById(R.id.btnTypography);

        btSuhu.setOnClickListener(this);
        btnBilangan.setOnClickListener(this);
        btnTypho.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSuhu){
            Intent intent= new Intent(this,Suhu.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btnBilangan){
            Intent intent= new Intent(this,Bilangan.class);
            startActivity(intent);


        }
    }
}
