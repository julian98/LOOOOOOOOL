package com.example.a41615045.simulacro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Vehiculo> vehiculos;
    EditText txtmarca,txtlongitud,txtvelocidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vehiculos = new ArrayList<>();
        txtmarca = (EditText) findViewById(R.id.txtmarca);
        txtlongitud = (EditText) findViewById(R.id.txtlongitud);
        txtvelocidad = (EditText) findViewById(R.id.txtvelocidad);

    }

    public void aClick(View view){

          //  Vehiculo v = new Vehiculo(txtmarca.getText().toString(),Float.valueOf(txtlongitud.getText().toString()),Integer.valueOf(txtlongitud.getText().toString()));
            Vehiculo v2 = new Vehiculo();
            v2.marca = txtmarca.getText().toString();
            v2.longitud = Float.valueOf(txtlongitud.getText().toString());
            v2.velocidad = Integer.valueOf(txtlongitud.getText().toString());
            vehiculos.add(v2);


    }

    public void lClick(View v) {

        Intent intent = new Intent(this, ListarActivity.class);
        intent.putExtra("vehic",vehiculos);
        startActivity(intent);
    }



    }

