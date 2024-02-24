package com.example.animauxsauvages;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img1,img2,img3,img4,img5,img6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, DetailAnimal.class);
        String videoUrl = "";
        String description = "";
        if (v.getId() == R.id.img1) {
            videoUrl =  "android.resource://" + getPackageName() + "/raw/elephant";
            description = "Les éléphants sont les plus grands mammifères terrestres du monde, avec leurs défenses distinctives et leurs grandes oreilles. Ils se trouvent dans divers habitats, des forêts tropicales aux savanes et aux déserts.";
        } else if (v.getId() == R.id.img2) {
            videoUrl =  "android.resource://" + getPackageName() + "/raw/girafe";
            description = "Avec leur long cou élancé et leurs taches distinctives, les girafes sont les plus grands mammifères terrestres du monde. Elles se trouvent principalement dans les savanes et les zones arborées d'Afrique, se nourrissant principalement des feuilles des arbres acacias.";
        } else if (v.getId() == R.id.img3) {
            videoUrl =  "android.resource://" + getPackageName() + "/raw/lion";
            description = "Les lions sont de puissants félins majestueux, connus pour leur crinière distinctive et leur statut de roi des animaux. Ils habitent les vastes plaines et savanes d'Afrique, vivant en groupes sociaux appelés fiertés.";
        } else if (v.getId() == R.id.img4) {
            videoUrl = "android.resource://" + getPackageName() + "/raw/singe";
            description = "Les singes sont des créatures agiles et intelligentes appartenant à l'ordre des primates. Arborant souvent une queue et un visage expressif, ils se trouvent dans une variété d'habitats, des forêts tropicales aux montagnes.";
        } else if (v.getId() == R.id.img5) {
            videoUrl = "android.resource://" + getPackageName() + "/raw/gorille";
            description = "Les gorilles, les plus grands primates vivants, se distinguent par leur corps massif et leur tête large. Vivant dans les forêts tropicales d'Afrique, ils sont principalement herbivores, se nourrissant de feuilles et de fruits.";
        }else if (v.getId() == R.id.img6) {
            videoUrl = "android.resource://" + getPackageName() + "/raw/crocodile";
            description = "Les crocodiles sont des prédateurs redoutables des eaux douces, avec leur corps allongé, leur queue musclée et leurs mâchoires garnies de dents coniques. Ils résident principalement dans les régions tropicales et subtropicales, où ils chassent dans les rivières, les marécages et les lacs.";
        }
        intent.putExtra("videoUrl", videoUrl);
        intent.putExtra("description", description);
        startActivity(intent);
    }

}