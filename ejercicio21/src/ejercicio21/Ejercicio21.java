
package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int i,num;
        boolean negativos=false;
        
        for(i=1;1<=10;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
            
            if(num<0){
                negativos=true;
            }
        }
        if(negativos==true){
            JOptionPane.showMessageDialog(null, " hay por lo menos un negativo: ");
        }
        
        
    }
    
    
}
