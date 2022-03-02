/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatricula;
    

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjercicioMatricula extends JFrame{

    JMenuBar barra;
    JMenu administrador, estudiante;
    JMenuItem programa,sede,visualizar,prematricula;
    
     String MPrograma[][]= new String[20][2]; 
     int filaPrograma=0;
     int CodPrograma=2711;
     boolean ProgramaC=false;
     
     String MSedes[][]= new String[20][2]; 
     int filaSede=0;
     int CodSede=01;
     boolean SedeC=false;
     
     String MPrematricula[][]= new String[20][7]; 
     int filaPrematricula=0;
     int CodEstudiante=2157;
     boolean PrematriculaC=false;
     
    
    
  public EjercicioMatricula(){
   
    
      barra= new JMenuBar();
      setJMenuBar(barra);
  
      
      administrador= new JMenu("Administrador");
      estudiante= new JMenu("Estudiante"); 
      programa = new JMenuItem("Crear Programa");
      sede = new JMenuItem("Crear sede");
      visualizar = new JMenuItem("Visualizar matricula");
      prematricula = new JMenuItem("Prematricula");
    
      barra.add(administrador);
      barra.add(estudiante);
      administrador.add(programa);
      administrador.add(sede);
      administrador.add(visualizar);
      estudiante.add(prematricula);
      
      programa.addActionListener(new ActionListener() {
          
          public void actionPerformed(ActionEvent e) {
           
              CrearPrograma objCP = new CrearPrograma(EjercicioMatricula.this, true, MPrograma, filaPrograma, CodPrograma, ProgramaC);
              ProgramaC= objCP.PC;
              
              if(ProgramaC==true){
                 
                 ProgramaC=false; 
                 MPrograma=objCP.P;
                 filaPrograma++;
                 CodPrograma++;
              }
          
          }
      });
      sede.addActionListener(new ActionListener() {
          
          public void actionPerformed(ActionEvent e) {
           
              CrearSede objCP = new CrearSede(EjercicioMatricula.this, true, MSedes, filaSede, CodSede, SedeC);
              SedeC= objCP.SC;
              
              if(SedeC==true){
              
                 SedeC=false; 
                 MSedes=objCP.S;
                 filaSede++;
                 CodSede++;
              }
          
          }
      });
      prematricula.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
         
            Prematricula objPM = new Prematricula(EjercicioMatricula.this, true, MPrematricula, MPrograma, MSedes, CodEstudiante,
             filaPrematricula,filaPrograma,filaSede, PrematriculaC);
         
             PrematriculaC= objPM.PMc;
             
             if(PrematriculaC==true){
                 
             PrematriculaC=false;
             MPrematricula=objPM.PM;
             filaPrematricula++;
             CodEstudiante++;
             
             }
             
          }
      });
      visualizar.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            
              new VisualizarMatricula(EjercicioMatricula.this, true, MPrematricula, filaPrematricula, CodEstudiante);
          }
      });
      
      setSize(200,300);
      setVisible(true);
  }
    
    
    public static void main(String[] args) {
        
        new EjercicioMatricula();
    }
    
}
