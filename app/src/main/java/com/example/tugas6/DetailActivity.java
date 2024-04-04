package com.example.tugas6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        if (intent != null) {
            String clubName = intent.getStringExtra("club_name");
            int clubLogo = intent.getIntExtra("club_logo", 0);
            String tahunBerdiri = intent.getStringExtra("Since_detail");
            String asalNegara = intent.getStringExtra("Country_detail");

            TextView clubNameTextView = findViewById(R.id.nama_club_detail);
            clubNameTextView.setText(clubName);

            ImageView clubLogoImageView = findViewById(R.id.Logo_club);
            clubLogoImageView.setImageResource(clubLogo);

            TextView tahunBerdiriTextView = findViewById(R.id.since_detail);
            tahunBerdiriTextView.setText(tahunBerdiri);

            TextView asalNegaraTextView = findViewById(R.id.country_detail);
            asalNegaraTextView.setText(asalNegara);

            Button btnShare = findViewById(R.id.btnShare);
            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareClubDetails(clubName);
                }
            });
        }
    }

    private void shareClubDetails(String clubName) {
        // Membuat pesan untuk dibagikan
        String shareMessage = "Saya adalah penggemar klub " + clubName + "!";

        // Membuat intent untuk membagikan pesan
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

        // Memulai aktivitas untuk memilih aplikasi untuk membagikan pesan
        startActivity(Intent.createChooser(shareIntent, "Bagikan ke"));
    }
}