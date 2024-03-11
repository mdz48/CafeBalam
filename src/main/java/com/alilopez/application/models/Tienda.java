package com.alilopez.application.models;

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
        return clientes.add(cliente);
    }
    public boolean addUsuario(Usuario user){
        return usuarios.add(user);
    }
    public boolean addVentaLocal(float cantidad, String tipo, float descuento){
        boolean flag = false;
        for (int i = 0; i < productos.size(); i++) {
            if (tipo.equals(productos.get(i).getTipo()) && !flag && cantidad <= productos.get(i).getCantidad()){
                flag = true;
                float restante = productos.get(i).getCantidad() - cantidad;
                productos.get(i).setCantidad(restante);
                String id = UUID.randomUUID().toString();
                float monto = productos.get(i).getPrecio()*cantidad;
                LocalDate fecha = LocalDate.now();
                VentaLocal ventaLocal = new VentaLocal(id, monto, fecha, descuento);
                ventasLocales.add(ventaLocal);
            }
        }
        return flag;
    }
    public boolean addVentaNacional(VentaNacional ventaNacional){return  ventaNacionales.add(ventaNacional);}
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
    public boolean updateClient(String id, float comprado, float gastado){
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String userId = clientes.get(i).getIdCliente();
            if (userId.equals(id) && !flag && comprado>0 && gastado>0){
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
    public String searchCliente(String id){
        String b = "No se encontró el cliente";
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String userId = clientes.get(i).getIdCliente();
            if (userId.equals(id) && !flag){
                b = clientes.get(i).toString();
                flag = true;
            }
        }
        return b;
    }

    public String searchProducto(String id){
        String b = "No se encontró el producto";
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
    public boolean deleteCliente(String id){
        boolean flag = false;
        for (int i = 0; i < clientes.size(); i++) {
            String userId = clientes.get(i).getIdCliente();
            if (userId.equals(id) && !flag){
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
