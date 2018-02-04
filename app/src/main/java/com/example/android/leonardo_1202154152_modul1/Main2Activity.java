package com.example.android.leonardo_1202154152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
     int duit = 65500; //untuk mendeklarasikan uang yang dipunyai
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent(); // untuk mengambil intent/data yang dikirim dari activity sebelumnya
        String menu = intent.getStringExtra(MainActivity.resi); // mengambil data string dengan extra resi
        String porsi = intent.getStringExtra(MainActivity.resi2); // mengambil data string dengan extra resi2
        String tempat = intent.getStringExtra(MainActivity.resi3); // mengambil data string dengan extra resi3
        String harga = intent.getStringExtra(MainActivity.resi4); // mengambil data string dengan extra resi4
        int intharga = Integer.parseInt(harga); //mengubah data String menjadi int agar dapat dioperasikan
        TextView text1 = (TextView)findViewById(R.id.menu); //pendekerasian textview menu
        TextView text2 = (TextView)findViewById(R.id.porsi); //pendekerasian textview porsi
        TextView text3 = (TextView)findViewById(R.id.tempat); //pendekerasian textview tempat
        TextView text4 = (TextView) findViewById(R.id.harga); //pendekerasian textview harga
        text1.setText(menu); //set text1 menjadi data menu
        text2.setText(porsi); //set text2 menjadi data porsi
        text3.setText(tempat); //set text3 menjadi data tempat
        text4.setText(harga); //set text4 menjadi data harga
        if (duit > intharga){ // pengecekan apakah uang dimiliki cukup
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show(); //jika iya akan menempilkan toast seperti di text
        }else if (duit < intharga){ //jika uang yang dimiliki tidak cukup
            Toast.makeText(this, "Jangan disini, uang tidak cukup", Toast.LENGTH_LONG).show(); //jika tidak maka akan menampilkan toast seperti di text
        }
    }
}
