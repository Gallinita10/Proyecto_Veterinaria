/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Producto_factura {
    
    protected int id_pf;
    protected Producto producto;
    protected Factura factura;

    public int getId_pf() {
        return id_pf;
    }

    public void setId_pf(int id_pf) {
        this.id_pf = id_pf;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto_factura() {
    }

    public Producto_factura(int id_pf, Producto producto, Factura factura) {
        this.id_pf = id_pf;
        this.producto = producto;
        this.factura = factura;
    }

    public Producto_factura(Producto producto, Factura factura) {
        this.producto = producto;
        this.factura = factura;
    }
    
    
    
}
