/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Producto_proveedor {
    protected int id_prp;
    protected Proveedor proveedor;
    protected Producto producto;

    public int getId_prp() {
        return id_prp;
    }

    public void setId_prp(int id_prp) {
        this.id_prp = id_prp;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto_proveedor() {
    }

    public Producto_proveedor(int id_prp, Proveedor proveedor, Producto producto) {
        this.id_prp = id_prp;
        this.proveedor = proveedor;
        this.producto = producto;
    }

    public Producto_proveedor(Proveedor proveedor, Producto producto) {
        this.proveedor = proveedor;
        this.producto = producto;
    }

    
    
}
