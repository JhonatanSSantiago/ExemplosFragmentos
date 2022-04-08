package com.jhonssantiago.exemplo2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2 extends Fragment {
    private EditText curso;
    private Button buttonT2;
    private TextView textViewT2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.tela2, container, false);

        curso=view.findViewById(R.id.curso);
        buttonT2=view.findViewById(R.id.buttonT2);
        textViewT2=view.findViewById(R.id.textViewT2);

        buttonT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewT2.setText(curso.getText().toString());
            }
        });

        return view;

    }
}