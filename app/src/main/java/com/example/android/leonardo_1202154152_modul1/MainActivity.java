package com.example.android.leonardo_1202154152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String resi = "resi";
    public static final String resi2 = "resi2";
    public static final String resi3 = "resi3";
    public static final String resi4 = "resi4";
    private EditText menu;
    private EditText porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (EditText) findViewById(R.id.editMenu);
        porsi = (EditText) findViewById(R.id.editPorsi);

    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String menu_makan = menu.getText().toString();
        String porsi2 = porsi.getText().toString();
        int prs = Integer.parseInt(porsi2);
        if (menu_makan.equals("Nasi Uduk")) {
            int harga = prs * 50000;
            String total = Integer.toString(harga);
            intent.putExtra(resi4, total);
        }
        String tempat = "EatBus";
        intent.putExtra(resi, menu_makan);
        intent.putExtra(resi2, porsi2);
        intent.putExtra(resi3, tempat);
        startActivity(intent);
    }

    public void abnormal(View view) {
        Intent intent2 = new Intent(this, Main2Activity.class);
        String menu_makan = menu.getText().toString();
        String porsi3 = porsi.getText().toString();
        int prs = Integer.parseInt(porsi3);
        if (menu_makan.equals("Nasi Uduk")) {
            int harga = prs * 30000;
            String total = Integer.toString(harga);
            intent2.putExtra(resi4, total);
        }
        String tempat = "Abnormal";
        intent2.putExtra(resi, menu_makan);
        intent2.putExtra(resi2, porsi3);
        intent2.putExtra(resi3, tempat);
        startActivity(intent2);
    }
}
