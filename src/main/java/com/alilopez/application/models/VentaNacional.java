package com.alilopez.application.models;

import java.time.LocalDate;

public class VentaNacional extends Venta{
    private float costoEnvio;
    private String direccion;

    public VentaNacional(String idVenta, float monto, LocalDate date, float costoEnvio, String direccion) {
        super(idVenta, monto, date);
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
}
