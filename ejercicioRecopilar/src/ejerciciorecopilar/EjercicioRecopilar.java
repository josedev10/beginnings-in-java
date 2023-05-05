
package ejerciciorecopilar;

import javax.swing.JOptionPane;

public class EjercicioRecopilar {

    public static void main(String[] args) {
        int num,introducido=0;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        
        while(num>=0){
            introducido++;
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        }
        
        JOptionPane.showMessageDialog(null, " los números inroducidos son: "+introducido);
    }
    
}
