
package calcularfactorial;

import javax.swing.JOptionPane;

public class CalcularFactorial {

    public static void main(String[] args) {
        int n,i,factorial=1;
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número a calcular factorial: "));
        for(i=1;i<=n;i++){
            factorial*=i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del número "+n+" es: "+factorial);
    }
    
}
