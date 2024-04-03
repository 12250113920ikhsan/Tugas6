package com.example.tugas6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity

    public class DetailActivity extends AppCompatActivity {
            TextView textViewDetailClubName, textViewDetailEstablishedYear, textViewDetailCountry;
            Button buttonShare;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_detail);

                textViewDetailClubName = findViewById(R.id.textViewDetailClubName);
                textViewDetailEstablishedYear = findViewById(R.id.textViewDetailEstablishedYear);
                textViewDetailCountry = findViewById(R.id.textViewDetailCountry);
                buttonShare = findViewById(R.id.buttonShare);

                Club club = getIntent().getParcelableExtra("club");
                if (club != null) {
                    textViewDetailClubName.setText(club.getName());
                    textViewDetailEstablishedYear.setText("Established: " + club.getEstablishedYear());
                    textViewDetailCountry.setText("Country: " + club.getCountry());
                }

                buttonShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        shareClubInfo(club);
                    }
                });
            }

            private void shareClubInfo(Club club) {
                String shareText = "Check out this club: " + club.getName() + ", Established: " + club.getEstablishedYear() + ", Country: " + club.getCountry();
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share club info via"));
            }
        }