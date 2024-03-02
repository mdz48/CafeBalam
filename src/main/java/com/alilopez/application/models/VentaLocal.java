package com.alilopez.application.models;

public class VentaLocal extends Venta{
    private float descuento;
    private String vendedor;

    public VentaLocal(String idVenta, float monto, float descuento, String vendedor) {
        super(idVenta, monto);
        this.descuento = descuento;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "VentaLocal{" +
                "descuento=" + descuento +
                ", vendedor='" + vendedor + '\'' +
                '}';
    }
}
