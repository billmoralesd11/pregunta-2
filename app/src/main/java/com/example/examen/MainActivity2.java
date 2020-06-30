package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt=findViewById(R.id.txt);
        String total1=getIntent().getStringExtra("env");
        int total2=Integer.parseInt(total1);
        txt.setText("el total es: "+total2);
    }

    public void volver(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

}