/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Usuario{
    
    protected int id_Usuario;
    protected int nivel_permiso;
    protected String dni;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String fecha_nacimiento;
    protected String genero;

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getNivel_permiso() {
        return nivel_permiso;
    }

    public void setNivel_permiso(int nivel_permiso) {
        this.nivel_permiso = nivel_permiso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Usuario() {
    }

    public Usuario(int id_Usuario, int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        this.id_Usuario = id_Usuario;
        this.nivel_permiso = nivel_permiso;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
    }

    public Usuario(int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        this.nivel_permiso = nivel_permiso;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
    }

    
    
}
