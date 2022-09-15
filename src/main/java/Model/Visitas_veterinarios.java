/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Visitas_veterinarios {
 
    protected int id_vv;
    protected Visitas_medicas visita;
    protected Veterinarios veterinario;

    public int getId_vv() {
        return id_vv;
    }

    public void setId_vv(int id_vv) {
        this.id_vv = id_vv;
    }

    public Visitas_medicas getVisita() {
        return visita;
    }

    public void setVisita(Visitas_medicas visita) {
        this.visita = visita;
    }

    public Veterinarios getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinarios veterinario) {
        this.veterinario = veterinario;
    }

    public Visitas_veterinarios() {
    }

    public Visitas_veterinarios(int id_vv, Visitas_medicas visita, Veterinarios veterinario) {
        this.id_vv = id_vv;
        this.visita = visita;
        this.veterinario = veterinario;
    }

    public Visitas_veterinarios(Visitas_medicas visita, Veterinarios veterinario) {
        this.visita = visita;
        this.veterinario = veterinario;
    }
    
    
    
}
