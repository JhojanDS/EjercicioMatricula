/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.modelo;

/**
 *
 * @author JhojanDs <jhojanlopez327@gmail.com>
 */
public class Matricula {
    
    private int codigo;
    private Estudiante estudiante;

    public Matricula() {
    }

    
    public Matricula(int codigo, Estudiante estudiante) {
        this.codigo = codigo;
        this.estudiante = estudiante;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", estudiante=" + estudiante + '}';
    }
    
    
           
}
