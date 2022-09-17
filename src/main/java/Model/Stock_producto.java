/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Stock_producto {
    
    protected int id_sp;
    protected Stock stock;
    protected Producto producto;

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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Stock_producto() {
    }

    public Stock_producto(int id_sp, Stock stock, Producto producto) {
        this.id_sp = id_sp;
        this.stock = stock;
        this.producto = producto;
    }

    public Stock_producto(Stock stock, Producto producto) {
        this.stock = stock;
        this.producto = producto;
    }
    
    
    
}
