/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Producto_medico extends Producto{
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

    public Producto_medico() {
    }

    public Producto_medico(String fecha_caducidad, int id_productos, String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        super(id_productos, nombre_producto, precio_costo, precio_venta, tipo_producto);
        this.fecha_caducidad = fecha_caducidad;
    }

    public Producto_medico(String fecha_caducidad, String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        super(nombre_producto, precio_costo, precio_venta, tipo_producto);
        this.fecha_caducidad = fecha_caducidad;
    }

    
}
