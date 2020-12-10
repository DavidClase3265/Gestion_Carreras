/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.DTO;
 
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author David
 */
public class Carrera {
  private String nombre;
  private Date fecha;
  private String lugar;
  private int numero_max;
  /*private Map<Corredor, String> MapaCorredor = new HashMap<Corredor, String>();*/

    public Carrera(String nombre, Date fecha, String lugar, int numero_max) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.numero_max = numero_max;
    }

  
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumero_max() {
        return numero_max;
    }

    public void setNumero_max(int numero_max) {
        this.numero_max = numero_max;
    }
/*
    public Map<Corredor, String> getMapaCorredor() {
        return MapaCorredor;
    }

    public void setMapaCorredor(Map<Corredor, String> MapaCorredor) {
        this.MapaCorredor = MapaCorredor;
    }*/

    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = fecha.toString();
        s[2] = lugar;
        s[3] = ""+numero_max+"";
        /*s[4] = mapa_corredor;*/
        return s;
    }
  
  
    
}
