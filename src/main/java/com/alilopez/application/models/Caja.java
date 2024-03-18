package com.alilopez.application.models;

import java.time.LocalDate;

public class Caja {
    private LocalDate fecha;
    private String idVendedor;
    private double monto;
    private String idCaja;
    private boolean status;

    public Caja(LocalDate fecha, String idVendedor, double monto, String idCaja) {
        this.fecha = fecha;
        this.idVendedor = idVendedor;
        this.monto = monto;
        this.idCaja = idCaja;
    }
    public Caja(boolean status){
        this.status = status;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public double getMonto() {
        return monto;
    }

    public String getIdCaja() {
        return idCaja;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
