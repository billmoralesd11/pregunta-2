package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1o,txt2o;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1o=findViewById(R.id.num1);
        txt2o=findViewById(R.id.num2);
    }
    public void suma(View view){
        String txt1=txt1o.getText().toString();
        String txt2=txt2o.getText().toString();
        int num1=Integer.parseInt(txt1);
        int num2=Integer.parseInt(txt2);
        int suma=num1+num2;
        String suma_env=String.valueOf(suma);
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("env",suma_env);
        startActivity(i);
    }

    public void resta(View view){
        String txt1=txt1o.getText().toString();
        String txt2=txt2o.getText().toString();
        int num1=Integer.parseInt(txt1);
        int num2=Integer.parseInt(txt2);
        int resta=num1-num2;
        String resta_env=String.valueOf(resta);
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("env",resta_env);
        startActivity(i);
    }

    public void multi(View view){
        String txt1=txt1o.getText().toString();
        String txt2=txt2o.getText().toString();
        int num1=Integer.parseInt(txt1);
        int num2=Integer.parseInt(txt2);
        int multi=num1*num2;
        String multi_env=String.valueOf(multi);
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("env",multi_env);
        startActivity(i);
    }

    public void divi(View view){
        String txt1=txt1o.getText().toString();
        String txt2=txt2o.getText().toString();
        int num1=Integer.parseInt(txt1);
        int num2=Integer.parseInt(txt2);
        int divi=num1/num2;
        String divi_env=String.valueOf(divi);
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("env",divi_env);
        startActivity(i);
    }
}