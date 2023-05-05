
package ejerciciosueldos20;

import javax.swing.JOptionPane;

public class EjercicioSueldos20 {

    public static void main(String[] args) {
        int n,i;
        float sueldo,sueldoMay=0;
        
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número de sueldos a introducir: "));
        
        for(i=1;i<=n;i++){
            sueldo=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el sueldo n "+i+" : "));
            if(sueldoMay<sueldo){
                sueldoMay=sueldo;
            }
        }
        JOptionPane.showMessageDialog(null," El sueldo más alto es: "+sueldoMay);
    }
    
}
