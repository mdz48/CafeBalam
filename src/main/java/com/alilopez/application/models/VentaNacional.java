package com.alilopez.application.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VentaNacional extends Venta{
    private float costoEnvio;
    private String direccion;

    public VentaNacional(String idVenta, double monto, LocalDateTime date, double cantidad, float costoEnvio, String direccion) {
        super(idVenta, monto, date, cantidad);
        this.costoEnvio = costoEnvio;
        this.direccion = direccion;
    }
    public float getCostoEnvio() {
        return costoEnvio;
    }

    public String getDireccion() {
        return direccion;
    }
}
