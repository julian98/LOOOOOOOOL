package com.example.a41615045.simulacro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 41615045 on 13/12/2016.
 */
public class VehiculoAdapter extends BaseAdapter {
    ArrayList<Vehiculo> vehiculos;
    Context context;

    public VehiculoAdapter(Context context, ArrayList<Vehiculo> vehiculos) {
        this.context = context;
        this.vehiculos = vehiculos;
    }

    @Override
    public int getCount() {
        return vehiculos.size();
    }

    @Override
    public Object getItem(int i) {
        return vehiculos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) context
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.l3, viewGroup, false);
            }
        TextView marca = (TextView)view.findViewById(R.id.marca);
        TextView longitud = (TextView)view.findViewById(R.id.longitud);
        TextView velocidad = (TextView)view.findViewById(R.id.velocidad);


        Vehiculo p = vehiculos.get(i);
        marca.setText(p.getMarca());
        longitud.setText(String.valueOf(p.getLongitud()));
        velocidad.setText(String.valueOf(p.getVelocidad()));
        return view;
    }

}

