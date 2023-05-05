
package multiplo10;

import javax.swing.JOptionPane;

public class multi {
    int numero;
    
    public void pedir(){
        numero=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número entero: "));
    }
    public void Proceso(){
        if(numero%10==0){
            JOptionPane.showMessageDialog(null," El número "+numero+ " es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null," El número "+numero+" no es multiplo de 10");
        }
    }
}
