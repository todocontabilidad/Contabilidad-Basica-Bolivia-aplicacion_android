package com.datos.contabilidadbasicabolivia;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.datos.contabilidadbasicabolivia.R;

import java.text.DecimalFormat;

public class Compras extends AppCompatActivity {

    private EditText et1;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja;
    private TextView glosa,informacion,nota1,nota2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

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

            double valor_compra = valor1 * 0.87;
            double valor_credito = valor1 * 0.13;
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
            glosa.setText("Glosa: Por la compra de (Activo adquirido) por la suma de: bs "+valor1);
            informacion.setText("Información normativa. ley 843, de creación del Impuesto al Valor Agregado, Decredo Supremo Nº 21530 Reglamento del impuesto al valor agregado, Articulo 8.");
            nota1.setText("Reglamento Administrativo del IVA (R.A. 05-0039-99 Texto Ordenado).\nHabitualidad en el IVA (RND Nº 10-0043-05).\nProcedimiento para la aplicación del régimen tasa cero del IVA dispuesto por la Ley Nº 3249(RND Nº 10-0012-06)\nDeterminación de crédito fiscal computable en el impuesto al valor agregado para operaciones gravadas con tasa cero (RND Nº 10-0038-13)\n" +
                    "Compras vinculadas a la acrividad gravada del sector trasnporte interdepartamental e internacional de pasajeros y carga (RND Nº 10-0019-16)\nEjercicio de actividades como contribuyentes del RC-IVA y contribuyente del IVA, IT e IUE (RND Nº101700000004)\nVenta de bines y/o servicios del proveedro a personas naturales no inscritas en el Padrón Nacional de Contribuyentes, contribuyentes del Régimen tributario simplificado y a través de comisionistas(RND Nº 101700000014)");
            nota2.setText("Nota 1. No se toma el sistema perpetuo en el ejemplo dado, ¿que es el sistema perpetuo? Este sistema permite a las empresas hacer un seguimiento de sus niveles de inventario en tiempo real, lo que facilita el " +
                    "control de los niveles de existencias y evita que se agoten los artículos.");

        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
/*
    int i1=0;
    public void onClick(View v){
        String mensaje="";
        int duracion=1;
        if(v.getId()==R.id.button){
            i1++;
            ((TextView)v).setText("Pulsado "+i1+" veces");

        }
    }
    cambio de boton de la forma segunda
    Button myButton1 = findViewById(R.id.button6);
        int red = 255; // Valor de rojo
        int green = 0; // Valor de verde
        int blue = 128; // Valor de azul
        int color = Color.rgb(red, green, blue); // Combinar los valores para obtener el color deseado
        myButton1.setBackgroundColor(color); // Cambiar al color personalizado

    */
}