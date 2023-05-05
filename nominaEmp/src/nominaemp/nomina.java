/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominaemp;

import javax.swing.JOptionPane;

/**
 *
 * @author enriq
 */
public class nomina {
    String nom;
    float sbxh,nht,sb,rt,sn;
   public void capNom(){
       nom=JOptionPane.showInputDialog(" introduce un nombre: ");
  
   }
   public void capSbxh(){
       sbxh=Float.parseFloat(JOptionPane.showInputDialog(""
               + " el salario basico x horas: "));
   }
   public void capNht(){
       nht=Float.parseFloat(JOptionPane.showInputDialog(""
              + " Ingresa el número de horas trabajadas: "));
   }
   public void Proceso(){
       sb=nht*sbxh;
       if(sb<=1000){
           rt=0;
           sn=sb;
       }else{
           if(sb<=3000){
               rt=(float) (sb*0.05);
               sn=sb-rt;
               
           }else{
               if(sb>3000){
                   rt=(float) (sb*0.08);
                   sn=sb-rt;
               }
               JOptionPane.showMessageDialog(null,""
                       + " \nEl empleado: "+nom+""
                               + " \nsu salario bruto es: "+sb+""
                                       + " \nsu retención es: "+rt+""
                                               + " \nsu salario neto es: "+sn);
           }
       }
       
   }
    
}
