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

public class venta_Activos extends AppCompatActivity {

    private EditText et1,et2;
    //agregar el txt view
    private TextView espacio_numero1,espacio_numero2, espacio_numero3,espacio_numero4,espacio_numero5,espacio_numero6,
            espacio_numero7,espacio_numero8,espacioliteral01,espacioliteral02,espacioliteral03;
    private TextView glosa, informacion,nota1,nota2,nota3,nota4,nota5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta_activos);


        // Encuentra la TableRow y el TextView por sus ID en el layout activity_compra_activos
        TableRow tableRow = findViewById(R.id.tableRow);
        TextView textView = findViewById(R.id.glosa_01);

        // Define una lista de colores de fondo
        int[] backgroundColors = {
                Color.parseColor("#1565c0"), // Azul oscuro
                Color.parseColor("#4caf50"), // Verde
                Color.parseColor("#f44336"), // Rojo
                Color.parseColor("#ff9800"), // Naranja
                Color.parseColor("#9c27b0"), // Morado
                Color.parseColor("#009688"), // Turquesa
                Color.parseColor("#607d8b"), // Gris azulado
                Color.parseColor("#673ab7"), // Púrpura
                Color.parseColor("#795548"), // Marrón
                Color.parseColor("#3f51b5"), // Azul índigo
                Color.parseColor("#ff5722"), // Rojo anaranjado
                Color.parseColor("#e91e63"), // Rosa
                Color.parseColor("#00bcd4"), // Cian
                Color.parseColor("#ffc107"), // Ámbar
                Color.parseColor("#8bc34a"), // Lima
                Color.parseColor("#9e9e9e"), // Gris
                Color.parseColor("#ffeb3b")  // Amarillo
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
        textView.setTextColor(Color.WHITE);


        et1 = (EditText) findViewById(R.id.editTextNumber);//Débito fiscal IVA
        et2 = (EditText)findViewById(R.id.editTextNumber1);//Crédito fiscal IVA
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
            String valor2_String = et2.getText().toString();
            double valor2 = Double.parseDouble(valor2_String);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");//formatear números decimales en diferentes representaciones
            // Convertir la cadena a minúsculas antes de usarla en el switch
            valor1_String = valor1_String.toUpperCase();

            switch (valor1_String) {
                case "EDIFICIOS":
                    nota1.setText("Años de vida util 40, coeficiente 2.5%.");
                    break;
                case "MUEBLES":
                    nota1.setText("Años de vida util 10, coeficiente 10%.");
                    break;
                case "MAQUINARIA":
                    nota1.setText("Años de vida útil 8, coeficiente 12.5%.");
                    break;
                case "BARCOS Y LANCHAS EN GENERAL":
                    nota1.setText("Años de vida util 8, coeficiente 12.5%.");
                    break;
                case "VEHÍCULOS":
                    nota1.setText("Años de vida util 5, coeficiente 20%.");
                    break;
                case "AVIONES":
                    nota1.setText("Años de vida util 5, coeficiente 20%.");
                    break;
                case "MAQUINARIA PARA LA CONSTRUCCIÓN":
                    nota1.setText("Años de vida util 5, coeficiente 20%.");
                    break;
                case "MAQUINARIA AGRÍCOLA":
                    nota1.setText("Años de vida util 4, coeficiente 25%.");
                    break;
                case "ANIMALES DE TRABAJO":
                    nota1.setText("Años de vida util 4, coeficiente 25%.");
                    break;
                case "HERRAMIENTAS":
                    nota1.setText("Años de vida util 4, coeficiente 25%.");
                    break;
                case "EQUIOPS DE COMPUTACIÓN":
                    nota1.setText("Años de vida util 4, coeficiente 25%.");
                    break;
                case "FRUTALES":
                    nota1.setText("Años de vida util 10, coeficiente 10%.");
                    break;
                case "TERRENOS":
                    nota1.setText("Norma de contabilidad Nº16. Con algunas excepciones, tales como minas, canteras y vertederos, los\n" +
                            "terrenos tienen una vida útil ilimitada, y por tanto no se deprecian..");
                default:
                    nota1.setText("Error. Intenta de Nuevo o busca en el anexo del decreto supremo 24051.");
                    break;
            }//realizar el registro de la transacción
            double compra=valor2*0.87;
            double credito=valor2*0.13;
            double caja=valor2;
            String valor_compra =decimalFormat.format(compra);
            String valor_credito =decimalFormat.format(credito);
            String valor_caja=decimalFormat.format(caja);
            espacioliteral01.setText(""+valor1_String);
            espacioliteral02.setText("Crédito fiscal IVA");
            espacioliteral03.setText("  Caja Moneda Nacional");
            espacio_numero1.setText(""+compra);
            espacio_numero2.setText("");
            espacio_numero3.setText(""+credito);
            espacio_numero4.setText("");
            espacio_numero5.setText("");
            espacio_numero6.setText(""+caja);
            espacio_numero7.setText("");
            espacio_numero8.setText("");
            //mesajes
            glosa.setText("Glosa: Por la adquisición de: "+valor1_String+" Reconocido al 87%");
            informacion.setText("Información Complementaria.- Norma de Contabilidad Internacional Nº16, Reconocimiento de un activo, La compra debe ser un bien tangible o intangible que la empresa espera utilizar durante más de un periodo y que se espera que genere beneficios económicos futuros, pero no se los obtiene para ser destinados a su venta.");
            nota2.setText("El Artículo 3° del Decreto Supremo N° 24484 aborda el aspecto tributario relacionado con la valuación del activo fijo. Aunque fue emitido para establecer el régimen tributario simplificado, también incluye criterios relevantes para la valoración de activos fijos dentro de la normativa vigente. CRITERIOS DE VALORACIÓN DE LOS ACTIVOS FIJOS\n" +
                    "\n" +
                    "Para la valoración de los activos fijos señalados en los puntos 1.b) y 2.b) que anteceden, deberán tomarse en cuenta las condiciones físicas y los años de vida útil restantes de dichos bienes, debiendo considerarse para este propósito, los siguientes aspectos:\n" +
                    "\n" +
                    "El valor de adquisición de cada uno de los componentes del activo fijo, en el caso de que sean nuevos, debe estar respaldado por las respectivas facturas de compra emitidas a nombre del sujeto pasivo de este régimen tributario.\n" +
                    "\n" +
                    "En el caso de activos fijos usados, el valor se determinará tomando en consideración los siguientes elementos:\n" +
                    "\n" +
                    "El valor de mercado como punto de referencia.\n" +
                    "Determinación de la depreciación acumulada que corresponde por el número de años de uso, de acuerdo a los siguientes porcentajes de depreciación anual.");
            nota3.setText("En base al Artículo 22 del D.S.24051\n" +
                    "\n" +
                    "Las reparaciones ordinarias que se efectúen en los bienes del activo fijo, serán deducibles como gastos del ejercicio fiscal siempre que no supere el veinte por ciento  (20%)  del  valor  del  bien.  El  valor  de  reparaciones  superiores  a  este porcentaje se considerará mejora que prolonga la vida útil del bien y, por lo tanto, se imputará al costo del activo respectivo y su depreciación se efectuará en fracciones anuales iguales al período que le resta de vida útil.");
            nota4.setText("Norma de Contabilidad Internacional 16.- La entidad evaluará, de acuerdo con este principio de reconocimiento, todos los costos de propiedades,\n" +
                    "planta y equipo en el momento en que se incurre en ellos. Estos costos comprenden tanto aquéllos en que se\n" +
                    "ha incurrido inicialmente para adquirir o construir una partida de propiedades, planta y equipo, como los\n" +
                    "costos incurridos posteriormente para añadir, sustituir parte de o mantener el elemento correspondiente.");
            nota5.setText("La depreciación se debe determinar sistemáticamente a través de métodos de reconocido valor técnico, como el de línea recta, suma de los dígitos de los años, unidades de producción u horas de trabajo. En la legislación boliviana solo se acepta el de línea recta según los porcentajes de de depreciacion de arriba.\n" +
                    "\n" +
                    "La depreciación periódica debe tratarse como gasto, lo que genera un asiento de ajuste, el cual afecta los resultados operacionales de la empresa y su situación financiera.");
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es válida
            Toast.makeText(this, "Ingrese valores validos, sin comas", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}