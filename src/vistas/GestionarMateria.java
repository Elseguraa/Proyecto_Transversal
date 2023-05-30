/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import control.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mauri
 */
public class GestionarMateria extends javax.swing.JInternalFrame {

    private MateriaData md = new MateriaData();

    public GestionarMateria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTAño = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jTID = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBDarBaja = new javax.swing.JButton();
        jBDarAlta = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GESTIONAR MATERIA");

        jTNombre.setEditable(false);
        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("AÑO:");

        jTAño.setEditable(false);
        jTAño.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAñoActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese el ID Materia");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("ESTADO:");

        jBDarBaja.setBackground(new java.awt.Color(255, 102, 102));
        jBDarBaja.setText("DAR DE BAJA");
        jBDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDarBajaActionPerformed(evt);
            }
        });

        jBDarAlta.setBackground(new java.awt.Color(0, 255, 51));
        jBDarAlta.setText("DAR DE ALTA");
        jBDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 77, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jBDarAlta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jBDarBaja))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(119, 356, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstado)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAñoActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed

        Materia materia = md.buscarMateria(Integer.parseInt(jTID.getText()));
        try{
        materia.setNombre(jTNombre.getText());
        materia.setAnio(Integer.parseInt(jTAño.getText()));
        md.actualizarMateria(materia);
        limpiarCamposTexto();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        this.limpiarCamposTexto();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed

    }//GEN-LAST:event_jTIDActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        Materia materia = md.buscarMateria(Integer.parseInt(jTID.getText()));
        if(materia == null){
            JOptionPane.showMessageDialog(null, "Materia no encontrada", "Error", 0);
        }else{
            jTNombre.setText(materia.getNombre());
            jTNombre.setEditable(true);
            jTAño.setText(String.valueOf(materia.getAnio()));
            jTAño.setEditable(true);
            if(materia.isEstado()){
                jLEstado.setText("HABILITADO");
                jLEstado.setForeground(Color.GREEN);
            }else{
                jLEstado.setText("INHABILITADO");
                jLEstado.setForeground(Color.RED);
            }
        }
//        Materia ma = md.buscarMateria(Integer.parseInt(jTID.getText()));
//        if(ma==null){
//                    JOptionPane.showMessageDialog(null, "Materia no encontrada");
//        }else{
//        jTNombre.setText(a.getNombre());jTNombre.setEditable(true);
//       jTAño.setText(a.getApellido()); jTAño.setEditable(true);
//        jTDni.setText(String.valueOf(a.getDni()));jTDni.setEditable(true);
//        jTDia.setText(String.valueOf(a.getFecha_nac().getDayOfMonth()));jTDia.setEditable(true);
//        jTMes.setText(String.valueOf(a.getFecha_nac().getMonthValue()));jTMes.setEditable(true);
//        jTAño.setText(String.valueOf(a.getFecha_nac().getYear()));jTAño.setEditable(true);
//        if(a.isEstado()){
//            jLEstado.setText("HABILITADO");
//            jLEstado.setForeground(Color.green);
//        }else{
//            jLEstado.setText("INHABILITADO");
//            jLEstado.setForeground(Color.red);
//        }
//        
//        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDarBajaActionPerformed

        try {
            Materia materia = md.buscarMateria(Integer.parseInt(jTID.getText()));
            if (materia.isEstado()) {
                int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de baja esta materia?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    md.bajaMateria(materia.getId_materia());
                    jLEstado.setText("Materia Inhabilitada");
                    jLEstado.setForeground(Color.red);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja la materia", "Error", 0);
        }
//        Alumno a = ad.buscarAlumno(Integer.parseInt(jTID.getText()));
//        if(a.isEstado()){
//            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de BAJA este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
//            
//            if (opcion == JOptionPane.YES_OPTION) {
//                ad.borrarAlumno(a.getID());
//                jLEstado.setText("INHABILITADO");
//                jLEstado.setForeground(Color.red);
//            }
//        }    
    }//GEN-LAST:event_jBDarBajaActionPerformed

    private void jBDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDarAltaActionPerformed

            Materia materia = md.buscarMateria(Integer.parseInt(jTID.getText()));
            if (!materia.isEstado()) {
                int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de alta esta materia?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    md.altaMateria(materia.getId_materia());
                    jLEstado.setText("Materia Habilitada");
                    jLEstado.setForeground(Color.GREEN);
                }
            }
//        Alumno a = ad.buscarAlumno(Integer.parseInt(jTID.getText()));
//        if(!a.isEstado()){
//            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de ALTA este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
//            
//            if (opcion == JOptionPane.YES_OPTION) {
//                ad.habilitarAlumno(a);
//                jLEstado.setText("HABILITADO");
//                jLEstado.setForeground(Color.green);
//            }
//        }

    }//GEN-LAST:event_jBDarAltaActionPerformed

    public void limpiarCamposTexto() {
        Component[] componentes = getContentPane().getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                JTextField textField = (JTextField) componente;
                textField.setText("");
            } else if (componente instanceof JTextArea) {
                JTextArea textArea = (JTextArea) componente;
                textArea.setText("");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBDarAlta;
    private javax.swing.JButton jBDarBaja;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
