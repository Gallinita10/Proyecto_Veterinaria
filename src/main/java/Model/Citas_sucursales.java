/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Citas_sucursales {
    
    protected int id_cs;
    protected Citas_medicas cita;
    protected Sucursales sucursal;

    public int getId_cs() {
        return id_cs;
    }

    public void setId_cs(int id_cs) {
        this.id_cs = id_cs;
    }

    public Citas_medicas getCita() {
        return cita;
    }

    public void setCita(Citas_medicas cita) {
        this.cita = cita;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    public Citas_sucursales() {
    }

    public Citas_sucursales(int id_cs, Citas_medicas cita, Sucursales sucursal) {
        this.id_cs = id_cs;
        this.cita = cita;
        this.sucursal = sucursal;
    }

    public Citas_sucursales(Citas_medicas cita, Sucursales sucursal) {
        this.cita = cita;
        this.sucursal = sucursal;
    }
    
    
    
}
