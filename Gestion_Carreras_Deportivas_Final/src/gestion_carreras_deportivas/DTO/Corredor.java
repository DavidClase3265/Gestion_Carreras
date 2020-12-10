/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.DTO;

import java.util.Date;

/**
 *
 * @author David
 */
public class Corredor {
    private String nombre;
    private String DNI;
    private Date fecha_nac;
    private String direccion;
    private String telefono;

    public Corredor(String nombre, String DNI, Date fecha_nac, String direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
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
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = DNI;
        s[2] = fecha_nac.toString();
        s[3] = direccion;
        s[4] = telefono;
        return s;
    }
    
}
