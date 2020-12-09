/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.DTO;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David
 */
public class CarrerasTableModel extends AbstractTableModel {
    
    private List<Carrera> listaCarrera;

    public CarrerasTableModel(List<Carrera> listaCarrera) {
        this.listaCarrera = listaCarrera;
    }

    @Override
    public int getRowCount() {
        return listaCarrera.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return listaCarrera.get(rowIndex).getNombre();
            case 1:
                return listaCarrera.get(rowIndex).getFecha();
            case 2:
                return listaCarrera.get(rowIndex).getLugar();
            case 3:
                return listaCarrera.get(rowIndex).getNumero_max();
            case 4:
                return listaCarrera.get(rowIndex).getMapaCorredor();
        }
        return null;
    }
    
     
}
