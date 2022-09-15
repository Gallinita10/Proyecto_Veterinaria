/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Sucursales {
    protected Stock id_stock;
    protected int id_sucursal;
    protected String direccion;

    public Stock getId_stock() {
        return id_stock;
    }

    public void setId_stock(Stock id_stock) {
        this.id_stock = id_stock;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Sucursales() {
    }

    public Sucursales(Stock id_stock, int id_sucursal, String direccion) {
        this.id_stock = id_stock;
        this.id_sucursal = id_sucursal;
        this.direccion = direccion;
    }

    public Sucursales(int id_sucursal, String direccion) {
        this.id_sucursal = id_sucursal;
        this.direccion = direccion;
    }

    
    
    
}

