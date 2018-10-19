package com.example.d2a.aplikasiresepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TampilanResep extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanresep);
        Intent intent = getIntent();
        String judul = intent.getStringExtra("judul");
        String bahan = intent.getStringExtra("bahan");
        String cara = intent.getStringExtra("cara");
        TextView tjudul = findViewById(R.id.judul);
        tjudul.setText(judul);
        TextView tbahan = findViewById(R.id.bahan);
        tbahan.setText(bahan);
        TextView tcara = findViewById(R.id.cara);
        tcara.setText(cara);
    }
}
