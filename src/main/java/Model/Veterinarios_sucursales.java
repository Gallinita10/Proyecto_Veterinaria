/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Veterinarios_sucursales {
    
    protected int id_vs;
    protected Veterinarios veterinario;
    protected Sucursales sucursal;

    public int getId_vs() {
        return id_vs;
    }

    public void setId_vs(int id_vs) {
        this.id_vs = id_vs;
    }

    public Veterinarios getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinarios veterinario) {
        this.veterinario = veterinario;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    public Veterinarios_sucursales() {
    }

    public Veterinarios_sucursales(int id_vs, Veterinarios veterinario, Sucursales sucursal) {
        this.id_vs = id_vs;
        this.veterinario = veterinario;
        this.sucursal = sucursal;
    }

    public Veterinarios_sucursales(Veterinarios veterinario, Sucursales sucursal) {
        this.veterinario = veterinario;
        this.sucursal = sucursal;
    }
    
    
    
}
