/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.controlador;

import co.edu.univalle.modelo.*;
import co.edu.univalle.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JHOJAN L
 */
public class CtrVisualizarMatricula implements ActionListener {

    private VisualizarMatricula vMatricula;
    private List <Matricula>listaMatricula;

    public CtrVisualizarMatricula(VisualizarMatricula vMatricula, List listaMatricula) {
        this.vMatricula = vMatricula;
        this.listaMatricula = listaMatricula;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vMatricula.getJbBuscar())) {

            if (!vMatricula.getJtCodigo().getText().equals("")) {

                buscarCodigo();

            } else {

                JOptionPane.showMessageDialog(vMatricula, "Dato incompleto");

            }

        }
    }

    public void buscarCodigo() {

        int posicion=0;
        boolean encontrado = false;
        
        System.out.println(listaMatricula.toString());
        
        
        for (int i = 0; i < listaMatricula.size(); i++) {
            
            
            if(Integer.parseInt(vMatricula.getJtCodigo().getText()) == listaMatricula.get(i).getCodigo()){
            
                 encontrado = true;
                 posicion = i;
                 break;
            }

        }

        if(encontrado){
        
        
            mostrarMatricula(posicion);
        
        }else{
        
            JOptionPane.showMessageDialog(vMatricula, "Codigo no encontrado. Digita el codigo de la matricula a buscar");
        
        }
    }

    public void mostrarMatricula(int posicion) {
    
        vMatricula.getjTextArea1().setText("");
     
        
        
        String m = "\t Matricula : "+ listaMatricula.get(posicion).getCodigo()+"\n\n"
            + "Codigo estudiante: " + listaMatricula.get(posicion).getEstudiante().getCodigo()+"\n"
            + "Nombre: " + listaMatricula.get(posicion).getEstudiante().getNombre()+"\n"
            + "Email: " + listaMatricula.get(posicion).getEstudiante().getEmail()+"\n"
            + "Jornada: " + listaMatricula.get(posicion).getEstudiante().getJornada()+"\n"
            + "Sede: " + listaMatricula.get(posicion).getEstudiante().getSede().getNombre()+"\n"
            + "Programa: " + listaMatricula.get(posicion).getEstudiante().getPrograma().getNombre()+"\n"
            ;
        
        
        vMatricula.getjTextArea1().setText(m);
       
        
    
    }

}
