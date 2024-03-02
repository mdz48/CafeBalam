package com.alilopez.application.models;

import java.util.Set;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String cargo;
    private int edad;
    private String idUsuario;

    public Usuario(String nombre, String apellido, String correo, String cargo, int edad, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cargo = cargo;
        this.edad = edad;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", edad=" + edad +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }
}