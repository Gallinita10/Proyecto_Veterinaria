/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Visita_veterinario {
 
    protected int id_vv;
    protected Visita_medica visita;
    protected Veterinario veterinario;

    public int getId_vv() {
        return id_vv;
    }

    public void setId_vv(int id_vv) {
        this.id_vv = id_vv;
    }

    public Visita_medica getVisita() {
        return visita;
    }

    public void setVisita(Visita_medica visita) {
        this.visita = visita;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Visita_veterinario() {
    }

    public Visita_veterinario(int id_vv, Visita_medica visita, Veterinario veterinario) {
        this.id_vv = id_vv;
        this.visita = visita;
        this.veterinario = veterinario;
    }

    public Visita_veterinario(Visita_medica visita, Veterinario veterinario) {
        this.visita = visita;
        this.veterinario = veterinario;
    }

    
    
    
}
