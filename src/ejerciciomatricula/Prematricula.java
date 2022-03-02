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


public class Prematricula extends JDialog{
    
JLabel label1,label2, label3, label4,label5, label6,label7;
JTextField caja1,caja2;
JRadioButton r1,r2;
ButtonGroup grupo;
JComboBox selectorP, selectorS;
JCheckBox c1, c2, c3, c4;
JButton crear;
   

String PM[][];
boolean PMc=false; 
    
    public Prematricula(JFrame papa, boolean modal, String MPrematricula[][], String MPrograma[][],
         String MSedes[][],int CodEstudiante,int filaPrematricula,int filaPrograma,int filaSede, 
         boolean PrematriculaC){
    
    
    super(papa, modal);
    Container c = getContentPane();
    c.setLayout(new FlowLayout()); 
        
        
    label1 = new JLabel("Nombre");
    label2 = new JLabel("Email");
    label3 = new JLabel("Genero: ");
    label4 = new JLabel("Programa: ");
    label5 = new JLabel("   Sede: ");
    label6 = new JLabel("   Jornada: ");
   
    
    caja1 = new JTextField("", 6);
    caja2 = new JTextField("", 6);
    
    selectorP = new JComboBox();
    selectorP.addItem("");
    //bucle de los programas
    for(int i=0;i<filaPrograma;i++){
    
        selectorP.addItem(""+MPrograma[i][1]+" / "+MPrograma[i][0]);
    }
    
    selectorS = new JComboBox();
    selectorS.addItem("");
    //bucle de las sedes
    for(int i=0;i<filaSede;i++){
    
        selectorS.addItem(""+MSedes[i][1]+" / "+MSedes[i][0]);
    }
    
    
    r1 = new JRadioButton("Masculino");
    r2 = new JRadioButton("Femenino");
    grupo = new ButtonGroup();
    grupo.add(r1);
    grupo.add(r2);
    
    c1 = new JCheckBox("Diurno");
    c2 = new JCheckBox("Nocturno");
    c3 = new JCheckBox("Vespertino");
    c4 = new JCheckBox("Sabados");
    
    crear = new JButton("Crear");
    

    c.add(label1);
    c.add(caja1);
    c.add(label2);
    c.add(caja2);
    c.add(label3);
    c.add(r1);
    c.add(r2);
    c.add(label4);
    c.add(selectorP);
    c.add(label5);
    c.add(selectorS);
    c.add(label6);
    c.add(c1);
    c.add(c2);
    c.add(c3);
    c.add(c4);
    c.add(crear);
    
    crear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
            
            
     if(!caja1.getText().equals("") && !caja2.getText().equals("")){//valido si todos los campos fueron escogidos
               
               
        if(r1.isSelected()!=false || r2.isSelected()!=false){
               
                   
           if(selectorP.getSelectedIndex()!=0 && selectorS.getSelectedIndex()!=0){
                   
                      
              if(c1.isSelected()!=false || c2.isSelected()!=false || c3.isSelected()!=false || c4.isSelected()!=false){
                  
                  //metodo para crear matricula 
                  
                  CrearPrematricula(papa, MPrematricula, filaPrematricula, CodEstudiante, PrematriculaC);
                  dispose();
                  }
                 
               else{
                   
                    String m="Error: Campo incompleto: Jornadas";
                    new Mensaje(papa, true, m);
                  }
                  
            }else{
                   
                  String m="Error: Campo incompleto: Programa o Sede ";
                  new Mensaje(papa, true, m);
                  }
                   
        }else{
               
              String m="Error: Selecciona Genero ";
              new Mensaje(papa, true, m);
               }
                
 }else{
               
       String m="Error: Completa los campos: Nombre e email";
       new Mensaje(papa, true, m);
            
            }
            
        }
    });
    
    setSize(155,400);
    setVisible(true);
    
    }
    
    public void CrearPrematricula(JFrame papa, String MPrematricula[][], int filaPrematricula, int CodEstudiante, boolean PrematriculaC){
      
        MPrematricula[filaPrematricula][0]=""+CodEstudiante;
        MPrematricula[filaPrematricula][1]=caja1.getText();
        MPrematricula[filaPrematricula][2]=caja2.getText();
        MPrematricula[filaPrematricula][3]=genero();
        MPrematricula[filaPrematricula][4]=""+selectorP.getSelectedItem();
        MPrematricula[filaPrematricula][5]=""+selectorS.getSelectedItem();
        MPrematricula[filaPrematricula][6]=Jornada();
    
    
        PM=MPrematricula;
        PrematriculaC=true;
        PMc=PrematriculaC;
        
        
        String m="Prematricula Creada con exito! codigo asignado: "+CodEstudiante;
        new Mensaje(papa, true, m);
   
    
    }
    public String genero(){
    
        String genero="";
        
        if(r1.isSelected()==true){
            
            genero="Masculino";
            
        }else if(r2.isSelected()==true){
            
           genero="Femenino";
        }
        
        
        return genero;
    
    }
    public String Jornada(){
      
        String Jornada="";
     
       if(c1.isSelected()==true){//si la jornada c1 fue escogida se guardara, (pueden ser varias)
        
           Jornada=c1.getText()+"/";}
        
       if(c2.isSelected()==true){
        
           Jornada=Jornada+c2.getText()+"/";}
       
       if(c3.isSelected()==true){
        
           Jornada=Jornada+c3.getText()+"/";}
       
       if(c4.isSelected()==true){
        
           Jornada=Jornada+c4.getText()+"/";}
        
        return Jornada;
    }
}
