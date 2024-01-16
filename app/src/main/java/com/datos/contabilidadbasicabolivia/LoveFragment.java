package com.datos.contabilidadbasicabolivia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.datos.contabilidadbasicabolivia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoveFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoveFragment newInstance(String param1, String param2) {
        LoveFragment fragment = new LoveFragment();
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
    //  Este es el método que infle el fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_love, container, false);

        // Busca el TextView en la vista inflada por su ID
        TextView textViewClickable = rootView.findViewById(R.id.textViewClickable);

        // Asigna un OnClickListener al TextView
        textViewClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCUnoActivity.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView textViewClickable1 = rootView.findViewById(R.id.textViewClickable1);

        // Asigna un OnClickListener al TextView
        textViewClickable1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCDosActivity.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_tres = rootView.findViewById(R.id.norma_tres);

        // Asigna un OnClickListener al TextView
        norma_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCTres.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_cuatro = rootView.findViewById(R.id.norma_cuatro);

        // Asigna un OnClickListener al TextView
        norma_cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCCuatro.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_cinco = rootView.findViewById(R.id.norma_cinco);

        // Asigna un OnClickListener al TextView
        norma_cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCCinco.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_seis = rootView.findViewById(R.id.norma_seis);

        // Asigna un OnClickListener al TextView para el boton 6
        norma_seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCSeis.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_siete = rootView.findViewById(R.id.norma_siete);

        // Asigna un OnClickListener al TextView
        norma_siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCSiete.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_ocho = rootView.findViewById(R.id.norma_ocho);

        // Asigna un OnClickListener al TextView
        norma_ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCOcho.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_nueve = rootView.findViewById(R.id.norma_nueve);

        // Asigna un OnClickListener al TextView
        norma_nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCNueve.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_diez = rootView.findViewById(R.id.norma_diez);

        // Asigna un OnClickListener al TextView
        norma_diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCDiez.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_once = rootView.findViewById(R.id.norma_once);

        // Asigna un OnClickListener al TextView
        norma_once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCOnce.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_doce = rootView.findViewById(R.id.norma_doce);

        // Asigna un OnClickListener al TextView
        norma_doce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCDoce.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_trece = rootView.findViewById(R.id.norma_trece);

        // Asigna un OnClickListener al TextView
        norma_trece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCTrece.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });
        TextView norma_catorce = rootView.findViewById(R.id.norma_catorce);

        // Asigna un OnClickListener al TextView
        norma_catorce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realiza la acción deseada cuando se toca el texto
                // Por ejemplo, puedes abrir una nueva actividad o mostrar un diálogo
                // Aquí puedes agregar tu lógica personalizada
                // Crea un Intent para dirigirte a la actividad "nc1"
                Intent intent = new Intent(getActivity(), NCCatorce.class); // Reemplaza NC1Activity con el nombre de tu actividad

                // Inicia la actividad
                startActivity(intent);
            }
        });



        return rootView;
    }

}