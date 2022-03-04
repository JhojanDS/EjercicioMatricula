/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.modelo;

/**
 *
 * @author JHOJAN L
 */
public class Estudiante {
    
    private int codigo;
    private String nombre;
    private String email;
    private String genero;
    private Sede sede;
    private Programa programa;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, String email, String genero, Sede sede, Programa programa, String jornada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
        this.sede = sede;
        this.programa = programa;
        this.jornada = jornada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", email=" + email + ", genero=" + genero + ", sede=" + sede + ", programa=" + programa + ", jornada=" + jornada + '}';
    }

    
    
}
