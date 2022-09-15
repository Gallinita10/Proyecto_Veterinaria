/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Sucursales_ciudades {
    
    protected int id_sc;
    protected Sucursales sucursal;
    protected Ciudades ciudad;

    public int getId_sc() {
        return id_sc;
    }

    public void setId_sc(int id_sc) {
        this.id_sc = id_sc;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public Sucursales_ciudades() {
    }

    public Sucursales_ciudades(int id_sc, Sucursales sucursal, Ciudades ciudad) {
        this.id_sc = id_sc;
        this.sucursal = sucursal;
        this.ciudad = ciudad;
    }

    public Sucursales_ciudades(Sucursales sucursal, Ciudades ciudad) {
        this.sucursal = sucursal;
        this.ciudad = ciudad;
    }
    
    
    
}
