
package pedirdosn;

import javax.swing.JOptionPane;

public class Pedirdosn {

    public static void main(String[] args) {
        int num1,num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número 1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número 2: "));
        
        if(num1<=num2){
            if(num1<num2){
                JOptionPane.showMessageDialog(null, "El número: "+num2+" es mayor");
            }else{
                JOptionPane.showMessageDialog(null," Los números son iguales");
            }
        }else{
            JOptionPane.showMessageDialog(null," El número: "+num1+" es mayor");
        }
    }
    
}
