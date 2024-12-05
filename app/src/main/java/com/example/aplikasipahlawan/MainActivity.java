package com.example.aplikasipahlawan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // inisilasisasi Listview
        ListView lvdata = findViewById(R.id.lvdatapahlawan);

        // Membuat list daftar nama pahlawan
        ArrayList <String> daftarpahlawan = new ArrayList<>();
        daftarpahlawan.add("Soekarno");
        daftarpahlawan.add("Hatta");
        daftarpahlawan.add("Sudirman");
        daftarpahlawan.add("Pattimura");
        daftarpahlawan.add("Imam Bonjol");

        //buat adapter untukmenghubungkan data listview
        ArrayAdapter <String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,daftarpahlawan
        );
        // menghubungkan listview ke adapter
        lvdata.setAdapter(adapter);

        lvdata.setOnItemClickListener((parent, view, position, id) -> {
            String namaPahlawan = daftarpahlawan.get(position);
            Toast.makeText(MainActivity.this, "Anda Memilih " + namaPahlawan, Toast.LENGTH_SHORT).show();
            
            if ("Soekarno".equals(namaPahlawan)) {
                Toast.makeText(MainActivity.this, "Anda Memilih: " + namaPahlawan, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailList0.class);
                startActivity(intent);
            } else if ("Hatta".equals(namaPahlawan)) {
                Toast.makeText(MainActivity.this, "Anda memilih: "+namaPahlawan, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailList1.class);
                startActivity(intent);
            } else if ("Sudirman".equals(namaPahlawan)) {
                Toast.makeText(MainActivity.this, "Anda Memilih Sudirman: "+namaPahlawan, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailList2.class);
                startActivity(intent);
            } else if ("Pattimura".equals(namaPahlawan)) {
                Toast.makeText(MainActivity.this, "Anda Memilih Pattimura: "+namaPahlawan, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailList3.class);
                startActivity(intent);
            } else if ("Imam Bonjol".equals(namaPahlawan)) {
                Toast.makeText(MainActivity.this, "Anda Memilih Imam Bonjol: "+namaPahlawan, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailList4.class);
                startActivity(intent);

            }
        });
    }
}