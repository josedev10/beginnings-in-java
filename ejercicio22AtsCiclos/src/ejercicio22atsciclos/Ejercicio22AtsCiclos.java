
package ejercicio22atsciclos;

import javax.swing.JOptionPane;

public class Ejercicio22AtsCiclos {

    public static void main(String[] args) {
        int i;
        float notas;
        boolean hay_suspenso=false;
        
        for(i=1;i<=5;i++){
            notas=Float.parseFloat(JOptionPane.showInputDialog("Ingresa las calificación: "));
            
            if(notas<4){
                hay_suspenso=true;
            }
        }
        if(hay_suspenso==true){
            JOptionPane.showMessageDialog(null,"si hay algun suspenso");
        }else{
            JOptionPane.showMessageDialog(null,"no hay suspenso");
        }
    }
    
}
