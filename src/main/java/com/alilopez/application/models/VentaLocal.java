package com.alilopez.application.models;

import java.time.LocalDate;

public class VentaLocal extends Venta{
    private float descuentoLocal = 0;
    private String idVendedor;

    public VentaLocal(String idVenta, double monto, LocalDate fecha, double cantidad, float descuentoLocal, String idVendedor) {
        super(idVenta, monto, fecha, cantidad);
        this.descuentoLocal = descuentoLocal;
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "VentaLocal{" +
                "descuentoLocal=" + descuentoLocal + '\n' +
                ", idVendedor='" + idVendedor +  '\n' +
                ", idVenta='" + idVenta + '\n' +
                ", monto=" + monto +  '\n' +
                ", fecha=" + fecha +  '\n' +
                ", cantidad=" + cantidad +  '\n';
    }

    public double getMonto(){
        return monto;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public double getCantidad(){
        return cantidad;
    }

    public String getIdVenta(){
        return idVenta;
    }

    public float getDescuentoLocal() {
        return descuentoLocal;
    }

    public String getIdVendedor() {
        return idVendedor;
    }
}
