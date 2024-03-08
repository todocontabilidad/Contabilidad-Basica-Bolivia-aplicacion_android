package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class NCSeis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncseis);


        PDFView pdfView=findViewById(R.id.pdfview);

        pdfView.fromAsset("nc6.pdf").load();


    }
}