package com.example.android.leonardo_1202154152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
     int duit = 65500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String menu = intent.getStringExtra(MainActivity.resi);
        String porsi = intent.getStringExtra(MainActivity.resi2);
        String tempat = intent.getStringExtra(MainActivity.resi3);
        String harga = intent.getStringExtra(MainActivity.resi4);
        int intharga = Integer.parseInt(harga);
        TextView text1 = (TextView)findViewById(R.id.menu);
        TextView text2 = (TextView)findViewById(R.id.porsi);
        TextView text3 = (TextView)findViewById(R.id.tempat);
        TextView text4 = (TextView) findViewById(R.id.harga);
        text1.setText(menu);
        text2.setText(porsi);
        text3.setText(tempat);
        text4.setText(harga);
        if (duit > intharga){
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }else if (duit < intharga){
            Toast.makeText(this, "Jangan disini, uang tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
