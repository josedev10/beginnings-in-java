
package ejercicio0;

import javax.swing.JOptionPane;

public class Ejercicio0 {

    
    public static void main(String[] args) {
        
        int número;
        
        número=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el número: "));
        
        while(número!=0){
            if(número<0){
                JOptionPane.showMessageDialog(null, " El número "+número+" es Negativo");
            }else{
                JOptionPane.showMessageDialog(null, " El númereo "+número+" es positivo");
            }
            
            número=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el número: "));
        }
        
        if(número==0){
            JOptionPane.showMessageDialog(null," Usted ha salido");
        }
    }
}
