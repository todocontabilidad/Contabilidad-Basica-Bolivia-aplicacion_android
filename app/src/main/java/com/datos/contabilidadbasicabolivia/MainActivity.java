package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;

import com.datos.contabilidadbasicabolivia.R;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Inicializar Firebase
        FirebaseApp.initializeApp(this);

        // Obtener la instancia de Firebase Analytics
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        ImageView logoImagenView = findViewById(R.id.animation_view);

        logoImagenView.setAnimation(animacion1);

        mediaPlayer = MediaPlayer.create(this, R.raw.teclado04); // Reemplaza con el nombre de tu archivo de audio

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // Aquí puedes realizar acciones cuando el audio termine de reproducirse
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        Intent intent=new Intent(MainActivity.this, Principal.class);
                        startActivity(intent);
                        finish();//Termina la musica y cambia de pantalla si y solo si no pones tiempo en delaymilis:0

                    }
                },500);
            }
        });

        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
