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

public class Gasolina extends AppCompatActivity {

    private EditText et1;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja;
    private TextView glosa,informacion,nota1,nota2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina);


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
    }
    //try catch lo mejor del manejo de excepciones
    public void Generar(View view) {
        try {
            String valor1_String = et1.getText().toString();

            double valor1 = Double.parseDouble(valor1_String);

            double valor_credito = (valor1 * 0.70)*0.13;
            double valor_compra = valor1-valor_credito;
            double valor_caja = valor1;

            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formato con dos decimales

            String compra_String = decimalFormat.format(valor_compra);
            String credito_String = decimalFormat.format(valor_credito);
            String caja_String = decimalFormat.format(valor_caja);

            tvcompra.setText(compra_String);
            tvcompras2.setText("");
            tvcredito.setText(credito_String);
            tvcredito4.setText("");
            tvcaja5.setText("");
            tvcaja.setText(caja_String);
            //Mensajes para la glosa e informaicón complementaria
            glosa.setText("Glosa: Por la compra de combustible al 70% para el crédito fiscal: bs "+valor1);
            informacion.setText("Información normativa.  ley 317 en su art. 29, mediante la Disposición Adicional Tercera " +
                    "“…En la compra de Gasolina Especial, Gasolina Premium o Diesel Oil a las Estaciones de Servicio, las personas naturales o jurídicas, computarán como crédito fiscal para la liquidación del Impuesto al Valor Agregado – IVA, sólo el 70% sobre el crédito fiscal del valor de la compra…”");
            nota1.setText("Nora 1. La norma obliga al consumidor a renunciar al crédito fiscal del 30% de la compra en combustibles, pero no hace mención al IUE tal como lo indica la RND 10-0040-12 ");
            //nota2.setText("El D.S. 24051 indica el tratamiento de los gastos no deducibles: Artículo 18°.- Conceptos no deducibles...Como se puede ver no incluye a conceptos relacionados a combustibles, o una parte de ese gasto.");

        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}


//salido del proyecto men_said
/*glosa.setText("Glosa: Por la compra de combustible al 70% para el crédito fiscal: bs "+valor1);
            informacion.setText("Información normativa.  ley 317 en su art. 29, mediante la Disposición Adicional Tercera " +
                    "“…En la compra de Gasolina Especial, Gasolina Premium o Diesel Oil a las Estaciones de Servicio, las personas naturales o jurídicas, computarán como crédito fiscal para la liquidación del Impuesto al Valor Agregado – IVA, sólo el 70% sobre el crédito fiscal del valor de la compra…”");
            nota1.setText("Nora 1. La norma obliga al consumidor a renunciar al crédito fiscal del 30% de la compra en combustibles, pero no hace mención al IUE tal como lo indica la RND 10-0040-12 ");
            //nota2.setText("El D.S. 24051 indica el tratamiento de los gastos no deducibles: Artículo 18°.- Conceptos no deducibles...Como se puede ver no incluye a conceptos relacionados a combustibles, o una parte de ese gasto.");

        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }*/