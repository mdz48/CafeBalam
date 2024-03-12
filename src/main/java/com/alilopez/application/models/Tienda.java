package com.alilopez.application.models;

import com.alilopez.application.App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Tienda {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cafe> productos = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<VentaLocal> ventasLocales = new ArrayList<>();
    private ArrayList<VentaNacional> ventaNacionales = new ArrayList<>();
    public boolean addCliente(Cliente cliente){
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (cliente.getCorreo().equals(clientes.get(i).getCorreo()) && !flag) {
                flag = true;
            }
        }
        if (!flag) {
            clientes.add(cliente);
        }
        return flag;
    }
    public boolean addUsuario(Usuario user){
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (user.getIdUsuario().equals(usuarios.get(i).getIdUsuario()) && !flag) {
                flag = true;
            }
        }
        if (!flag) {
            usuarios.add(user);
        }
        return flag;
    }
    public boolean addVentaLocal(double cantidad, String tipo, float descuento){
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            if (tipo.equals(productos.get(i).getTipo()) && !flag && cantidad <= productos.get(i).getCantidad()){
                flag = true;
                double restante = productos.get(i).getCantidad() - cantidad;
                productos.get(i).setCantidad(restante);
                String id = UUID.randomUUID().toString();
                double monto = productos.get(i).getPrecio()*cantidad;
                LocalDate fecha = LocalDate.now();
                String idVendedor = App.getUser().getId();
                VentaLocal ventaLocal = new VentaLocal(id, monto, fecha, cantidad, descuento, idVendedor);
                ventasLocales.add(ventaLocal);
            }
        }
        return flag;
    }
    public boolean addVentaNacional(double cantidad, String tipo, float costoEnvio, String direccion){
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            if (tipo.equals(productos.get(i).getTipo()) && !flag && cantidad <= productos.get(i).getCantidad()){
                flag = true;
                double restante = productos.get(i).getCantidad() - cantidad;
                productos.get(i).setCantidad(restante);
                String id = UUID.randomUUID().toString();
                double monto = productos.get(i).getPrecio()*cantidad;
                LocalDate fecha = LocalDate.now();
                VentaNacional ventaNacional = new VentaNacional(id, monto, fecha, cantidad, costoEnvio, direccion);
                ventaNacionales.add(ventaNacional);
            }
        }
        return flag;
    }
    public boolean addProducto(Cafe cafe){
        return productos.add(cafe);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<VentaLocal> getVentasLocales() {
        return ventasLocales;
    }

    public ArrayList<Cafe> getProductos() {
        return productos;
    }

    public ArrayList<VentaNacional> getVentaNacionales() {
        return ventaNacionales;
    }
    public boolean updateClient(String correo, float comprado, float gastado){
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String userMail = clientes.get(i).getCorreo();
            if (userMail.equals(correo) && !flag && comprado>0 && gastado>0){
                flag = true;
                clientes.get(i).setComprado(comprado);
                clientes.get(i).setGastado(gastado);
            }
        }
        return flag;
    }
    public boolean updateProduct(String id, float cantidad){
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            String productId = productos.get(i).getIdCafe();
            if (productId.equals(id) && !flag && cantidad>0){
                flag = true;
                productos.get(i).setCantidad(cantidad);
            }
        }
        return flag;
    }
    public boolean searchUsuario(String id){
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            String userId = usuarios.get(i).getIdUsuario();
            if (userId.equals(id) && !flag){
                flag = true;
            }
        }
        return flag;
    }
    public boolean deleteUsuario(String id){
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            String userId = usuarios.get(i).getIdUsuario();
            if (userId.equals(id) && !flag){
                usuarios.remove(i);
                flag = true;
            }
        }
        return flag;
    }
    public String searchCliente(String mail){
        String b = null;
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String clientMail = clientes.get(i).getCorreo();
            if (clientMail.equals(mail) && !flag){
                b = clientes.get(i).toString();
                flag = true;
            }
        }
        return b;
    }

    public String searchProducto(String id){
        String b = null;
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            String productId = productos.get(i).getIdCafe();
            if (productId.equals(id) && !flag){
                b = productos.get(i).toString();
                flag = true;
            }
        }
        return b;
    }
    public boolean deleteCliente(String correo){
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String clienteMail = clientes.get(i).getCorreo();
            if (clienteMail.equals(correo) && !flag){
                clientes.remove(i);
                flag = true;
            }
        }
        return flag;
    }

    public boolean deleteProducto(String id){
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            String productId = productos.get(i).getIdCafe();
            if (productId.equals(id) && !flag){
                productos.remove(i);
                flag = true;
            }
        }
        return flag;
    }
}
