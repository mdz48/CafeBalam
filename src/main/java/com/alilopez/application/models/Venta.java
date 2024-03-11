package com.alilopez.application.models;

import java.time.LocalDate;

public class Venta {
    protected String idVenta;
    protected float monto;
    protected LocalDate fecha;

    public Venta(String idVenta, float monto, LocalDate date) {
        this.idVenta = idVenta;
        this.monto = monto;
        this.fecha = date;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta='" + idVenta + '\'' +
                ", monto=" + monto +
                '}';
    }
}
