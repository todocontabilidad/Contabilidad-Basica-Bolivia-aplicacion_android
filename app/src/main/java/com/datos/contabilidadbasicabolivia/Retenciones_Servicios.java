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

public class Retenciones_Servicios extends AppCompatActivity {

    private EditText et1;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja,debito,debito2,it,it2;
    private TextView glosa,informacion,nota1,nota2,nota3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retenciones_servicios);


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
        debito=(TextView)findViewById(R.id.espacio_07);
        debito2=(TextView)findViewById(R.id.espacio_08);

        glosa=(TextView) findViewById(R.id.glosa_01);
        informacion=(TextView) findViewById(R.id.informacion);
        nota1=(TextView) findViewById(R.id.nota1);
        nota2=(TextView) findViewById(R.id.nota2);
        nota3=(TextView) findViewById(R.id.nota3);
    }
    //try catch lo mejor del manejo de excepciones
    public void Generar(View view) {
        try {
            //Convertirmos el texto ingresado a mxl a String
            String valor1_String = et1.getText().toString();
            //Convertimos el String a un valor Double para hacer operaciones matemáticas
            double valor1 = Double.parseDouble(valor1_String);

            double valor_compra = valor1;
            double valor_caja=valor1*0.92;
            double valor_iue=valor1*0.13;
            double valor_it = valor1 * 0.03;
            //double valor_itpagar = valor1*0.03;

            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formato con dos decimales

            String compra_String = decimalFormat.format(valor_compra);
            String caja_String = decimalFormat.format(valor_caja);
            String iue_String=decimalFormat.format(valor_iue);
            String it_String=decimalFormat.format(valor_it);
            //String itpagar_String = decimalFormat.format(valor_itpagar);

            tvcompra.setText(compra_String);
            tvcompras2.setText("");
            tvcredito.setText("");
            tvcredito4.setText(caja_String);
            tvcaja5.setText("");
            tvcaja.setText(iue_String);
            debito.setText("");
            debito2.setText(it_String);
            //Mensajes para la glosa e informaicón complementaria
            glosa.setText("Glosa: Por el servicio (Ejemplo transporte) por la suma de: bs "+valor1+"  Realizando la respectiva retención");
            informacion.setText("Decreto Supremo. 4850, Retenciones");
            nota1.setText("La compra de bienes Muebles a personas naturales y sucesiones indivisas que no estén respaldados por la factura correspondiente, serán sujetas a la retención de los siguientes impuestos.");
            nota2.setText("");
            if(valor1>=50000){
                nota3.setText("");
            }

        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
