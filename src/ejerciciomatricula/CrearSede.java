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

public class CrearSede extends JDialog{

JLabel label1;
JTextField caja1;
JButton crear;
    
String S[][];
boolean SC=false;  

public CrearSede(JFrame papa, boolean modal, String MSedes[][], int filaSede, int CodSede, boolean SedeC){

 super(papa, true);
 Container c = getContentPane();
 c.setLayout(new FlowLayout()); 
 
 
    label1 = new JLabel("Sede: ");
    caja1 = new JTextField("", 6);
    crear = new JButton("Crear");
    

    c.add(label1);
    c.add(caja1);
    c.add(crear);
 
      
    crear.addActionListener(new ActionListener() {
   
     public void actionPerformed(ActionEvent e) {
        
       if(!caja1.getText().equals("")){
           
         CrearSedes(MSedes, filaSede,CodSede,SedeC);}
       
       else{
           
         String m= "Digite el Sede a crear";
         new Mensaje(null, true, m);
       }
         
         dispose();
         
     }
 });
    
    
    setSize(180,130);
    setVisible(true);

}

public void CrearSedes(String MSedes[][], int filaSede, int CodSede, boolean SedeC){

    boolean CrearS = false;
    if(filaSede==0){
    CrearS=true;
    }
    
    for(int i=0; i<filaSede; i++){//valido si la sede no esta creada
    
        if(caja1.getText().equals(MSedes[i][1])){
          
            
            CrearS=false;
        
            
        }else{
         
            
           CrearS=true;
           
        }
    }
    
    //creo la sede a partir de una validacion. 
    if(CrearS==true){
    
      MSedes[filaSede][0]=""+CodSede;
      MSedes[filaSede][1]=caja1.getText();
              
      S=MSedes;
      SedeC=true;
      SC=SedeC;
     
      String m= "La sede "+caja1.getText()+" Fue creada con exito!"
              + "Con el codigo: "+CodSede;
      new Mensaje(null, true, m);
   
    }else{
     
        String m= "ERROR: La sede "+caja1.getText()+" ya fue creada";
        new Mensaje(null, true, m);
      
    }
}
}

