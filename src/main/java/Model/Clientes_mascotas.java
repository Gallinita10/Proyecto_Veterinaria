/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Clientes_mascotas {
    
    protected int id_cm;
    protected Clientes cliente;
    protected Mascotas mascotas;

    public int getId_cm() {
        return id_cm;
    }

    public void setId_cm(int id_cm) {
        this.id_cm = id_cm;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Mascotas getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascotas mascotas) {
        this.mascotas = mascotas;
    }

    public Clientes_mascotas() {
    }

    public Clientes_mascotas(int id_cm, Clientes cliente, Mascotas mascotas) {
        this.id_cm = id_cm;
        this.cliente = cliente;
        this.mascotas = mascotas;
    }

    public Clientes_mascotas(Clientes cliente, Mascotas mascotas) {
        this.cliente = cliente;
        this.mascotas = mascotas;
    }
    
    
    
}
