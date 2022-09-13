/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Stock_sucursales {
    
    protected int id_ss;
    protected Stock stock;
    protected Sucursales sucursal;

    public int getId_ss() {
        return id_ss;
    }

    public void setId_ss(int id_ss) {
        this.id_ss = id_ss;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    public Stock_sucursales() {
    }
    
    public Stock_sucursales(int id_ss, Stock stock, Sucursales sucursal) {
        this.id_ss = id_ss;
        this.stock = stock;
        this.sucursal = sucursal;
    }

    public Stock_sucursales(Stock stock, Sucursales sucursal) {
        this.stock = stock;
        this.sucursal = sucursal;
    }
    
    
}
