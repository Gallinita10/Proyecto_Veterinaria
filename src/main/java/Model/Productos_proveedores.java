/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Productos_proveedores {
    protected int id_prp;
    protected Proveedores proveedor;
    protected Productos producto;

    public int getId_prp() {
        return id_prp;
    }

    public void setId_prp(int id_prp) {
        this.id_prp = id_prp;
    }

    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Productos_proveedores() {
    }

    public Productos_proveedores(int id_prp, Proveedores proveedor, Productos producto) {
        this.id_prp = id_prp;
        this.proveedor = proveedor;
        this.producto = producto;
    }

    public Productos_proveedores(Proveedores proveedor, Productos producto) {
        this.proveedor = proveedor;
        this.producto = producto;
    }
    
    
    
}
