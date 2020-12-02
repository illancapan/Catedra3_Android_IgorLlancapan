package com.example.catedra3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Menu_act extends AppCompatActivity {

    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

         videoView = (VideoView)findViewById(R.id.vd);



        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta);
        videoView.setVideoURI(uri);



        MediaController media = new MediaController(this);
        videoView.setMediaController(media);
    }
    public void Firebase_act(View v){
        Intent iniciar = new Intent(this, Firebase_act.class);
        startActivity(iniciar);
    }

    public void Promociones_act(View v) {
        Intent iniciar = new Intent(this, Promociones_act.class);
        startActivity(iniciar);
    }
}