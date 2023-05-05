
package divisible;

import javax.swing.JOptionPane;

public class Divisible {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        if(num%2==0){
            JOptionPane.showMessageDialog(null,"El número es Divisible");
        }else{
            JOptionPane.showMessageDialog(null,"El número no es Divisible");
        }
    }
    
}
