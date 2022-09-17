/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Veterinario_intervencion {
    
    protected int id_vi;
    protected Veterinario veterinario;
    protected Intervencion intervencion;

    public int getId_vi() {
        return id_vi;
    }

    public void setId_vi(int id_vi) {
        this.id_vi = id_vi;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public Veterinario_intervencion() {
    }

    public Veterinario_intervencion(int id_vi, Veterinario veterinario, Intervencion intervencion) {
        this.id_vi = id_vi;
        this.veterinario = veterinario;
        this.intervencion = intervencion;
    }

    public Veterinario_intervencion(Veterinario veterinario, Intervencion intervencion) {
        this.veterinario = veterinario;
        this.intervencion = intervencion;
    }
    
    
    
}
