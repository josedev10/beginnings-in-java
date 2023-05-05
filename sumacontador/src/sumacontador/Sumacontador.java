
package sumacontador;

import javax.swing.JOptionPane;

public class Sumacontador {

    public static void main(String[] args) {
        int num,sum=0,cont=0;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
            cont++;
            sum+=num;
        }while(num!=0);
        
        JOptionPane.showMessageDialog(null," los nùmeros ingresados son: "+cont+" y la suma es: "+sum);
    }
    
}
