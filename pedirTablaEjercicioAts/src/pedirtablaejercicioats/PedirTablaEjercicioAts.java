
package pedirtablaejercicioats;

import javax.swing.JOptionPane;

public class PedirTablaEjercicioAts {

    public static void main(String[] args) {
        int tabla,i, tabla2;
        String cad="";
        tabla=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la tabla: "));
        
        for(i=1;i<=10;i++){
            tabla2=tabla*i;
            cad+=tabla2+" ";
            //JOptionPane.showMessageDialog(null,""+tabla2);
        }
        JOptionPane.showMessageDialog(null,""+cad);
    }
    
}
