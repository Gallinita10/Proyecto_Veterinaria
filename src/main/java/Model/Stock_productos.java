/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Stock_productos {
    
    protected int id_sp;
    protected Stock stock;
    protected Productos producto;

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Stock_productos() {
    }

    public Stock_productos(int id_sp, Stock stock, Productos producto) {
        this.id_sp = id_sp;
        this.stock = stock;
        this.producto = producto;
    }

    public Stock_productos(Stock stock, Productos producto) {
        this.stock = stock;
        this.producto = producto;
    }
    
    
    
}
