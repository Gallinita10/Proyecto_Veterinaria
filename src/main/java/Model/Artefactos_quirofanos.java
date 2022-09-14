/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Artefactos_quirofanos {
    
    protected int id_aq;
    protected Artefactos artefacto;
    protected Quirofanos quirofano;

    public int getId_aq() {
        return id_aq;
    }

    public void setId_aq(int id_aq) {
        this.id_aq = id_aq;
    }

    public Artefactos getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefactos artefacto) {
        this.artefacto = artefacto;
    }

    public Quirofanos getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofanos quirofano) {
        this.quirofano = quirofano;
    }

    public Artefactos_quirofanos() {
    }

    public Artefactos_quirofanos(int id_aq, Artefactos artefacto, Quirofanos quirofano) {
        this.id_aq = id_aq;
        this.artefacto = artefacto;
        this.quirofano = quirofano;
    }

    public Artefactos_quirofanos(Artefactos artefacto, Quirofanos quirofano) {
        this.artefacto = artefacto;
        this.quirofano = quirofano;
    }
    
    
    
}
