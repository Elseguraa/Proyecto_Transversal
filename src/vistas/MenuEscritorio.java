
package vistas;

import javax.swing.JFrame;

/**
 *
 * @author mauri
 */
public class MenuEscritorio extends javax.swing.JFrame {

  
    public MenuEscritorio() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAlumno = new javax.swing.JMenu();
        jmAgregarAlumno = new javax.swing.JMenuItem();
        jmGestionarAlumno = new javax.swing.JMenuItem();
        jmBajaAlumno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMAgregarMAteria = new javax.swing.JMenuItem();
        jMModificarMateria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuAlumno.setText("Alumno");

        jmAgregarAlumno.setText("Agregar Alumno");
        jmAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jmAgregarAlumno);

        jmGestionarAlumno.setText("Gestionar Alumno");
        jmGestionarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionarAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jmGestionarAlumno);

        jmBajaAlumno.setText("Baja Alumno");
        jmBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBajaAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jmBajaAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenu5.setText("Materia");

        jMAgregarMAteria.setText("Agregar Materia");
        jMAgregarMAteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAgregarMAteriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMAgregarMAteria);

        jMModificarMateria.setText("Modificar Materia");
        jMModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMModificarMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMModificarMateria);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Inscripciones");

        jMenuItem5.setText("Crear Inscripcion");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Modificar Inscripcion");
        jMenu4.add(jMenuItem6);

        jMenuItem12.setText("Eliminar Inscripcion");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem11.setText("Agregar Nota");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Consultas");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Mostrar materias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoActionPerformed
       
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioAlumno fa = new FormularioAlumno();
        fa.setVisible(true);
        jEscritorio.add(fa);
        jEscritorio.moveToFront(fa);
        
    }//GEN-LAST:event_jmAgregarAlumnoActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jmGestionarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionarAlumnoActionPerformed
         jEscritorio.removeAll();
        jEscritorio.repaint();
        GestionarAlumno ma = new GestionarAlumno();
        ma.setVisible(true);
        jEscritorio.add(ma);
        jEscritorio.moveToFront(ma);
    }//GEN-LAST:event_jmGestionarAlumnoActionPerformed

    private void jMAgregarMAteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAgregarMAteriaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioMateria fm = new FormularioMateria();
        setExtendedState(JFrame.NORMAL);
        fm.setVisible(true);
        jEscritorio.add(fm);
        jEscritorio.moveToFront(fm);
    }//GEN-LAST:event_jMAgregarMAteriaActionPerformed

    private void jmBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBajaAlumnoActionPerformed
         jEscritorio.removeAll();
        jEscritorio.repaint();
        BajaAlumno ba = new BajaAlumno();
        ba.setVisible(true);
        jEscritorio.add(ba);
        jEscritorio.moveToFront(ba);
    }//GEN-LAST:event_jmBajaAlumnoActionPerformed

    private void jMModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModificarMateriaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        GestionarMateria vr = new GestionarMateria();
        vr.setVisible(true);
        jEscritorio.add(vr);
        jEscritorio.moveToFront(vr);
    }//GEN-LAST:event_jMModificarMateriaActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        MostrarMaterias mm = new MostrarMaterias();
        mm.setVisible(true);
        jEscritorio.add(mm);
        jEscritorio.moveToFront(mm);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

   
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
            java.util.logging.Logger.getLogger(MenuEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jMAgregarMAteria;
    private javax.swing.JMenuItem jMModificarMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmAgregarAlumno;
    private javax.swing.JMenuItem jmBajaAlumno;
    private javax.swing.JMenuItem jmGestionarAlumno;
    // End of variables declaration//GEN-END:variables
}
