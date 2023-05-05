
package pedirn10ejercicio;

import javax.swing.JOptionPane;

public class PedirN10Ejercicio {

    public static void main(String[] args) {
        int num,sum=0,i;
        
        
        for(i=1;i<=10;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
            sum+=num;
        }
        JOptionPane.showMessageDialog(null, " La suma de los números es: "+sum);
        
    }
    
}
