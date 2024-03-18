package com.alilopez.application.models;

import java.time.LocalDate;

public class VentaNacional extends Venta{
    private float costoEnvio;
    private String direccion;

    public VentaNacional(String idVenta, double monto, LocalDate date, double cantidad, float costoEnvio, String direccion) {
        super(idVenta, monto, date, cantidad);
        this.costoEnvio = costoEnvio;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "VentaNacional{" +
                "costoEnvio=" + costoEnvio +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public String getDireccion() {
        return direccion;
    }
}
