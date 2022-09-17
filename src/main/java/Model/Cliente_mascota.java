/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Cliente_mascota {
    
    protected int id_cm;
    protected Cliente cliente;
    protected Mascota mascotas;

    public int getId_cm() {
        return id_cm;
    }

    public void setId_cm(int id_cm) {
        this.id_cm = id_cm;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota mascotas) {
        this.mascotas = mascotas;
    }

    public Cliente_mascota() {
    }

    public Cliente_mascota(int id_cm, Cliente cliente, Mascota mascotas) {
        this.id_cm = id_cm;
        this.cliente = cliente;
        this.mascotas = mascotas;
    }

    public Cliente_mascota(Cliente cliente, Mascota mascotas) {
        this.cliente = cliente;
        this.mascotas = mascotas;
    }
    
    
    
}
