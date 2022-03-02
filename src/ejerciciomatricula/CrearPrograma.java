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
import java.math.MathContext;
import javax.swing.*;

public class CrearPrograma extends JDialog{

JLabel label1;
JTextField caja1;
JButton crear;
    
String P[][];
boolean PC=false;  

public CrearPrograma(JFrame papa, boolean modal, String MProgramas[][], int filaPrograma, int CodPrograma, boolean ProgramaC){

 super(papa, true);
 Container c = getContentPane();
 c.setLayout(new FlowLayout()); 
 
 
    label1 = new JLabel("Programa");
    caja1 = new JTextField("", 6);
    crear = new JButton("Crear");
    

    c.add(label1);
    c.add(caja1);
    c.add(crear);
 
      
    crear.addActionListener(new ActionListener() {
   
     public void actionPerformed(ActionEvent e) {
        
       if(!caja1.getText().equals("")){
           
         CrearPrograma(MProgramas, filaPrograma,CodPrograma,ProgramaC);}
       
       else{
           
         String m= "Digite el Programa a crear";
         new Mensaje(null, true, m);
       }
         
         dispose();
         
     }
 });
    
    
    setSize(180,130);
    setVisible(true);

}

public void CrearPrograma(String MProgramas[][], int filaPrograma, int CodPrograma, boolean ProgramaC){

    boolean CrearP = false;
    if(filaPrograma==0){
    CrearP=true;
    }
    
    for(int i=0; i<filaPrograma; i++){//valido si el programa no esta creado
    
        if(caja1.getText().equals(MProgramas[i][1])){
          
            
            CrearP=false;
        
            
        }else{
         
            
           CrearP=true;
           
        }
    }
    
    //creo el programa
    if(CrearP==true){
    
      MProgramas[filaPrograma][0]=""+CodPrograma;
      MProgramas[filaPrograma][1]=caja1.getText();
              
      P=MProgramas;
      ProgramaC=true;
      PC=ProgramaC;
     
      String m= "El programa "+caja1.getText()+" Fue creado con exito!"
              + "Con el codigo: "+CodPrograma;
      new Mensaje(null, true, m);
   
    }else{
     
        String m= "ERROR: El programa "+caja1.getText()+" ya fue creado";
        new Mensaje(null, true, m);
      
    }
}
}

