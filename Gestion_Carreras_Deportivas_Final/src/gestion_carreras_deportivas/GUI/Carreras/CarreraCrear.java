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
import gestion_carreras_deportivas.GUI.Corredores.CorredorTabla;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class CarreraCrear extends javax.swing.JDialog {

     private CarreraTabla carreraTabla;
     private LogicaNegocioCarrera logicaNegocioCarrera;
     private LogicaNegocioCorredor logicaNegocioCorredor;
    /**
     * Creates new form CarreraCrear
     */
    public CarreraCrear(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        List<Corredor> listaCorredor = LogicaNegocioCorredor.getListaCorredor();
        
           DefaultListModel model = new DefaultListModel<>();
           for(int i=0 ; i<listaCorredor.size(); i++){
           model.addElement(listaCorredor.get(i).toArrayString()[0]);
           }
       
           JList lista = jListListaCorredores; 
           lista.setModel(model);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCrearCarrera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jTextFieldLugarCarrera = new javax.swing.JTextField();
        jSpinnerNumeroMaximoParticipantes = new javax.swing.JSpinner();
        jButtonVolver = new javax.swing.JButton();
        jSpinnerFecha_nacCorredor = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListaCorredores = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de la carrera");

        jButtonCrearCarrera.setText("Crear Carrera");
        jButtonCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCarreraActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de la carrera");

        jLabel3.setText("Lugar de la carrera");

        jLabel4.setText("Numero maximo de participantes");

        jLabel5.setText("Lista Corredores");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jSpinnerFecha_nacCorredor.setModel(new javax.swing.SpinnerDateModel());

        jScrollPane1.setViewportView(jListListaCorredores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButtonCrearCarrera))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldLugarCarrera)
                            .addComponent(jSpinnerFecha_nacCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerNumeroMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNombreCarrera)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVolver)
                        .addGap(44, 44, 44)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerFecha_nacCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerNumeroMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCarrera)
                    .addComponent(jButtonVolver))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarFormulario(){
           String nombre = jTextFieldNombreCarrera.getText();
           String lugar = jTextFieldLugarCarrera.getText();
           if(nombre == null || lugar == null || "".equals(nombre) || "".equals(lugar)){
               JOptionPane.showMessageDialog(this, "No puede quedar vacio ningun campo", "Error", JOptionPane.ERROR_MESSAGE);
                       return false;
           }
           
           
           int numeroMax = (int)jSpinnerNumeroMaximoParticipantes.getValue();
           /*Date fecha = (Date)jSpinnerFechaCarrera.getValue();*/
           try{
             /*  Integer.parseInt(jSpinnerNumeroMaximoParticipantes.get)*/
           }
           catch (NumberFormatException e){
               JOptionPane.showMessageDialog(this, "Tiene que ser un entero", "Error", JOptionPane.ERROR_MESSAGE);
               return false;
           }
         /*  List<Corredor> corredores;
           Date fecha;*/
         return true;
    }
    
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCarreraActionPerformed
        if(validarFormulario()){
            String nombre = jTextFieldNombreCarrera.getText();
            String lugar = jTextFieldLugarCarrera.getText();
            int numeroMax = (int)jSpinnerNumeroMaximoParticipantes.getValue();
            Date fecha = (Date)jSpinnerFecha_nacCorredor.getValue();
            List<Corredor> CorredoresSeleccionadosFinal = new ArrayList<Corredor>();;
              
            List<String> listaF = jListListaCorredores.getSelectedValuesList();
            List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
            
            for(Corredor corredor : listaCorredor){
            System.out.println(corredor.getNombre());
                    for(String nombreC : listaF){
                        if(corredor.getNombre().equals(nombreC)){
                            System.out.println("mismo");
                            CorredoresSeleccionadosFinal.add(corredor);
                            System.out.println(corredor);
                        }
                   
                    }
             }

            
            Map<Corredor, Integer> MapaCorredor = new HashMap<>();
            
          
            
            int k=0;
            for(Corredor corredor : CorredoresSeleccionadosFinal){
                MapaCorredor.put(corredor, k);	
                k++;
            }
            
         
            	
             CarreraTabla carreraTabla = new CarreraTabla(new javax.swing.JFrame(), true);
             
             Carrera carrera = new Carrera(nombre, fecha, lugar, numeroMax);
             
              carrera.setMapaCorredor(MapaCorredor);
             logicaNegocioCarrera.aniadirCarrera(carrera);
             carreraTabla.aniadirCarrera(carrera, MapaCorredor);
             setVisible(false);
            
            
            
        }
    }//GEN-LAST:event_jButtonCrearCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(CarreraCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarreraCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarreraCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarreraCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CarreraCrear dialog = new CarreraCrear(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCrearCarrera;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListListaCorredores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFecha_nacCorredor;
    private javax.swing.JSpinner jSpinnerNumeroMaximoParticipantes;
    private javax.swing.JTextField jTextFieldLugarCarrera;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    // End of variables declaration//GEN-END:variables
}
