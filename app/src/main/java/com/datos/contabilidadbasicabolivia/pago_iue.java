package com.datos.contabilidadbasicabolivia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.datos.contabilidadbasicabolivia.R;

import java.text.DecimalFormat;
import java.util.Random;

public class pago_iue extends AppCompatActivity {

    private EditText et1;
    private TextView espacio_numero1,espacio_numero2, espacio_numero3,espacio_numero4,espacio_numero5,espacio_numero6,
            espacio_numero7,espacio_numero8,espacioliteral01,espacioliteral02,espacioliteral03;
    private TextView glosa, informacion,nota1,nota2,nota3,nota4,nota5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_iue);


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


        et1 = (EditText)findViewById(R.id.editTextNumber1);//Crédito fiscal IVA
        espacioliteral01=(TextView)findViewById(R.id.espacioletras1);
        espacioliteral02=(TextView)findViewById(R.id.espacioliteral2);
        espacioliteral03=(TextView)findViewById(R.id.espacioliteral3);
        espacio_numero1 = (TextView) findViewById(R.id.espacio_01);
        espacio_numero2=(TextView) findViewById(R.id.espacio_02);
        espacio_numero3= (TextView) findViewById(R.id.espacio_03);
        espacio_numero4=(TextView)findViewById(R.id.espacio_04);
        espacio_numero5=(TextView)findViewById(R.id.espacio_05);
        espacio_numero6 = (TextView) findViewById(R.id.espacio_06);
        espacio_numero7=(TextView)findViewById(R.id.espacio_07);
        espacio_numero8 = (TextView) findViewById(R.id.espacio_08);
        //espacio de informaicón
        glosa=(TextView) findViewById(R.id.glosa_01);
        informacion=(TextView) findViewById(R.id.informacion);
        nota1=(TextView) findViewById(R.id.nota1);
        nota2=(TextView) findViewById(R.id.nota2);
        nota3=(TextView) findViewById(R.id.nota3);
        nota4=(TextView) findViewById(R.id.nota4);
        nota5=(TextView) findViewById(R.id.nota5);
    }
    //try catch lo mejor del manejo de excepciones
    public void Generar(View view) {
        try {
            String valor1_String = et1.getText().toString();
            double valor1 = Double.parseDouble(valor1_String);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            //formatear números decimales en diferentes representaciones
            if(valor1>0){
                double ganacia=valor1;
                double iue_pagar=valor1*0.25;
                double iue_ejercicio=valor1*0.75;
                String valor_ganacias=decimalFormat.format(ganacia);
                String valor_iue_pagar=decimalFormat.format(iue_pagar);
                String valor_iue_ejercicio=decimalFormat.format(iue_ejercicio);
                espacioliteral01.setText("Ganancia Neta Antes del IUE");
                espacioliteral02.setText("  IUE por pagar");
                espacioliteral03.setText("  Ganancias Neta del Ejercicio");
                espacio_numero1.setText(""+valor_ganacias);
                espacio_numero2.setText("");
                espacio_numero3.setText("");
                espacio_numero4.setText(""+valor_iue_pagar);
                espacio_numero5.setText("");
                espacio_numero6.setText(""+valor_iue_ejercicio);
                espacio_numero7.setText("");
                espacio_numero8.setText("");
                glosa.setText("Glosa: Por el calculo del Impuesto sobre la Utilidad de las Empresas");
                informacion.setText("Información Complementaria.- ley 843 Artículo 47 Determinación de la Utilidad Neta, Artículo 50, Alícuota quedan sujetas a la tasa del 25%.");
                nota2.setText("Nota 1.- Decreto Supremo Nº 24051, Artículo 7, Determinación.- Para determinar la Utilidad Neta sujeta al impuesto, se restará de la Utilidad Bruta los gastos necesarios para obtenerla y, en su caso, para mantener y conservar la fuente, cuya deducción admite la ley y este reglamento.");
                nota3.setText("Nota 2.- Decreto Supremo Nº 24051, Artículo 18, Conceptos No Deducibles");
                nota4.setText("Nota 3.- Decreto Supremo Nº 24051, Artículo 33 (Liquidación del impuesto) ");
            }else if(valor1<=0){
                double iue_compensar=valor1;
                double iue_pagar=valor1;
                String valor_iue_compensar=decimalFormat.format(iue_compensar );
                String valor_iue_pagar=decimalFormat.format(iue_pagar);
                espacioliteral01.setText("Ganancias Neta antes del IUE");
                espacioliteral02.setText("Perdida de la gestión");
                espacioliteral03.setText("");
                espacio_numero1.setText("-"+iue_compensar);
                espacio_numero2.setText("");
                espacio_numero3.setText("");
                espacio_numero4.setText(""+iue_pagar);
                espacio_numero5.setText("");
                espacio_numero6.setText("");
                espacio_numero7.setText("");
                espacio_numero8.setText("");
                glosa.setText("Glosa: Por el registro de perdida de la gestion");
                informacion.setText("Información Complementaria.- ley 843 Artículo 48, Compensación de Pérdida.");
                nota2.setText("Nota 1.- Decreto Supremo Nº 24051, Artículo 32 (Pérdida Trasladable) Las empresas domiciliadas en el país podrán compensar la Pérdida neta total de fuente boliviana que experimenten en el ejercicio gravable, imputándola hasta agotar su importe, a las utilidades que se obtengan en los ejercicios inmediatos siguiente, debiendo actualizarse conforme a lo dispuesto en el segundo párrafo del Artículo 48º de la Lay Nº 843.");
                nota3.setText("");
                nota4.setText("");
            }
            //mesajes
            nota5.setText("Resolución normativa 101800000004\nCAPITULO II Artículo 4. los sujetos pasivos del impuestos solbre las Utilidades de Las Empresas (IUE) obligados a llevar registros contables de acuerdo a normativa vigente, adicionalmente al envío del Formuilario 605, Deberán cumplir con lo siguiente: \n" +
                    "Contribuyentes con Ventas y/o Engresos Brutos Anuales, iguales o mayores a Bs 1.200.000.- Presentar Informaicón Tributaria Complementaria ");
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}