package com.example.a41615045.simulacro;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by 41615045 on 13/12/2016.
 */
public class Vehiculo implements Serializable {
    String marca;
    float longitud;
    int velocidad;

    public Vehiculo(String marca, float longitud, int velocidad) {
        this.marca = marca;
        this.longitud = longitud;
        this.velocidad = velocidad;
    }

    public Vehiculo() {};

    public String getMarca() {
        return marca;
    }

    public float getLongitud() {
        return longitud;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
