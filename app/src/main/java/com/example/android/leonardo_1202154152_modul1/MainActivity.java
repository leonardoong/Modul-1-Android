package com.example.android.leonardo_1202154152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String resi = "resi"; //pendeklarasian resi
    public static final String resi2 = "resi2"; //pendeklarasian resi2
    public static final String resi3 = "resi3"; //pendeklarasian resi3
    public static final String resi4 = "resi4"; //pendeklarasian resi4
    private EditText menu; //pendeklarasian edittext menu
    private EditText porsi; //pendeklatasian edittext porsi


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (EditText) findViewById(R.id.editMenu); //mendeklarasikan menu dengan edittext dengan id editMenu
        porsi = (EditText) findViewById(R.id.editPorsi); //mendeklarasikan porsi dengan edittext dengan id editPorsi

    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class); // membuat intent untuk memulai aktivitas selanjutnya
        String menu_makan = menu.getText().toString(); //mengambil data menu dari edittext dan mejadi type data String
        String porsi2 = porsi.getText().toString(); //mengambil data porsi dari edittext dan mejadi type data String
        int prs = Integer.parseInt(porsi2); //mengubah data String menjadi int
        if (menu_makan.equals("Nasi Uduk")) { //pengecekan apakan menu yang dipilih adalah Nasi Uduk
            int harga = prs * 50000; //jika ya maka harga total harga di eatbus menjadi porsi * 50.000
            String total = Integer.toString(harga); //mengkonversikan int menjadi string
            intent.putExtra(resi4, total); //menyimpan data total pada extra resi4
        }
        String tempat = "EatBus"; //pendeklarasikan nama tempat
        intent.putExtra(resi, menu_makan); //menyimpan data menu pada extra resi
        intent.putExtra(resi2, porsi2); //menyimpan data porsi pada extra resi2
        intent.putExtra(resi3, tempat); //menyimpan data tempat pada extra resi3
        startActivity(intent); //memulai aktivitas kedua
    }

    public void abnormal(View view) {
        Intent intent2 = new Intent(this, Main2Activity.class); // membuat intent untuk memulai aktivitas selanjutnya
        String menu_makan = menu.getText().toString(); //mengambil data menu dari edittext dan mejadi type data String
        String porsi3 = porsi.getText().toString(); //mengambil data porsi dari edittext dan mejadi type data String
        int prs = Integer.parseInt(porsi3); //mengubah data String menjadi int
        if (menu_makan.equals("Nasi Uduk")) { //pengecekan apakan menu yang dipilih adalah Nasi Uduk
            int harga = prs * 30000; //jika ya maka harga total harga di eatbus menjadi porsi * 30.000
            String total = Integer.toString(harga); //mengkonversikan int menjadi string
            intent2.putExtra(resi4, total); //menyimpan data total pada extra resi4
        }
        String tempat = "Abnormal"; //pendeklarasikan nama tempat
        intent2.putExtra(resi, menu_makan); //menyimpan data menu pada extra resi
        intent2.putExtra(resi2, porsi3); //menyimpan data porsi pada extra resi2
        intent2.putExtra(resi3, tempat); //menyimpan data tempat pada extra resi3
        startActivity(intent2); //memulai aktivitas kedua
    }
}
