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
public class Productos {
    protected int id_productos;
    protected String nombre_producto;
    protected float precio_producto;

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

    public Productos() {
    }

    public Productos(int id_productos, String nombre_producto, float precio_producto) {
        this.id_productos = id_productos;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
    }

    public Productos(String nombre_producto, float precio_producto) {
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
    }
    
    
    
}
