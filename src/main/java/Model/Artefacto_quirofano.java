/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Artefacto_quirofano {
    
    protected int id_aq;
    protected Artefacto artefacto;
    protected Quirofano quirofano;

    public int getId_aq() {
        return id_aq;
    }

    public void setId_aq(int id_aq) {
        this.id_aq = id_aq;
    }

    public Artefacto getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public Quirofano getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofano quirofano) {
        this.quirofano = quirofano;
    }

    public Artefacto_quirofano() {
    }

    public Artefacto_quirofano(int id_aq, Artefacto artefacto, Quirofano quirofano) {
        this.id_aq = id_aq;
        this.artefacto = artefacto;
        this.quirofano = quirofano;
    }

    public Artefacto_quirofano(Artefacto artefacto, Quirofano quirofano) {
        this.artefacto = artefacto;
        this.quirofano = quirofano;
    }
    
    
    
}
