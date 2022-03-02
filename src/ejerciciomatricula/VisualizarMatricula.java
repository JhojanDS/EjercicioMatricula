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

public class VisualizarMatricula extends JDialog{
    
    JTextArea AreaMatricula;
    JLabel label1;
    JTextField caja1;
    JButton Cerrar, Buscar;
    
    public VisualizarMatricula(JFrame papa, boolean modal, String MPrematricula[][], int filaPrematricula, 
            int CodEstudiante){
    
    
        super(papa,modal);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        
        label1 = new JLabel("Codigo: ");
        caja1 = new JTextField("",6);
        
        AreaMatricula = new JTextArea(10,15);
        JScrollPane s = new JScrollPane(AreaMatricula, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         
         Cerrar = new JButton("Cerrar");
         Buscar = new JButton("Buscar");
         
         
         
        c.add(label1);
        c.add(caja1);
        c.add(Buscar);
        c.add(s);
        c.add(Cerrar);
        
        
        Buscar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
               if(!caja1.getText().equals("")){
               
                   BuscarCod(papa, MPrematricula, filaPrematricula);
                    
               }else{
                  String m="ERROR: Codigo no digitado ";
                  new Mensaje(papa, true, m);
               }
            }
        });
        
        
          Cerrar.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e) {
            
            dispose();//cierra la ventana cuando termine el action listener
        }
   });
   
        
     setSize(250,300);
     setVisible(true);
        
     
    
    }
    public void BuscarCod(JFrame papa, String MPrematicula[][], int filaPrematricula){
    
         boolean CodEncontrado=false;
         int PosEncontrado=0;
         
         
         for(int i=0; i<filaPrematricula; i++){//busco el codigo
         
              
             if(caja1.getText().equals(MPrematicula[i][0])){
             
               System.out.println("pase"); 
               CodEncontrado=true;
               PosEncontrado=i;
               break;
               
             }else{
             
              CodEncontrado=false;
             
             }
         }
    
        
       if(CodEncontrado==true){//valido si se encontro el codigo para imprimirlos
           
           MostrarPrematricula(papa, MPrematicula, PosEncontrado);
           
       }else{
           
           String m="Codigo digitado no encontrado";
           new Mensaje(papa, true, m);
       }
    
    
    
    }
    public void MostrarPrematricula(JFrame papa, String MPrematicula[][], int PosEncontrada){
    
    
    String PM=       "Codigo:"+MPrematicula[PosEncontrada][0]+"\n"+
                      "Nombre: "+MPrematicula[PosEncontrada][1]+"\n"+
                      "Email: "+MPrematicula[PosEncontrada][2]+"\n"+
                      "Genero: "+MPrematicula[PosEncontrada][3]+"\n"+
                      "Programa: "+MPrematicula[PosEncontrada][4]+"\n"+
                      "Sede: "+MPrematicula[PosEncontrada][5]+"\n"+
                      "Jornada: "+MPrematicula[PosEncontrada][6]+"\n";
        
    
    AreaMatricula.setText(PM);
   
    
    
    }

}
