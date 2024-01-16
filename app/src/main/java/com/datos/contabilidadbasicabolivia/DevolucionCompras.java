package com.datos.contabilidadbasicabolivia;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.datos.contabilidadbasicabolivia.R;

import java.text.DecimalFormat;

public class DevolucionCompras extends AppCompatActivity {

    private EditText et1;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja,debito,debito2,it,it2;
    private TextView glosa,informacion,nota1,nota2,nota3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devolucion_compras);

        et1 = (EditText) findViewById(R.id.editTextNumber);
        tvcompra = (TextView) findViewById(R.id.espacio_01);
        tvcompras2=(TextView) findViewById(R.id.espacio_02);
        tvcredito = (TextView) findViewById(R.id.espacio_03);
        tvcredito4=(TextView)findViewById(R.id.espacio_04);
        tvcaja5=(TextView)findViewById(R.id.espacio_05);
        tvcaja = (TextView) findViewById(R.id.espacio_06);
        debito=(TextView)findViewById(R.id.espacio_07);
        debito2=(TextView)findViewById(R.id.espacio_08);
        it=(TextView)findViewById(R.id.espacio_09);
        it2=(TextView)findViewById(R.id.espacio_10);
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

            double valor_caja= valor1;
            double valor_devolucion=valor1*0.87;
            double valor_debito=valor1*0.13;
            //double valor_caja = valor1;
            //double valor_it = valor1*0.03;

            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formato con dos decimales

            String devolucion_String = decimalFormat.format(valor_caja);
            String credito_String = decimalFormat.format(valor_devolucion);
            String itpagar_String=decimalFormat.format(valor_debito);
            //String caja_String=decimalFormat.format(valor_caja);
            //String it_String = decimalFormat.format(valor_it);

            tvcompra.setText(devolucion_String);
            tvcompras2.setText("");
            tvcredito.setText("");
            tvcredito4.setText(credito_String);
            tvcaja5.setText("");
            tvcaja.setText(itpagar_String);
            debito.setText("");
            debito2.setText("");
            it.setText("");
            it2.setText("");
            //Mensajes para la glosa e informaicón complementaria
            glosa.setText("Glosa: Por la compra de (Activo adquirido) por la suma de: bs "+valor1);
            informacion.setText("Información normativa. ley 843, DS: 21530 Impuesto al Valor Agregado");
            nota1.setText("Nota Informativa: Reglamento Administrativo del IVA (R.A. 05-0039-99 Texto Ordenado)");
            nota2.setText("Nota 2. No se toma el sistema perpetuo en el ejemplo dado, ¿que es el sistema perpetuo? Este sistema permite a las empresas hacer un seguimiento de sus niveles de inventario en tiempo real, lo que facilita el " +
                    "control de los niveles de existencias y evita que se agoten los artículos.");
            if(valor1>=50000){
                nota3.setText("Información complementaria: Como contribuyente tienes que saber que la bancarización obliga a las personas y empresas a realizar\" +\n" +
                        "                    \" sus transacciones necesariamente por bancos cuando éstas superen montos mayores a Bs50. 000, desde el 2011");
            }

        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}