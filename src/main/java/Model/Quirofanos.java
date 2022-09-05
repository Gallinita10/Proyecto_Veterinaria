/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Quirofanos {
    protected int id_quirofano;
    protected int numero_quirofano;
    protected Artefactos artefacto;

    public int getId_quirofano() {
        return id_quirofano;
    }

    public void setId_quirofano(int id_quirofano) {
        this.id_quirofano = id_quirofano;
    }

    public int getNumero_quirofano() {
        return numero_quirofano;
    }

    public void setNumero_quirofano(int numero_quirofano) {
        this.numero_quirofano = numero_quirofano;
    }

    public Artefactos getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefactos artefacto) {
        this.artefacto = artefacto;
    }

    public Quirofanos() {
    }

    public Quirofanos(int id_quirofano, int numero_quirofano, Artefactos artefacto) {
        this.id_quirofano = id_quirofano;
        this.numero_quirofano = numero_quirofano;
        this.artefacto = artefacto;
    }

    public Quirofanos(int numero_quirofano, Artefactos artefacto) {
        this.numero_quirofano = numero_quirofano;
        this.artefacto = artefacto;
    }
    
    
    
}
