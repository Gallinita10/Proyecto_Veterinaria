/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Producto_presupuesto {
    
    protected int id_pp;
    protected Producto producto;
    protected Presupuesto presupuesto;

    public int getId_pp() {
        return id_pp;
    }

    public void setId_pp(int id_pp) {
        this.id_pp = id_pp;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Producto_presupuesto() {
    }

    public Producto_presupuesto(int id_pp, Producto producto, Presupuesto presupuesto) {
        this.id_pp = id_pp;
        this.producto = producto;
        this.presupuesto = presupuesto;
    }

    public Producto_presupuesto(Producto producto, Presupuesto presupuesto) {
        this.producto = producto;
        this.presupuesto = presupuesto;
    }
    
    
    
}
