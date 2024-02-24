package com.example.animauxsauvages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class DetailAnimal extends AppCompatActivity {

    Button b3,btnStart,btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        b3=findViewById(R.id.b3);
        btnStart = findViewById(R.id.b1);
        btnPause = findViewById(R.id.b2);


        Bundle extras = getIntent().getExtras();
        String videoUrl = extras.getString("videoUrl");
        String description = extras.getString("description");

        VideoView videoView = findViewById(R.id.v1);
        videoView.setVideoURI(Uri.parse(videoUrl));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        TextView t1 = findViewById(R.id.t1);
        t1.setText(description);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(DetailAnimal.this, MainActivity.class);
                startActivity(i1);
            }
        });


    }
}