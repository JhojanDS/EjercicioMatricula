/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatricula;

/**
 *
 * @author JHOJAN L
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.*;

public class Mensaje extends JDialog{
    
    JLabel cadena;
    JButton cerrar;
    
    
    public Mensaje(JFrame papa, boolean modal, String mensaje){
        
        super(papa, modal);
        Container c = getContentPane();
        c.setLayout (new FlowLayout());
        
        cadena = new JLabel(mensaje);
        cerrar = new JButton("cerrar");
      
        c.add(cadena);
        c.add(cerrar);
        
       
        
        cerrar.addActionListener(new ActionListener(){
    
        public void actionPerformed(java.awt.event.ActionEvent e) {
            
            dispose();//cierra la ventana cuando termine el action listener
        }
    
    
    
    });
        
        
     setSize(200,100);
     setVisible(true);    
    }
    
}
