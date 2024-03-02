package com.alilopez.application.models;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String lastname;
    private String correo;
    private long telefono;
    private float gastado;
    private float comprado;

    public Cliente(String idCliente, String nombre, String lastname, String correo, long telefono, float gastado, float comprado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.lastname = lastname;
        this.correo = correo;
        this.telefono = telefono;
        this.gastado = gastado;
        this.comprado = comprado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCorreo() {
        return correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public float getGastado() {
        return gastado;
    }

    public float getComprado() {
        return comprado;
    }

    public void setGastado(float gastado) {
        this.gastado = gastado;
    }

    public void setComprado(float comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente='" + idCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", lastname='" + lastname + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", gastado=" + gastado +
                ", comprado=" + comprado +
                '}';
    }
}
