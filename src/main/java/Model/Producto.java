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
    protected float precio_producto;
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

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    
    
    public Producto() {
    }

    public Producto(int id_productos, String nombre_producto, float precio_producto, String tipo_producto) {
        this.id_productos = id_productos;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.tipo_producto = tipo_producto;
    }

    public Producto(String nombre_producto, float precio_producto, String tipo_producto) {
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.tipo_producto = tipo_producto;
    }

    
    
    
}
