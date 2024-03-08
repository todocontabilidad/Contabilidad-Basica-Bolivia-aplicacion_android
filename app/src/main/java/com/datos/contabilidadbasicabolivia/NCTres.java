package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.datos.contabilidadbasicabolivia.R;
import com.github.barteksc.pdfviewer.PDFView;

public class NCTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nctres);


        PDFView pdfView=findViewById(R.id.pdfview);

        pdfView.fromAsset("nc3.pdf").load();
    }
}