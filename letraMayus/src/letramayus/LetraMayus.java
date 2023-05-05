
package letramayus;

import javax.swing.JOptionPane;


public class LetraMayus {

    
    public static void main(String[] args) {
        char letra;
        
        letra=JOptionPane.showInputDialog(" Digite la letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, " la letra es mayúscula");
        }else{
            JOptionPane.showMessageDialog(null," La letra es minuscula");
        }
    }
    
}
