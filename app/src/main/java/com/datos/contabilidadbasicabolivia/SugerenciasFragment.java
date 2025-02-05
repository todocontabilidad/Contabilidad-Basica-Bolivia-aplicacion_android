package com.datos.contabilidadbasicabolivia;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class SugerenciasFragment extends Fragment {

    private EditText nameEditText, ageEditText, colorEditText;
    private Button addButton;
    private FirebaseFirestore mfirestore;

    public SugerenciasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sugerencias, container, false);

        // Initialize views
        nameEditText = view.findViewById(R.id.nombre);
        ageEditText = view.findViewById(R.id.edad);
        colorEditText = view.findViewById(R.id.color);
        addButton = view.findViewById(R.id.btn_add);

        mfirestore = FirebaseFirestore.getInstance();

        // Button click listener
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString().trim();
                String age = ageEditText.getText().toString().trim();
                String color = colorEditText.getText().toString().trim();

                if (!name.isEmpty() && !age.isEmpty() && !color.isEmpty()) {
                    addPet(name, age, color);
                } else {
                    // Show error message if any field is empty
                    // You can customize this part as per your requirement
                    // For now, showing a toast message
                    Toast.makeText(getActivity(), "Ingrese todos los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    private void addPet(String namepet, String agepet, String colorpet) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", namepet);
        map.put("age", agepet);
        map.put("color", colorpet);
        mfirestore.collection("pet").add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getActivity(), "¡SUGERENCIA GUARDADA EXITOSAMENTE!", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getActivity(), "ERROR, REVISE SU CONEXIÓN A INTERNET", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
