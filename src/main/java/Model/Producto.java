/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Producto {
    protected int id_productos;
    protected String nombre_producto;
    protected float precio_costo;
    protected float precio_venta;
    protected String tipo_producto;

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public float getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(float precio_costo) {
        this.precio_costo = precio_costo;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    
    
    public Producto() {
    }

    public Producto(int id_productos, String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        this.id_productos = id_productos;
        this.nombre_producto = nombre_producto;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.tipo_producto = tipo_producto;
    }

    public Producto(String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        this.nombre_producto = nombre_producto;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.tipo_producto = tipo_producto;
    }

}
