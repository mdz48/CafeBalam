package com.alilopez.application.models;

public class VentaNacional extends Venta{
    private float costoEnvio;
    private String direccion;

    public VentaNacional(String idVenta, float monto, float costoEnvio, String direccion) {
        super(idVenta, monto);
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
