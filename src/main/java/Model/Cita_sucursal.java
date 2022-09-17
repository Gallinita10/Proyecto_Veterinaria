/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Cita_sucursal {
    
    protected int id_cs;
    protected Cita_medica cita;
    protected Sucursal sucursal;

    public int getId_cs() {
        return id_cs;
    }

    public void setId_cs(int id_cs) {
        this.id_cs = id_cs;
    }

    public Cita_medica getCita() {
        return cita;
    }

    public void setCita(Cita_medica cita) {
        this.cita = cita;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cita_sucursal() {
    }

    public Cita_sucursal(int id_cs, Cita_medica cita, Sucursal sucursal) {
        this.id_cs = id_cs;
        this.cita = cita;
        this.sucursal = sucursal;
    }

    public Cita_sucursal(Cita_medica cita, Sucursal sucursal) {
        this.cita = cita;
        this.sucursal = sucursal;
    }

    
    
    
}
