package com.example.a41615045.simulacro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        ListView listVW;
        listVW = (ListView) findViewById(R.id.listVw);
        ArrayList<Vehiculo> vehiculos;

        Bundle extras = getIntent().getExtras();
        vehiculos = (ArrayList<Vehiculo>) extras.getSerializable("vehic");
        //vehiculos = new ArrayList<>();
        VehiculoAdapter adapter = new VehiculoAdapter(this,vehiculos);
        listVW.setAdapter(adapter);

    }

}
