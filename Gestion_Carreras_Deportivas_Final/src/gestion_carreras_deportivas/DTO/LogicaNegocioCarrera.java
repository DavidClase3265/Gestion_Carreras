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
public class LogicaNegocioCarrera {
    private static List<Carrera> listaCarrera = new ArrayList<>();
    
    public static void aniadirCarrera(Carrera carrera){
        listaCarrera.add(carrera);
    }
    
    public static List<Carrera> getListaCarrera(){
        return listaCarrera;
    }
}
