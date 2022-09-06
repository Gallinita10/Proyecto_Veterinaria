/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Productos_medicos extends Productos{
    protected String fecha_caducidad;

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

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

    public Productos_medicos() {
    }

    public Productos_medicos(String fecha_caducidad, int id_productos, String nombre_producto, float precio_producto) {
        super(id_productos, nombre_producto, precio_producto);
        this.fecha_caducidad = fecha_caducidad;
    }

    public Productos_medicos(String fecha_caducidad, String nombre_producto, float precio_producto) {
        super(nombre_producto, precio_producto);
        this.fecha_caducidad = fecha_caducidad;
    }
    
    
}
