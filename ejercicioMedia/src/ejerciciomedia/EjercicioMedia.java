
package ejerciciomedia;

import javax.swing.JOptionPane;

public class EjercicioMedia {

    public static void main(String[] args) {
        int num,i=0,sum=0;
        float media;
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        
        while(num>=0){
            sum+=num;
            i++;
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        }
        
        media=(float)sum/i;
        
        JOptionPane.showMessageDialog(null,"La media es: "+media);
    }
    
}
