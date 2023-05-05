
package ejerciciopar;

import javax.swing.JOptionPane;

public class Ejerciciopar {

    public static void main(String[] args) {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        
        while(num!=0){
            if(num%2==0){
                JOptionPane.showMessageDialog(null, " El número "+num+" es par");
            }else{
                JOptionPane.showMessageDialog(null, "El número "+num+" es impar");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        }
        
        if(num==0){
            JOptionPane.showMessageDialog(null, " Usted ha salido");
        }
    }
    
}
