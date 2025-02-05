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

public class Liquidacion extends AppCompatActivity {

    private EditText et1,et2;
    //agregar el txt view
    private TextView tvcompra,tvcompras2, tvcredito,tvcredito4, tvcaja5,tvcaja,debito,debito2,it,it2,espacioliteral01,espacioliteral02,espacioliteral03;
    private TextView glosa,informacion,nota1,nota2,nota3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquidacion);

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


        et1 = (EditText) findViewById(R.id.editTextNumber);//Débito fiscal IVA
        et2 = (EditText)findViewById(R.id.editTextNumber1);//Crédito fiscal IVA
        espacioliteral01=(TextView)findViewById(R.id.espacioletras1);
        espacioliteral02=(TextView)findViewById(R.id.espacioliteral2);
        espacioliteral03=(TextView)findViewById(R.id.espacioliteral3);
        tvcompra = (TextView) findViewById(R.id.espacio_01);
        tvcompras2=(TextView) findViewById(R.id.espacio_02);
        tvcredito = (TextView) findViewById(R.id.espacio_03);
        tvcredito4=(TextView)findViewById(R.id.espacio_04);
        tvcaja5=(TextView)findViewById(R.id.espacio_05);
        tvcaja = (TextView) findViewById(R.id.espacio_06);
        debito=(TextView)findViewById(R.id.espacio_07);
        debito2=(TextView)findViewById(R.id.espacio_08);
        //it=(TextView)findViewById(R.id.espacio_09);No existe una documento o textvew llamado espacio_09
        //it2=(TextView)findViewById(R.id.espacio_10);
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
            String valor2_String = et2.getText().toString();
            double valor1 = Double.parseDouble(valor1_String);
            double valor2 = Double.parseDouble(valor2_String);
            //despues del la declaración if para no generar apuntadores
            DecimalFormat decimalFormat = new DecimalFormat("#.##");//formatear números decimales en diferentes representaciones
            //IF para las condición de cual es mayor el crédito o el débito
            if(valor1>valor2 ){
                double debito_fiscal=valor1;
                double caja = valor1-valor2;
                double credito=valor2;
                String valor_debito =decimalFormat.format(debito_fiscal);
                String valor_caja =decimalFormat.format(caja);
                String valor_credito=decimalFormat.format(credito);
                espacioliteral01.setText("DÉBITO FISCAL IVA");
                tvcompra.setText(valor_debito);
                tvcompras2.setText("");
                espacioliteral02.setText("   CAJA MONEDA NACIONAL");
                tvcredito.setText("");
                tvcredito4.setText(valor_caja);
                espacioliteral03.setText("   CRÉDITO FISCAL IVA");
                tvcaja5.setText("");
                tvcaja.setText(valor_credito);
                debito.setText("");
                debito2.setText("");
                //mesajes
                glosa.setText("Glosa: Por la compensación y pago del saldo del IVA: bs "+valor1);
                informacion.setText("Información normativa. ley 843. Art 7 y 8, DS: 21530 Impuesto al Valor Agregado, Art 10 liquidación");
                nota1.setText("Nota Informativa: Sobre el tema de redondeo, la regla según RND 10-0025-10, es:\n" +
                        "\n" +
                        "De 0.50 para arriba, al inmediato superior\n" +
                        "Hasta 0.49, al inmediato inferior");
                nota2.setText("RND 10-0025-10 Artículo 2.– (Tratamiento de decimales) I. Los importes obtenidos en formularios y boletas de pago  deben  ser presentados sin decimales, para tal efecto  se redondeará al número entero superior cuando el decimal sea igual o superior a 0,50 y al número entero inferior cuando el decimal sea igual o inferior a 0,49.");
            }if (valor1 <= valor2){
                double debito1=valor1;
                double compensar = valor2-valor1;
                double credito=valor2;
                String valor_debito =decimalFormat.format(debito1);
                String valor_compensar =decimalFormat.format(compensar);
                String valor_credito=decimalFormat.format(credito);
                espacioliteral01.setText("DÉBITO FISCAL IVA");
                tvcompra.setText(valor_debito);
                tvcompras2.setText("");
                espacioliteral02.setText("CRÉDITO FISCAL IVA (para el siguiente periodo)");
                tvcredito.setText(valor_compensar);
                tvcredito4.setText("");
                espacioliteral03.setText("   CRÉDITO FISCAL IVA");
                tvcaja5.setText("");
                tvcaja.setText(valor_credito);
                debito.setText("");
                debito2.setText("");
                glosa.setText("Glosa: Por la compensación del saldo del IVA: bs "+valor1);
                informacion.setText("DS: 21350 Impuesto al valor agregado. Art 9 Los saldos a favor del contribuyente serán actualizados por la variación de las Unidades de Fomento a la Vivienda (UFV), con relación al Boliviano, producida entre el último día hábil del mes en que se determinó el saldo a favor y el último día hábil del mes siguiente, y así sucesivamente en cada liquidación mensual hasta que el saldo a favor quede compensado.");
                nota1.setText("Como actualizar el credito fiscal. Para saber como se actualiza el credito fiscal en bolivia primero debemos saber que hay una formula para actualizar el credito fiscal en bolivia:\n" +
                        "\n" +
                        "Saldo actualizado = (UFV final / UFV inicial) * Saldo histórico");
            }if(valor1==valor2){
                double debito_fiscal=valor1;
                double credito=valor2;
                String valor_debito =decimalFormat.format(debito_fiscal);
                String valor_credito =decimalFormat.format(credito);
                espacioliteral01.setText("DÉBITO FISCAL IVA");
                tvcompra.setText(valor_debito);
                tvcompras2.setText("");
                espacioliteral02.setText("   CRÉDITO FISCAL IVA");
                tvcredito.setText("");
                tvcredito4.setText(valor_credito);
                espacioliteral03.setText("");
                tvcaja5.setText("");
                tvcaja.setText("");
                debito.setText("");
                debito2.setText("");
                glosa.setText("Glosa: Por la compensación del saldo del IVA: bs "+valor1);
                informacion.setText("Información normativa. ley 843, DS: 21530 Impuesto al Valor Agregado");
                nota1.setText("Nota Informativa: Procedimiento para la aplicación del régimen tasa cero del IVA dispuesto por Ley Nº 3249 (RND Nº 10-0012-06).");
                nota2.setText("Nota Informativa: Determinación de crédito fiscal computable en el Impuesto al Valor Agregado para operaciones gravadas con tasa cero (RND Nº 10-0038-13).");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
/*
RND 10-0025-10 Redondeo en pago de impuestos
Última actualización: noviembre 10, 2019
Acerca del redondeo en pago de impuestos
Sobre el tema de redondeo, la regla según RND 10-0025-10, es:

De 0.50 para arriba, al inmediato superior
Hasta 0.49, al inmediato inferior
Ejemplo de diferencia por redondeo
Por ejemplo tenemos el cálculo según UFVs:

Si el total de mi libro compras suma el monto de 2298.50 con su actualización.

¿ese monto se puede redondear a 2299 Bs., o se queda en el monto de 2298 Bs?

El monto sería: 2299 Bs.

Ajuste y tratamiento por redondeo en pago de impuestos
Puede ser que entonces de una actualización o varias tengamos diferencias de redondeo que no nos permitirán cuadrar exactamente con lo declarado en formularios.

Para lo cual se debe hacer un ajuste por redondeo:

—- x —

Débito Fiscal                         4650.00

Diferencias por reondeo            1.00

Caja                                                           4651.00

—- Por le pago del Débito Fiscal IVA y diferencias de redondeo según RND 10-0025-10

RND sobre reondeo
A continuación copiamos la normativa acerca del tratamiento de los decimales en el pago de impuestos.

RND 10-0025-10
La Paz, 03 de noviembre de 2010

CONSIDERANDO:

Que el numeral 11º de la Resolución Administrativa Nº 05-0048-99 de 23 de septiembre de 1999, establece el procedimiento para la presentación de declaraciones juradas y boletas de pago sin decimales, estableciendo un criterio de redondeo.

Que en fecha  17 de octubre de 2010  se publicó la Resolución Normativa de Directorio No. 10.0022.10 de fecha  11 de octubre de 2010,  regulando el tratamiento de los decimales a ser considerados en importes de procesos tributarios, generando confusión en cuanto a su tratamiento por existir errores en la publicación, estableciéndose la necesidad de emitir la presente disposición.

Que de acuerdo al inciso p) del Artículo 19 del Decreto Supremo No. 26462  de 22 de diciembre de 2001,  excepcionalmente y cuando las circunstancias lo justifiquen, el Presidente Ejecutivo del Servicio de Impuestos Nacionales puede  ejecutar acciones que son de competencia del Directorio, en ese sentido, el inciso  a) del numeral 1. de la Resolución Administrativa de Directorio No. 09 – 0011 – 02 autoriza al Presidente Ejecutivo a suscribir Resoluciones Normativas de Directorio cuando la urgencia del acto así lo imponga, para su posterior homologación.

POR TANTO:

El Presidente Ejecutivo a.i. del Servicio de Impuestos Nacionales, a nombre del Directorio de la institución, en uso de las facultades conferidas por el Artículo 64 de la Ley No. 2492  de 2 de agosto de 2003,  Código Tributario Boliviano, inciso  p) del Artículo 19 del Decreto Supremo No. 26462  de 22 de diciembre de 2001 y en cumplimiento de lo dispuesto en el inciso a) del numeral 1. de la Resolución Administrativa de Directorio No. 09 – 0011 – 02 de 28 de agosto de 2002.

RESUELVE:

Artículo 1.– (Objeto)

La presente Resolución Normativa de Directorio tiene  por objeto  determinar el número de decimales que deben  ser considerados en el cálculo de la Deuda  Tributaria, así como el redondeo en pago de impuestos y  los importes obtenidos en declaraciones juradas.

Artículo 2.– (Tratamiento de decimales) I. Los importes obtenidos en formularios y boletas de pago  deben  ser presentados sin decimales, para tal efecto  se redondeará al número entero superior cuando el decimal sea igual o superior a 0,50 y al número entero inferior cuando el decimal sea igual o inferior a 0,49.

II. Si del cálculo de cada uno de los componentes de la Deuda Tributaria resultare un número decimal, se tomará cinco (5) dígitos después de la coma. El importe obtenido como deuda tributaria deberá redondearse con el criterio establecido en el parágrafo I.
DISPOSICIONES ABROGATORIAS Y DEROGATORIAS

Primera.– Abrogar la Resolución Normativa de Directorio No. 10.0022.10 de fecha  11 de octubre de 2010, publicada el 17 de octubre de 2010.

Segunda.– Derogar el numeral 11º de la Resolución Administrativa Nº 05-0048-99 de 23 de septiembre de 1999.
 */