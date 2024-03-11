package com.alilopez.application.models;

import java.time.LocalDate;

public class VentaLocal extends Venta{
    private float descuentoLocal = 0;

    public VentaLocal(String idVenta, float monto, LocalDate date, float descuentoLocal) {
        super(idVenta, monto, date);
        this.descuentoLocal = descuentoLocal;
    }


    @Override
    public String toString() {
        return "VentaLocal{" +
                "descuento=" + descuentoLocal +
                '}';
    }
}
