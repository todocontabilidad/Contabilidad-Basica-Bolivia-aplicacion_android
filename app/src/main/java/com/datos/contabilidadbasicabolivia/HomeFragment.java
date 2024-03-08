package com.datos.contabilidadbasicabolivia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



import com.datos.contabilidadbasicabolivia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // Encuentra el nuevo botón por su ID
        Button boton_compras = view.findViewById(R.id.compras01);
        boton_compras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la otra actividad
                Intent intent = new Intent(getActivity(), Compras.class);
                startActivity(intent);

            }
        });
        // Encuentra el nuevo botón por su ID
        Button boton_ventas = view.findViewById(R.id.ventas01);
        // Agrega un OnClickListener para el nuevo botón
        boton_ventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// intentando cambiar la variable
                // Crea un Intent para iniciar la actividad que desees aquí
                Intent intent = new Intent(getActivity(), Ventas.class);// Declarar la activity donde quieres ir
                startActivity(intent);
                /*no Olvides esto en el manifest--------->
                <activity android:name=".Ventas">
                <!-- Configuración de la actividad -->
                </activity>
                 */
            }
        });
        // Encuentra el botón por su ID
        Button botonLiquidacion = view.findViewById(R.id.liquidacion01);
        botonLiquidacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), Liquidacion.class);
                startActivity(siguiente);
            }
        });
        // Encuentra el botón por su ID
        Button boton_dev_compras = view.findViewById(R.id.dev_compras01);
        boton_dev_compras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), DevolucionCompras.class);
                startActivity(siguiente);
            }
        });
        // Encuentra el botón por su ID
        Button boton_dev_ventas = view.findViewById(R.id.dev_ventas01);
        boton_dev_ventas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), DevolucionVentas.class);
                startActivity(siguiente);
            }
        });
        Button boton_gasolina= view.findViewById(R.id.compra_gasolina01);
        boton_gasolina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), Gasolina.class);
                startActivity(siguiente);
            }
        });
        Button boton_liquidacion_it= view.findViewById(R.id.liquidacion_it01);
        boton_liquidacion_it.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), LiquidacionIT.class);
                startActivity(siguiente);
            }
        });
        Button boton_compra_activo= view.findViewById(R.id.compra_activo);
        boton_compra_activo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), compra_Activos.class);
                startActivity(siguiente);
            }
        });
        Button boton_venta_activo= view.findViewById(R.id.venta_activo);
        boton_venta_activo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), venta_Activos.class);
                startActivity(siguiente);
            }
        });
        Button boton_iue= view.findViewById(R.id.pago_iue);
        boton_iue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), pago_iue.class);
                startActivity(siguiente);
            }
        });
        Button boton_ajuste= view.findViewById(R.id.ajuste);
        boton_ajuste.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), Ajuste_Contable.class);
                startActivity(siguiente);
            }
        });

        Button boton_depreciacion= view.findViewById(R.id.depreciacion);
        boton_depreciacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent siguiente = new Intent(getActivity(), venta_Activos.class);
                startActivity(siguiente);
            }
        });


        return view;
    }
}
//debes declara para cada botón, se encuentre reflejado en el manifests
/*
<activity android:name=".Compras">
    <!-- Otras configuraciones de actividad -->
</activity>
 */