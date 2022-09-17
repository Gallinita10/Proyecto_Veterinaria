/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Ciudad_provincia {
    
    protected int id_cp;
    protected Ciudad ciudad;
    protected Provincia provincia;

    public int getId_cp() {
        return id_cp;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Ciudad_provincia() {
    }

    public Ciudad_provincia(int id_cp, Ciudad ciudad, Provincia provincia) {
        this.id_cp = id_cp;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public Ciudad_provincia(Ciudad ciudad, Provincia provincia) {
        this.ciudad = ciudad;
        this.provincia = provincia;
    }
    
    
    
}
