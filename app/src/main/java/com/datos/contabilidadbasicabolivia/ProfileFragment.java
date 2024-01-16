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
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Encuentra el botón por su ID
        Button btnProfile = view.findViewById(R.id.activouno);

        // Configura un OnClickListener para el botón
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ActividadUno
                Intent intent = new Intent(getActivity(), PlanCuentaUno.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });
        // Encuentra el segundo botón por su ID
        Button btnActividadDos = view.findViewById(R.id.pasivos);

        // Configura un OnClickListener para el segundo botón
        btnActividadDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ActividadDos
                Intent intent = new Intent(getActivity(), PlanCuentaPasivo.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });
        // Encuentra el tercero botón por su ID
        Button btnActividadTres = view.findViewById(R.id.patrimonio);

        // Configura un OnClickListener para el segundo botón
        btnActividadTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ActividadDos
                Intent intent = new Intent(getActivity(), PlandeCuentaPatrimonio.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });
        // Encuentra el cuarto botón por su ID
        Button btnActividadCuatro = view.findViewById(R.id.ingresos);

        // Configura un OnClickListener para el segundo botón
        btnActividadCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ActividadDos
                Intent intent = new Intent(getActivity(), PlanCuentasIngresos.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });
        // Encuentra el quinto botón por su ID
        Button btnActividadCinto = view.findViewById(R.id.egresos);

        // Configura un OnClickListener para el segundo botón
        btnActividadCinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ActividadDos
                Intent intent = new Intent(getActivity(), PlanCuentasEgresos.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });
    }
}