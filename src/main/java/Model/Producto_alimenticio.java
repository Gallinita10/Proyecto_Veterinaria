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
    protected String peso_alimento;
    protected String fecha_caducidad;
    protected float precio_por_kilo;
    protected float precio_por_bolsa;
    protected float precio_proveedor;

    public String getPeso_alimento() {
        return peso_alimento;
    }

    public void setPeso_alimento(String peso_alimento) {
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

    public float getPrecio_proveedor() {
        return precio_proveedor;
    }

    public void setPrecio_proveedor(float precio_proveedor) {
        this.precio_proveedor = precio_proveedor;
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

    public Producto_alimenticio() {
    }

    public Producto_alimenticio(String peso_alimento, String fecha_caducidad, float precio_por_kilo, float precio_por_bolsa, float precio_proveedor, int id_productos, String nombre_producto, float precio_producto, String tipo_producto) {
        super(id_productos, nombre_producto, precio_producto, tipo_producto);
        this.peso_alimento = peso_alimento;
        this.fecha_caducidad = fecha_caducidad;
        this.precio_por_kilo = precio_por_kilo;
        this.precio_por_bolsa = precio_por_bolsa;
        this.precio_proveedor = precio_proveedor;
    }

    public Producto_alimenticio(String peso_alimento, String fecha_caducidad, float precio_por_kilo, float precio_por_bolsa, float precio_proveedor, String nombre_producto, float precio_producto, String tipo_producto) {
        super(nombre_producto, precio_producto, tipo_producto);
        this.peso_alimento = peso_alimento;
        this.fecha_caducidad = fecha_caducidad;
        this.precio_por_kilo = precio_por_kilo;
        this.precio_por_bolsa = precio_por_bolsa;
        this.precio_proveedor = precio_proveedor;
    }
    
    
    
}

