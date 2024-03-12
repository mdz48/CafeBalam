package com.alilopez.application.models;

import java.time.LocalDate;

public class Venta {
    protected String idVenta;
    protected double monto;
    protected LocalDate fecha;
    protected double cantidad;

    public Venta(String idVenta, double monto, LocalDate fecha, double cantidad) {
        this.idVenta = idVenta;
        this.monto = monto;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getCantidad() {
        return cantidad;
    }
}
