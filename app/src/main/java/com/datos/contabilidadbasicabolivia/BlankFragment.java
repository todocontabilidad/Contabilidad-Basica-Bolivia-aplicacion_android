package com.datos.contabilidadbasicabolivia;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.NIC;
import com.datos.contabilidadbasicabolivia.R;

public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
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
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        // Encuentra la referencia al botón en tu layout
        Button button = view.findViewById(R.id.your_button_id);

        // Establece el OnClickListener para el botón
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar la nueva actividad
                Intent intent = new Intent(getActivity(),NIIF.class);
                // Puedes agregar datos adicionales al Intent si es necesario
                // intent.putExtra("clave", valor);
                // Inicia la nueva actividad
                startActivity(intent);
            }
        });

        // Encuentra la referencia al segundo botón en tu layout
        Button button2 = view.findViewById(R.id.button2);
        // Establece el OnClickListener para el segundo botón
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar la nueva actividad
                Intent intent = new Intent(getActivity(), NIC.class);
                // Puedes agregar datos adicionales al Intent si es necesario
                // intent.putExtra("clave", valor);
                // Inicia la nueva actividad
                startActivity(intent);
            }
        });

        return view;
    }
}
