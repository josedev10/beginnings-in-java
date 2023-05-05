
package mostrarcuadrado;

import javax.swing.JOptionPane;

public class MostrarCuadrado {

    public static void main(String[] args) {
        int número, cuadrado;
        
        número=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        
        while(número>=0){
            cuadrado= (int) Math.pow(número, 2);
            
            JOptionPane.showMessageDialog(null," El número al cuadrado es: "+cuadrado);
            
            número=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        }
        
    }
    
}
