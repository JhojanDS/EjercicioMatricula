/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.controlador;

import co.edu.univalle.modelo.Programa;
import co.edu.univalle.modelo.Sede;
import co.edu.univalle.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JHOJAN L
 */
public class CtrInicio implements ActionListener {

    private Inicio inicio;
    private List listaSede;
    private List listaPrograma;
    private List listaMatricula;

    public CtrInicio(Inicio inicio, List listaSede, List listaPrograma, List listaMatricula) {
        this.inicio = inicio;
        this.listaSede = listaSede;
        this.listaPrograma = listaPrograma;
        this.listaMatricula = listaMatricula;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(inicio.getjMenuItemPrograma())) {

            new CrearPrograma().setVisible(true);

        } else if (e.getSource().equals(inicio.getjMenuSede())) {

            new CrearSede().setVisible(true);

        } else if (e.getSource().equals(inicio.getjMenuVisualizar())) {

            if (!listaMatricula.isEmpty()) {

                new VisualizarMatricula().setVisible(true);

            } else {

                JOptionPane.showMessageDialog(inicio, "No existen matriculas creadas para visualizar");

            }

        } else if (e.getSource().equals(inicio.getjMenuItemMatricula())) {

            /*sede y  programa creado automaticamente
            Sede s = new Sede(1, "cali");
            listaSede.add(s);

            Programa p = new Programa(1, "Tecnologia en sistemas");
            listaPrograma.add(p);*/

            if (!listaSede.isEmpty() && !listaPrograma.isEmpty()) {

                new CrearMatricula().setVisible(true);

            } else {

                JOptionPane.showMessageDialog(inicio, "No hay Sedes o Programas creados para realizar una matricula");
            }
        }

    }

}
