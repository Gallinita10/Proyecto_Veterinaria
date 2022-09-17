/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Veterinario_sucursal {
    
    protected int id_vs;
    protected Veterinario veterinario;
    protected Sucursal sucursal;

    public int getId_vs() {
        return id_vs;
    }

    public void setId_vs(int id_vs) {
        this.id_vs = id_vs;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Veterinario_sucursal() {
    }

    public Veterinario_sucursal(int id_vs, Veterinario veterinario, Sucursal sucursal) {
        this.id_vs = id_vs;
        this.veterinario = veterinario;
        this.sucursal = sucursal;
    }

    public Veterinario_sucursal(Veterinario veterinario, Sucursal sucursal) {
        this.veterinario = veterinario;
        this.sucursal = sucursal;
    }
    
    
    
}
