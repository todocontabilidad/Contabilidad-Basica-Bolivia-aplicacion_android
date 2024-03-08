package com.datos.contabilidadbasicabolivia;

// NIIF.java

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NIIF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niif);

        // Obtén una referencia al TextView por su ID
        TextView normaUnoTextView = findViewById(R.id.norma_uno);
        // Agrega un OnClickListener al TextView
        normaUnoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFuno();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaDosTextView = findViewById(R.id.norma_dos);
        // Agrega un OnClickListener al TextView
        normaDosTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFdos();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaTresTextView = findViewById(R.id.norma_tres);
        // Agrega un OnClickListener al TextView
        normaTresTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFtres();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaCuatroTextView = findViewById(R.id.norma_cuatro);
        // Agrega un OnClickListener al TextView
        normaCuatroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFcuatro();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaCincoTextView = findViewById(R.id.norma_cinco);
        // Agrega un OnClickListener al TextView
        normaCincoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFcinco();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaSeisTextView = findViewById(R.id.norma_seis);
        // Agrega un OnClickListener al TextView
        normaSeisTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFseis();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaSieteTextView = findViewById(R.id.norma_siete);
        // Agrega un OnClickListener al TextView
        normaSieteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFsiete();
            }
        });
        // Obtén una referencia al TextView por su ID
        TextView normaOchoTextView = findViewById(R.id.norma_ocho);
        // Agrega un OnClickListener al TextView
        normaOchoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el TextView
                goToNIIFocho();
            }
        });
    }

    // Método para ir a la actividad NIIFuno
    private void goToNIIFuno() {
        Intent intent = new Intent(this, NIIFuno.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFdos() {
        Intent intent = new Intent(this, NIIFdos.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFtres() {
        Intent intent = new Intent(this, NIIFtres.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFcuatro() {
        Intent intent = new Intent(this, NIIFcuatro.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFcinco() {
        Intent intent = new Intent(this, NIIFcinco.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFseis() {
        Intent intent = new Intent(this, NIIFseis.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFsiete() {
        Intent intent = new Intent(this, NIIFsiete.class);
        startActivity(intent);
    }
    // Método para ir a la actividad NIIFuno
    private void goToNIIFocho() {
        Intent intent = new Intent(this, NIIFocho.class);
        startActivity(intent);
    }
}
