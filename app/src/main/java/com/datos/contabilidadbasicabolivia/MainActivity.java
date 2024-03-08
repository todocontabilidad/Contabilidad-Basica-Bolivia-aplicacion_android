package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.datos.contabilidadbasicabolivia.R;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Inicializar Firebase
        FirebaseApp.initializeApp(this);

        // Obtener la instancia de Firebase Analytics
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        ImageView logoImageView = findViewById(R.id.animation_view);
        logoImageView.setAnimation(animacion1);

        mediaPlayer = MediaPlayer.create(this, R.raw.teclado04);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, Principal.class);
                        startActivity(intent);
                        finish();
                    }
                }, 600);
            }
        });
        mediaPlayer.start();

        // Agregar OnClickListener al ConstraintLayout raíz
        ConstraintLayout rootLayout = findViewById(R.id.root_layout); // Reemplaza "root_layout" con el ID de tu ConstraintLayout raíz
        rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se presiona la pantalla, iniciar el siguiente Activity
                Intent intent = new Intent(MainActivity.this, Principal.class); // Reemplaza "SiguienteActivity" con el nombre de tu siguiente Activity
                startActivity(intent);
                finish();
            }
        });
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
