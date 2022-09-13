/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Admin extends Personas {
    
    protected int id_admin;
    protected String nombre_admin;
    protected String contraseña;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNombre_admin() {
        return nombre_admin;
    }

    public void setNombre_admin(String nombre_admin) {
        this.nombre_admin = nombre_admin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public Admin() {
    }

    public Admin(int id_admin, String nombre_admin, String contraseña, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.id_admin = id_admin;
        this.nombre_admin = nombre_admin;
        this.contraseña = contraseña;
    }

    public Admin(String nombre_admin, String contraseña, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.nombre_admin = nombre_admin;
        this.contraseña = contraseña;
    }

    
    
}
