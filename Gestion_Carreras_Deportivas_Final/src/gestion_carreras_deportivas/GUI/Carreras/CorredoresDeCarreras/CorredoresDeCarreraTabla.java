/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.GUI.Carreras.CorredoresDeCarreras;

import gestion_carreras_deportivas.DTO.Carrera;

import gestion_carreras_deportivas.DTO.Componente.pruebarelojdigital.Reloj;
import gestion_carreras_deportivas.DTO.Corredor;
import gestion_carreras_deportivas.DTO.LogicaNegocioCarrera;
import gestion_carreras_deportivas.DTO.LogicaNegocioCorredor;
import gestion_carreras_deportivas.GUI.Carreras.CarreraTabla;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author David
 */
public class CorredoresDeCarreraTabla extends javax.swing.JDialog {

    private LogicaNegocioCorredor logicaNegocioCorredor;
    private LogicaNegocioCarrera logicaNegocioCarrera;
    private static List<Corredor> listaCorredoresDeCarrera;
    public static int posicion;
    /**
     * Creates new form CorredoresDeCarreraTabla
     */
    public CorredoresDeCarreraTabla(java.awt.Frame parent, boolean modal, Carrera carrera, int posicion) {
        super(parent, modal);
        initComponents();
        List<Corredor> listaCorredoresDeCarrera = new ArrayList<Corredor>(carrera.getMapaCorredor().keySet());
        this.listaCorredoresDeCarrera=listaCorredoresDeCarrera;
        this.posicion=posicion;
        this.carrera=carrera;
         
        List<Corredor> listaCorredor = LogicaNegocioCorredor.getListaCorredor();
        
           DefaultListModel model = new DefaultListModel<>();
           for(int i=0 ; i<listaCorredor.size(); i++){
           model.addElement(listaCorredor.get(i).toArrayString()[0]);
           }
       
           JList listaCorredores = jListListaCorredores; 
           listaCorredores.setModel(model);
 
           
        refrescarTabla(listaCorredoresDeCarrera);
    }
    
    public List<Corredor> listaCorredorAsignados;
    public static Carrera carrera;
    
    private void refrescarTabla(List<Corredor> lista){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "DNI", "Fecha", "Direccion", "Telefono"});

        List<Corredor> listaCorredorAsignados=lista;
  
        for(Corredor corredor : listaCorredorAsignados){
            dtm.addRow(corredor.toArrayString());
        }
        jTableCorredoresCarrera.setModel(dtm);
        
         //pal default
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
        jTableCorredoresCarrera.setRowSorter(sorter);
        
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2,SortOrder.ASCENDING));
       
        sorter.setSortKeys(sortKeys);
        
          List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
        
           DefaultListModel model = new DefaultListModel<>();
           for(int i=0 ; i<listaCorredor.size(); i++){
           model.addElement(listaCorredor.get(i).toArrayString()[0]);
           } 
       
           
    }
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredoresCarrera = new javax.swing.JTable();
        jButtonCorredorACarreraAsignar = new javax.swing.JButton();
        jButtonCorredorACarreraEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListListaCorredores = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredoresCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredoresCarrera);

        jButtonCorredorACarreraAsignar.setText("Asignar Corredor a la Carrera");
        jButtonCorredorACarreraAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredorACarreraAsignarActionPerformed(evt);
            }
        });

        jButtonCorredorACarreraEliminar.setText("Eliminar Corredor a la Carrera");
        jButtonCorredorACarreraEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredorACarreraEliminarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListListaCorredores);

        jButton1.setText("Dar Inicio a la carrera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonCorredorACarreraAsignar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCorredorACarreraEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCorredorACarreraAsignar)
                    .addComponent(jButtonCorredorACarreraEliminar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButtonCorredorACarreraEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredorACarreraEliminarActionPerformed
        borrarCorredor();
      
    }//GEN-LAST:event_jButtonCorredorACarreraEliminarActionPerformed

    private void jButtonCorredorACarreraAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredorACarreraAsignarActionPerformed
        aniadirCorredor();
    }//GEN-LAST:event_jButtonCorredorACarreraAsignarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reloj reloj = new Reloj(new javax.swing.JFrame(), true);
        reloj.setVisible(true);
              
             
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public void aniadirCorredor(){
       String NombreCorredor = jListListaCorredores.getSelectedValue();
       List<Corredor> listaCorredor = LogicaNegocioCorredor.getListaCorredor();
       List<Carrera> listaCarrera = LogicaNegocioCarrera.getListaCarrera();
 
         for(Corredor corredor : listaCorredor){
             System.out.println(corredor.getNombre());
              System.out.println(NombreCorredor);
             if(corredor.getNombre().equals(NombreCorredor)){
                carrera.getMapaCorredor().put(corredor, carrera.getMapaCorredor().size()+1);
            }
        }
      /*
        LogicaNegocioCarrera.actualizarCarrera(carrera, posicion);  */
    }
    
    
    public void borrarCorredor(){
      DefaultTableModel dtm = (DefaultTableModel)jTableCorredoresCarrera.getModel();
       List<Corredor> listaCorredor = this.listaCorredorAsignados;
       
       //CORREDOR DE ESA LINEA  
       int row = jTableCorredoresCarrera.getSelectedRow();
       String nombre = jTableCorredoresCarrera.getModel().getValueAt(row, 0).toString();
       
  
       int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres borrar este corredor?", "Corredor",JOptionPane.YES_NO_OPTION);
       if(resultado == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(this, "Borramos", "Corredor", JOptionPane.INFORMATION_MESSAGE);
 
            for(Corredor corredor : listaCorredor){
             if(corredor.equals(nombre)){
                  carrera.getMapaCorredor().put(corredor, carrera.getMapaCorredor().size()+1);
            }
        }
          
           LogicaNegocioCarrera.borrarCarrera(posicion);
         dtm.removeRow(row);
        jTableCorredoresCarrera.setModel(dtm);
       }
       else if (resultado == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(this, "No Borramos", "Corredor", JOptionPane.INFORMATION_MESSAGE);   
       }
        
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CorredoresDeCarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorredoresDeCarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorredoresDeCarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorredoresDeCarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CorredoresDeCarreraTabla dialog;
                dialog = new CorredoresDeCarreraTabla(new javax.swing.JFrame(), true, carrera, posicion);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCorredorACarreraAsignar;
    private javax.swing.JButton jButtonCorredorACarreraEliminar;
    private javax.swing.JList<String> jListListaCorredores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredoresCarrera;
    // End of variables declaration//GEN-END:variables
}
