/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Sucursal_ciudad {
    
    protected int id_sc;
    protected Sucursal sucursal;
    protected Ciudad ciudad;

    public int getId_sc() {
        return id_sc;
    }

    public void setId_sc(int id_sc) {
        this.id_sc = id_sc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Sucursal_ciudad() {
    }

    public Sucursal_ciudad(int id_sc, Sucursal sucursal, Ciudad ciudad) {
        this.id_sc = id_sc;
        this.sucursal = sucursal;
        this.ciudad = ciudad;
    }

    public Sucursal_ciudad(Sucursal sucursal, Ciudad ciudad) {
        this.sucursal = sucursal;
        this.ciudad = ciudad;
    }

    
    
    
}
