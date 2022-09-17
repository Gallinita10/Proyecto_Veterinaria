/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Producto_accesorio extends Producto{
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

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public Producto_accesorio() {
    }

    public Producto_accesorio(String descripcion, int id_productos, String nombre_producto, float precio_producto, String tipo_producto) {
        super(id_productos, nombre_producto, precio_producto, tipo_producto);
        this.descripcion = descripcion;
    }

    public Producto_accesorio(String descripcion, String nombre_producto, float precio_producto, String tipo_producto) {
        super(nombre_producto, precio_producto, tipo_producto);
        this.descripcion = descripcion;
    }

    
    
   
}
