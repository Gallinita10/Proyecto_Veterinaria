/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Producto_alimenticio extends Producto {
    protected int peso_alimento;
    protected String fecha_caducidad;
    protected float precio_por_kilo;
    protected float precio_por_bolsa;

    public int getPeso_alimento() {
        return peso_alimento;
    }

    public void setPeso_alimento(int peso_alimento) {
        this.peso_alimento = peso_alimento;
    }

    
    
    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public float getPrecio_por_kilo() {
        return precio_por_kilo;
    }

    public void setPrecio_por_kilo(float precio_por_kilo) {
        this.precio_por_kilo = precio_por_kilo;
    }

    public float getPrecio_por_bolsa() {
        return precio_por_bolsa;
    }

    public void setPrecio_por_bolsa(float precio_por_bolsa) {
        this.precio_por_bolsa = precio_por_bolsa;
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

    public Producto_alimenticio() {
    }

    public Producto_alimenticio(int peso_alimento, String fecha_caducidad, float precio_por_kilo, float precio_por_bolsa, int id_productos, String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        super(id_productos, nombre_producto, precio_costo, precio_venta, tipo_producto);
        this.peso_alimento = peso_alimento;
        this.fecha_caducidad = fecha_caducidad;
        this.precio_por_kilo = precio_por_kilo;
        this.precio_por_bolsa = precio_por_bolsa;
    }

    public Producto_alimenticio(int peso_alimento, String fecha_caducidad, float precio_por_kilo, float precio_por_bolsa, String nombre_producto, float precio_costo, float precio_venta, String tipo_producto) {
        super(nombre_producto, precio_costo, precio_venta, tipo_producto);
        this.peso_alimento = peso_alimento;
        this.fecha_caducidad = fecha_caducidad;
        this.precio_por_kilo = precio_por_kilo;
        this.precio_por_bolsa = precio_por_bolsa;
    }

    

    
}

