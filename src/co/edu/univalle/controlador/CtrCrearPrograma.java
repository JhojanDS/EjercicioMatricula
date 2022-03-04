/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.controlador;

import co.edu.univalle.modelo.Programa;
import co.edu.univalle.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author JHOJAN L
 */
public class CtrCrearPrograma implements ActionListener {

    private CrearPrograma crearPrograma;
    private List listaPrograma;

    public CtrCrearPrograma(CrearPrograma crearPrograma, List listaPrograma) {
        this.crearPrograma = crearPrograma;
        this.listaPrograma = listaPrograma;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(crearPrograma.getjBCrear())) {

            if (!crearPrograma.getjTextCodigo().getText().equals("") && !crearPrograma.getjTextNombre().getText().equals("")) {

                adicionarPrograma();

            }

        }
    }

    public void adicionarPrograma() {

        Programa p = new Programa();
        p.setCodigo(Integer.parseInt(crearPrograma.getjTextCodigo().getText()));
        p.setNombre(crearPrograma.getjTextNombre().getText());

        listaPrograma.add(p);
        limpiar();
    
        
        System.out.println(listaPrograma.toString());

    }

    public void limpiar() {
     
        crearPrograma.getjTextCodigo().setText("");
        crearPrograma.getjTextNombre().setText("");
        
    }
    
   

}
