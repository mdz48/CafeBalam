package com.alilopez.application.models;

public class Cafe {
    private float precio;
    private float peso;
    private String idCafe;
    private String nombre;
    private float cantidad;
    private String tipo;
    private float costo;
    public Cafe(float precio, float peso, String idCafe, String nombre, float cantidad, String tipo, float costo) {
        this.precio = precio;
        this.peso = peso;
        this.idCafe = idCafe;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getIdCafe() {
        return idCafe;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "precio=" + precio +
                ", weight=" + peso +
                ", idCafe='" + idCafe + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad + '\'' +
                ", tipo=" + tipo + '\'' +
                ", costo=" + costo + '\'' +
                '}';
    }
}
