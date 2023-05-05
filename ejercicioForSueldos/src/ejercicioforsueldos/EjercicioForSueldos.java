
package ejercicioforsueldos;

import javax.swing.JOptionPane;

public class EjercicioForSueldos {

    public static void main(String[] args) {
        int i,mayores=0;
        float sueldo,sumasueldo=0;
        for(i=1;i<=5;i++){
            sueldo=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el sueldo: "));
            sumasueldo+=sueldo;
            if(sueldo>1000){
                mayores++;
            }
        }
        JOptionPane.showMessageDialog(null, ""
                + " La suma de los sueldos es: "+sumasueldo+""
                        + " y los sueldos mayores a 1000 son: "+mayores);
    }
    
}
