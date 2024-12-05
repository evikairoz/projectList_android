package com.example.aplikasipahlawan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailList0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list0);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // mendapatkan referensi Data
        // ImageView imageView = findViewById(R.id.imageView);
        // TextView textsoekarno = findViewById(R.id.textsoekarno);
        //TextView textdeskripsi = findViewById(R.id.textdeskripsi);

        // menampilkan gambar dan data
      //  imageView.setImageResource(R.drawable.soekarno);
       // textsoekarno.setText("soekarno");
         //textdeskripsi.setText("Soekarno (1901-1970) adalah salah satu pahlawan nasional Indonesia yang paling berpengaruh dan merupakan Presiden pertama Indonesia. Ia dikenal sebagai proklamator kemerdekaan bersama dengan Mohammad Hatta pada 17 Agustus 1945.");

    }
}