/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Proveedores {
    protected int id_proveedor;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected Tipo_proveedor id_tipo_proveedor;

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public Tipo_proveedor getId_tipo_proveedor() {
        return id_tipo_proveedor;
    }

    public void setId_tipo_proveedor(Tipo_proveedor id_tipo_proveedor) {
        this.id_tipo_proveedor = id_tipo_proveedor;
    }
    
    public Proveedores() {
    }

    public Proveedores(int id_proveedor, String nombre, String direccion, String telefono, Tipo_proveedor id_tipo_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_tipo_proveedor = id_tipo_proveedor;
    }

    public Proveedores(String nombre, String direccion, String telefono, Tipo_proveedor id_tipo_proveedor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_tipo_proveedor = id_tipo_proveedor;
    }

    
}
