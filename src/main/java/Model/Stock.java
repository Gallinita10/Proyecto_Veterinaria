/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Stock {
    protected int id_stock;
    protected int cantidad;

    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Stock() {
    }

    public Stock(int id_stock, int cantidad) {
        this.id_stock = id_stock;
        this.cantidad = cantidad;
    }

    public Stock(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
