/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Productos_accesorios extends Productos{
   protected String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Productos_accesorios(String descripcion) {
    }

    public Productos_accesorios(String descripcion, int id_productos, String nombre_producto, float precio_producto) {
        super(id_productos, nombre_producto, precio_producto);
        this.descripcion = descripcion;
    }

    public Productos_accesorios(String descripcion, String nombre_producto, float precio_producto) {
        super(nombre_producto, precio_producto);
        this.descripcion = descripcion;
    }
   
   
}
