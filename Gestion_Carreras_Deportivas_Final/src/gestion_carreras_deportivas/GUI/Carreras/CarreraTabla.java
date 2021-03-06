/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivas.GUI.Carreras;

import gestion_carreras_deportivas.DTO.Carrera;
import gestion_carreras_deportivas.DTO.Corredor;
import gestion_carreras_deportivas.DTO.LogicaNegocioCarrera;
import gestion_carreras_deportivas.DTO.LogicaNegocioCorredor;
import gestion_carreras_deportivas.GUI.Carreras.CorredoresDeCarreras.CorredoresDeCarreraTabla;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author David
 */
public class CarreraTabla extends javax.swing.JDialog {

    private LogicaNegocioCarrera logicaNegocioCarrera;
      
    /**
     * Creates new form CarreraTabla
     */
    public CarreraTabla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refrescarTabla();
    }

      private void refrescarTabla(){ 
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Fecha", "Lugar", "Numero_Max", "Mapa_Corredor"});
       
        List<Carrera> listaCarrera = logicaNegocioCarrera.getListaCarrera();
            for(Carrera carrera : listaCarrera){
            dtm.addRow(carrera.toArrayString());
        }
        jTableCarreras.setModel(dtm);
        
        //pal default
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
        jTableCarreras.setRowSorter(sorter);
        
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(3,SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
         
        
    }
      
    public void aniadirCarrera(Carrera carrera, Map<Corredor, Integer> MapaCorredor){
      
      
       
        DefaultTableModel dtm = (DefaultTableModel)jTableCarreras.getModel();
        dtm.addRow(carrera.toArrayString());
        refrescarTabla();
        this.setVisible(true);
    }
    
  public void borrarCarrera(Carrera carrera){    
       int row = jTableCarreras.getSelectedRow();
       String nombre = jTableCarreras.getModel().getValueAt(row, 0).toString();
       List<Carrera> listaCarreras = logicaNegocioCarrera.getListaCarrera();
       
      for(int i=0 ; i<listaCarreras.size(); i++){
              if(listaCarreras.get(i).toArrayString()[0].equals(nombre) ){
                  logicaNegocioCarrera.borrarCarrera(i);
              }
          }
        
       DefaultTableModel dtm = new DefaultTableModel();
       

        jTableCarreras.setModel(dtm);
        
       int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres borrar esta carrera?", "Carrera",JOptionPane.YES_NO_OPTION);
       if(resultado == JOptionPane.YES_OPTION)
           JOptionPane.showMessageDialog(this, "Borramos", "Carrera", JOptionPane.INFORMATION_MESSAGE);
       else if (resultado == JOptionPane.NO_OPTION)
           JOptionPane.showMessageDialog(this, "No Borramos", "Carrera", JOptionPane.INFORMATION_MESSAGE);  
    }
    
  
  public void modificarActualizar(){
      refrescarTabla();
  } 
  
    public void iractualizarCarrera(){
       int row = jTableCarreras.getSelectedRow();
       String nombre = jTableCarreras.getModel().getValueAt(row, 0).toString();
       List<Carrera> listaCarrera = logicaNegocioCarrera.getListaCarrera();
       Carrera carrera=null;
       
       
       for(Carrera carrera2 : listaCarrera){
        if(carrera2.getNombre().equals(nombre)){
            carrera=carrera2;
        }     
        }
       
        CarreraModificar carreraModificar = new CarreraModificar(new javax.swing.JFrame(), true);
        
        
        carreraModificar.asignarParametros(carrera); 
        carreraModificar.setVisible(true);
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
        jTableCarreras = new javax.swing.JTable();
        jButtonVolverInicio = new javax.swing.JButton();
        jButtonAlta = new javax.swing.JButton();
        jButtonCorredoresCarrera = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCarreras);

        jButtonVolverInicio.setText("Volver Al Inicio");
        jButtonVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverInicioActionPerformed(evt);
            }
        });

        jButtonAlta.setText("Carrera Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonCorredoresCarrera.setText("VerCorredorCarrera");
        jButtonCorredoresCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresCarreraActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonVolverInicio)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jButtonCorredoresCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolverInicio)
                    .addComponent(jButtonCorredoresCarrera)
                    .addComponent(jButtonModificar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverInicioActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverInicioActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        CarreraCrear carreraCrear = new CarreraCrear(new javax.swing.JFrame(), true);
        carreraCrear.setVisible(true);
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonCorredoresCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresCarreraActionPerformed
        
         
       int row = jTableCarreras.getSelectedRow();
       String nombre = jTableCarreras.getModel().getValueAt(row, 0).toString();
       System.out.print(nombre);
       List<Carrera> listaCarrera = LogicaNegocioCarrera.getListaCarrera(); 
       Carrera carrera=null;
        int g=0;
       for(Carrera carrera2 : listaCarrera){
        if(carrera2.getNombre().equals(nombre)){
            carrera=carrera2;
        }     
        g++;
       } 
      
        
        
        CorredoresDeCarreraTabla carreraCorredores = new CorredoresDeCarreraTabla(new javax.swing.JFrame(), true,carrera, g);
        carreraCorredores.setVisible(true);/*
        carreraCorredores.carrera=carrera;
        carreraCorredores.listaCorredorAsignados=listaCorredoresDeCarrera;
        setVisible(false);*/
        
    }//GEN-LAST:event_jButtonCorredoresCarreraActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        iractualizarCarrera();
    }//GEN-LAST:event_jButtonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(CarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarreraTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CarreraTabla dialog = new CarreraTabla(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonCorredoresCarrera;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolverInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
