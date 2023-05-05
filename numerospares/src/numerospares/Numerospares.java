
package numerospares;

import javax.swing.JOptionPane;

public class Numerospares {

    public static void main(String[] args) {
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog(" INgresa el número 1: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número 2: "));
        
        
        if(n1%2==0 && n2%2==0){
            JOptionPane.showMessageDialog(null," ambos números son pares");
        }else{
            if(n1%2==0 || n2%2==0){
                JOptionPane.showMessageDialog(null," uno es par y otro es impar");
            }else{
                JOptionPane.showMessageDialog(null," ambos números son impares");
            }
        }
    }
    
}
