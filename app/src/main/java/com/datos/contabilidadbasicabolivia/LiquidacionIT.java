package com.datos.contabilidadbasicabolivia;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.datos.contabilidadbasicabolivia.R;

import java.text.DecimalFormat;
import java.util.Random;

public class LiquidacionIT extends AppCompatActivity {
    private EditText et1;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja,debito,debito2,it,it2;
    private TextView glosa,informacion,nota1,nota2,nota3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquidacion_it);


        // Encuentra la TableRow y el TextView por sus ID en el layout activity_compra_activos
        TableRow tableRow = findViewById(R.id.tableRow);
        TextView textView = findViewById(R.id.glosa_01);

        // Define una lista de colores de fondo
        int[] backgroundColors = {
                Color.parseColor("#ABEBC6"),
                Color.parseColor("#AED6F1"),
                Color.parseColor("#D2B4DE"),
                Color.parseColor("#E6B0AA"),
                Color.parseColor("#AEB6BF"),
                Color.parseColor("#EDBB99"),
                Color.parseColor("#D6DBDF")
        };

        // Selecciona un color aleatorio de la lista de colores de fondo
        int randomColorIndex = new Random().nextInt(backgroundColors.length);
        int backgroundColor = backgroundColors[randomColorIndex];

        // Define el radio de los bordes en píxeles
        int cornerRadius = 6;

        // Crea un GradientDrawable con el color y los bordes redondeados
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(backgroundColor);
        gradientDrawable.setCornerRadius(cornerRadius);

        // Establece el fondo del TableRow como el GradientDrawable
        tableRow.setBackground(gradientDrawable);

        // Establece el color del texto en blanco
        textView.setTextColor(Color.parseColor("#000000"));

        et1 = (EditText) findViewById(R.id.editTextNumber);
        tvcompra = (TextView) findViewById(R.id.espacio_01);
        tvcompras2=(TextView) findViewById(R.id.espacio_02);
        tvcredito = (TextView) findViewById(R.id.espacio_03);
        tvcredito4=(TextView)findViewById(R.id.espacio_04);
        tvcaja5=(TextView)findViewById(R.id.espacio_05);
        tvcaja = (TextView) findViewById(R.id.espacio_06);

        glosa=(TextView) findViewById(R.id.glosa_01);
        informacion=(TextView) findViewById(R.id.informacion);
        nota1=(TextView) findViewById(R.id.nota1);
        nota2=(TextView) findViewById(R.id.nota2);
        nota3=(TextView) findViewById(R.id.nota3);
    }
    //try catch lo mejor del manejo de excepciones
    public void Generar(View view) {
        try {
            String valor1_String = et1.getText().toString();

            double valor1 = Double.parseDouble(valor1_String);
            //Asignación de valores
            double itpagar= valor1;
            double it=valor1;
            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formato con dos decimales
            String itpagar_String = decimalFormat.format(itpagar);
            String it_String = decimalFormat.format(it);



            tvcompra.setText(itpagar_String);
            tvcompras2.setText("");
            tvcredito.setText("");
            tvcredito4.setText(it_String);
            tvcaja5.setText("");
            tvcaja.setText("");

            //Mensajes para la glosa e informaicón complementaria
            glosa.setText("Glosa: Por el pago del impuesto dentro del plazo correspondientes según formulario 400, de: bs "+valor1);
            informacion.setText("Información normativa. ley 843, DS: 21532 Impuesto a las Transacciones");
            nota1.setText("Nota Informativa: Reglamento Administrativo del IT (R.A. 05-0042-99 Texto Ordenado).");
            nota2.setText("Nota 2. No están comprendidas en el objeto del impuesto a las transacciones, las operaciones (Ventas o transferencias) resultantes de reorganización de empresas o de aportes de capital(fusión, escisión o fivisión, transformación de empresas.");
            nota3.setText("Información complementaria: No integran la base inponible: los importantes correspondientes al impuesto a los consumos especificos.");
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}