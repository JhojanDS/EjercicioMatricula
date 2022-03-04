/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.vista;

import co.edu.univalle.controlador.CtrInicio;
import co.edu.univalle.modelo.*;
import java.util.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author JHOJAN L
 */
public class Inicio extends javax.swing.JFrame {

    static List<Programa> listaPrograma;
    static List<Sede> listaSede;
    static List<Matricula> listaMatricula;

    public Inicio() {

        initComponents();
        this.listaPrograma = new ArrayList<>();
        this.listaSede = new ArrayList<>();
        this.listaMatricula = new ArrayList<>();

        CtrInicio ctrl = new CtrInicio(this, listaSede, listaPrograma, listaMatricula);
        this.jMenuItemMatricula.addActionListener(ctrl);
        this.jMenuItemPrograma.addActionListener(ctrl);
        this.jMenuSede.addActionListener(ctrl);
        this.jMenuVisualizar.addActionListener(ctrl);

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
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPrograma = new javax.swing.JMenuItem();
        jMenuSede = new javax.swing.JMenuItem();
        jMenuVisualizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMatricula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MATRICULA ACADEMICA BASICA");

        jMenuBar.setBackground(new java.awt.Color(255, 0, 0));
        jMenuBar.setForeground(new java.awt.Color(255, 0, 0));

        jMenu1.setText("Administrador");

        jMenuItemPrograma.setText("Programa");
        jMenu1.add(jMenuItemPrograma);

        jMenuSede.setText("Sede");
        jMenu1.add(jMenuSede);

        jMenuVisualizar.setText("Visualizar");
        jMenu1.add(jMenuVisualizar);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Estudiante");

        jMenuItemMatricula.setText("Matricula");
        jMenu2.add(jMenuItemMatricula);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemMatricula;
    private javax.swing.JMenuItem jMenuItemPrograma;
    private javax.swing.JMenuItem jMenuSede;
    private javax.swing.JMenuItem jMenuVisualizar;
    // End of variables declaration//GEN-END:variables

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JMenuBar getjMenuBar() {
        return jMenuBar;
    }

    public void setjMenuBar(JMenuBar jMenuBar) {
        this.jMenuBar = jMenuBar;
    }

    public JMenuItem getjMenuItemMatricula() {
        return jMenuItemMatricula;
    }

    public void setjMenuItemMatricula(JMenuItem jMenuItemMatricula) {
        this.jMenuItemMatricula = jMenuItemMatricula;
    }

    public JMenuItem getjMenuItemPrograma() {
        return jMenuItemPrograma;
    }

    public void setjMenuItemPrograma(JMenuItem jMenuItemPrograma) {
        this.jMenuItemPrograma = jMenuItemPrograma;
    }

    public JMenuItem getjMenuSede() {
        return jMenuSede;
    }

    public void setjMenuSede(JMenuItem jMenuSede) {
        this.jMenuSede = jMenuSede;
    }

    public JMenuItem getjMenuVisualizar() {
        return jMenuVisualizar;
    }

    public void setjMenuVisualizar(JMenuItem jMenuVisualizar) {
        this.jMenuVisualizar = jMenuVisualizar;
    }

}