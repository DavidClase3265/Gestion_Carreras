/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.DTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class LogicaNegocioCorredor {
    
    private static List<Corredor> listaCorredor = new ArrayList<>();
    
    public static void aniadirCorredor(Corredor corredor){
        listaCorredor.add(corredor);
    }
    
    public static void borrarCorredor(int posicion){
           
        listaCorredor.remove(posicion);
    }
    
     public static void actualizarCorredor(Corredor corredor, int posicion){
        listaCorredor.get(posicion).setNombre(corredor.getNombre());
        listaCorredor.get(posicion).setDNI(corredor.getDNI());
        listaCorredor.get(posicion).setFecha_nac(corredor.getFecha_nac());
        listaCorredor.get(posicion).setDireccion(corredor.getDireccion());
        listaCorredor.get(posicion).setTelefono(corredor.getTelefono());
    }
    
    public static List<Corredor> getListaCorredor(){
        return listaCorredor;
    }
    
}
