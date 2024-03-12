package com.alilopez.application.models;

import java.time.LocalDate;

public class VentaLocal extends Venta{
    private float descuentoLocal = 0;
    private String idVendedor;

    public VentaLocal(String idVenta, double monto, LocalDate date, double cantidad, float descuentoLocal, String idVendedor) {
        super(idVenta, monto, date, cantidad);
        this.descuentoLocal = descuentoLocal;
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "VentaLocal{" +
                "descuentoLocal=" + descuentoLocal +
                ", idVendedor='" + idVendedor + '\'' +
                ", idVenta='" + idVenta + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }



    public float getDescuentoLocal() {
        return descuentoLocal;
    }

    public String getIdVendedor() {
        return idVendedor;
    }
}
