/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Productos_presupuestos {
    
    protected int id_pp;
    protected Productos producto;
    protected Presupuestos presupuesto;

    public int getId_pp() {
        return id_pp;
    }

    public void setId_pp(int id_pp) {
        this.id_pp = id_pp;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Presupuestos getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuestos presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Productos_presupuestos() {
    }

    public Productos_presupuestos(int id_pp, Productos producto, Presupuestos presupuesto) {
        this.id_pp = id_pp;
        this.producto = producto;
        this.presupuesto = presupuesto;
    }

    public Productos_presupuestos(Productos producto, Presupuestos presupuesto) {
        this.producto = producto;
        this.presupuesto = presupuesto;
    }
    
    
    
}
