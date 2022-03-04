/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.controlador;

import co.edu.univalle.modelo.Estudiante;
import co.edu.univalle.modelo.Matricula;
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
public class CtrCrearMatricula implements ActionListener {

    static int codigoMatricula=0;// numero de codigo asignado a cada matricula
    static int codigoEstudiante=0;// numero de codigo asignado a cada estudiante
    
    private CrearMatricula matricula;
    private List listaSede;
    private List listaPrograma;
    private List listaMatricula;

    public CtrCrearMatricula(CrearMatricula matricula, List listaSede, List listaPrograma, List listaMatricula) {
        this.matricula = matricula;
        this.listaSede = listaSede;
        this.listaPrograma = listaPrograma;
        this.listaMatricula = listaMatricula;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(matricula.getJbCrear())) {

            if (!matricula.getJtNombre().getText().equals("")
                    && !matricula.getJtEmail().getText().equals("")
                    && (matricula.getJrbFemenino().isSelected() || matricula.getJrbMasculino().isSelected())
                    && !matricula.getJcJornada().getSelectedItem().equals("")
                    && !matricula.getJcSede().getSelectedItem().equals("")
                    && !matricula.getJcPrograma().getSelectedItem().equals("")) {

                crearMatricula();

            } else {

                JOptionPane.showMessageDialog(matricula, "Completa todos los campos");

            }

        }
    }

    public void crearMatricula() {

        Estudiante e = new Estudiante();
        e.setCodigo(++codigoEstudiante);
        e.setNombre(matricula.getJtNombre().getText());
        e.setEmail(matricula.getJtEmail().getText());
        e.setGenero(establecerGenero());
        e.setJornada(matricula.getJcJornada().getSelectedItem().toString());
        e.setSede(establecerSede());
        e.setPrograma(establecerPrograma());
        
        Matricula m = new Matricula();
        m.setCodigo(++codigoMatricula);
        m.setEstudiante(e);

        System.out.println(m.toString());
        listaMatricula.add(m);
        
        JOptionPane.showMessageDialog(matricula, "Matricula creada con exito\n Codigo asignado: "+codigoMatricula);
        limpiar();

    }

    public void limpiar() {

        matricula.getJtNombre().setText("");
        matricula.getJtEmail().setText("");
        matricula.getJrbFemenino().setSelected(false);
        matricula.getJrbMasculino().setSelected(false);
        matricula.getJcJornada().setSelectedIndex(0);
        matricula.getJcPrograma().setSelectedIndex(0);
        matricula.getJcSede().setSelectedIndex(0);
        
    }

    public String establecerGenero() {

        if (matricula.getJrbFemenino().isSelected()) {

            return "Femenino";

        } else {

            return "Masculino";
        }
    }
    
    public Sede establecerSede() {

        int s = matricula.getJcSede().getSelectedIndex();

        return (Sede) listaSede.get(s - 1);

    }

    public Programa establecerPrograma() {

        int p = matricula.getJcPrograma().getSelectedIndex();

        return (Programa) listaPrograma.get(p - 1);
    }

}
