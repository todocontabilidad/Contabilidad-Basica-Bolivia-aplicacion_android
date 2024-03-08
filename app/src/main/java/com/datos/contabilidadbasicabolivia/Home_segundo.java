package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.datos.contabilidadbasicabolivia.R;

public class Home_segundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_segundo);

        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev = findViewById(R.id.impuestocomsumoespecifico);

        // Set a click listener for the button
        btnInfoDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev1 = findViewById(R.id.rc_iva);

        // Set a click listener for the button
        btnInfoDev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        // --------------------------------------------------------------------------------
        Button btnInfoDev2 = findViewById(R.id.re_iue);

        // Set a click listener for the button
        btnInfoDev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev3 = findViewById(R.id.retenciones);

        // Set a click listener for the button
        btnInfoDev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Intent intent = new Intent(Home_segundo.this, Retenciones_Servicios.class);
                startActivity(intent);
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev4 = findViewById(R.id.retenciones_bienes);

        // Set a click listener for the button
        btnInfoDev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Agregar el código para iniciar la actividad Retenciones_Bienes_Muebles
                Intent intent = new Intent(Home_segundo.this, Retenciones_Bienes_Muebles.class);
                startActivity(intent);
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev5 = findViewById(R.id.retenciones_alquiler);

        // Set a click listener for the button
        btnInfoDev5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_segundo.this, Retenciones_alquiler.class);
                startActivity(intent);
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev6 = findViewById(R.id.compra_marcas);

        // Set a click listener for the button
        btnInfoDev6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev7 = findViewById(R.id.proporcionalidad);

        // Set a click listener for the button
        btnInfoDev7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        // Assuming you have a button with the id "impuestocomsumoespecifico" in your XML layout
        Button btnInfoDev8 = findViewById(R.id.compra_tecnologia);

        // Set a click listener for the button
        btnInfoDev8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------
        Button btnInfoDev9 = findViewById(R.id.peps);

        // Set a click listener for the button
        btnInfoDev9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnInfoDev10 = findViewById(R.id.ueps);

        // Set a click listener for the button
        btnInfoDev10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnInfoDev11 = findViewById(R.id.ley);

        // Set a click listener for the button
        btnInfoDev11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly reference the activity using Home_segundo.this
                Toast.makeText(Home_segundo.this, "Information available only in the paid version", Toast.LENGTH_SHORT).show();
            }
        });


    }

}