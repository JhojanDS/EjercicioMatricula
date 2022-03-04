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

/**
 *
 * @author JHOJAN L
 */
public class CtrCrearSede implements ActionListener {

    private CrearSede crearSede;
    private List listaSede;

    public CtrCrearSede(CrearSede crearSede, List listaSede) {
        this.crearSede = crearSede;
        this.listaSede = listaSede;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(crearSede.getjBCrear())) {

            if (!crearSede.getjTextCodigo().getText().equals("") && !crearSede.getjTextNombre().getText().equals("")) {

                adicionarSede();

            }

        }
    }

    public void adicionarSede() {

        Sede s = new Sede();
        s.setCodigo(Integer.parseInt(crearSede.getjTextCodigo().getText()));
        s.setNombre(crearSede.getjTextNombre().getText());

        listaSede.add(s);
        limpiar();
    
        
        System.out.println(listaSede.toString());

    }

    public void limpiar() {
     
        crearSede.getjTextCodigo().setText("");
        crearSede.getjTextNombre().setText("");
        
    }
    
   

}
