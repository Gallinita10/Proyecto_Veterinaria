/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Mascota {
    protected int id_mascota;
    protected String nombre;
    protected String tipo_animal;
    protected int edad;

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre, String tipo_animal, int edad) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.tipo_animal = tipo_animal;
        this.edad = edad;
    }

    public Mascota(String nombre, String tipo_animal, int edad) {
        this.nombre = nombre;
        this.tipo_animal = tipo_animal;
        this.edad = edad;
    }

    
    
}
