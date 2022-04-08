package com.jhonssantiago.exemplo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonTela1, buttonTela2;
    private FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTela1=findViewById(R.id.buttonTela1);
        buttonTela2=findViewById(R.id.buttonTela2);
        fm = getSupportFragmentManager();
    }

    public void trocar(View view){
        if(view.getId() == R.id.buttonTela1){
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.telaPrincipal, new Tela1());
            ft.commit();
        }

        if(view.getId() == R.id.buttonTela2){
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.telaPrincipal, new Tela2());
            ft.commit();
        }
    }
}