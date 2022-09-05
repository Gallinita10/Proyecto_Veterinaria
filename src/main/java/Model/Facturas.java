/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Facturas {
    protected int id_factura;
    protected int punto_venta;
    protected int nro_comprobante;
    protected LocalDate fecha_emision;
    protected float precio_unitario;
    protected float precio_total;
    protected float iva;
    protected int cantidad_articulos;
    protected String tipo_de_unidades;
    protected String tipo_factura;
    protected Clientes Clientes;
    protected String emisor;
    protected String Productos[];
    protected String Servicios[];

}
