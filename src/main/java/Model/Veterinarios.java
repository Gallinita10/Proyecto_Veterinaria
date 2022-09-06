/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Veterinarios {
    protected int id_veterinario;
    protected String nombre;
    protected String Telefono;
    protected String direccion;
    protected String dni;

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Veterinarios() {
    }

    public Veterinarios(String nombre, String Telefono, String direccion, String dni) {
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.dni = dni;
    }

    public Veterinarios(int id_veterinario, String nombre, String Telefono, String direccion, String dni) {
        this.id_veterinario = id_veterinario;
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.dni = dni;
    }
    
}
