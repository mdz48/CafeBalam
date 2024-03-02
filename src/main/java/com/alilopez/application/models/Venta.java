package com.alilopez.application.models;

public class Venta {
    private String idVenta;
    private float monto;

    public Venta(String idVenta, float monto) {
        this.idVenta = idVenta;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta='" + idVenta + '\'' +
                ", monto=" + monto +
                '}';
    }
}
