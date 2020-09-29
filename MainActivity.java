package com.example.rara_tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, operasi, angka_kedua;
    Button tombol;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.angka_pertama);
        operasi = findViewById(R.id.operasi);
        angka_kedua = findViewById(R.id.angka_kedua);
        tombol = findViewById(R.id.tombol);
        hasil = findViewById(R.id.hasil);

    }

    public void hitung(View htg){
        int hasil_;

        int angka1 = Integer.parseInt(angka_pertama.getText().toString());
        int angka2 = Integer.parseInt(angka_kedua.getText().toString());
        String Aritmatika = operasi.getText().toString();

        if (Aritmatika.equals("*")){
            hasil_ = angka1 * angka2;
            hasil.setText(String.valueOf(hasil_));
        } else if (Aritmatika.equals("/")){
            hasil_ = angka1 * angka2;
            hasil.setText(String.valueOf(hasil_));
        } else if (Aritmatika.equals("+")){
            hasil_ = angka1 + angka2;
            hasil.setText(String.valueOf(hasil_));
        } else if (Aritmatika.equals("-")){
            hasil_ = angka1 - angka2;
            hasil.setText(String.valueOf(hasil_));
        } else {
            hasil.setText("Operasi Aritmatika Tidak Sesuai");
        }

    }

}