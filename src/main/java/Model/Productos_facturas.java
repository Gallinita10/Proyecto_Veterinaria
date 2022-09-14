/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Productos_facturas {
    
    protected int id_pf;
    protected Productos producto;
    protected Facturas factura;

    public int getId_pf() {
        return id_pf;
    }

    public void setId_pf(int id_pf) {
        this.id_pf = id_pf;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Facturas getFactura() {
        return factura;
    }

    public void setFactura(Facturas factura) {
        this.factura = factura;
    }

    public Productos_facturas() {
    }

    public Productos_facturas(int id_pf, Productos producto, Facturas factura) {
        this.id_pf = id_pf;
        this.producto = producto;
        this.factura = factura;
    }

    public Productos_facturas(Productos producto, Facturas factura) {
        this.producto = producto;
        this.factura = factura;
    }
    
    
    
}
