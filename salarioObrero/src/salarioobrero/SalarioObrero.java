
package salarioobrero;

import javax.swing.JOptionPane;

public class SalarioObrero {

    public static void main(String[] args) {
        int horas,salariosem,salariosem2;
        
        horas=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa las horas trabajadas: "));
        
        
        if(horas<=40){
            salariosem= horas*16;
            //JOptionPane.showMessageDialog(null, "el salrio del trabajador Obrero es: "+salariosem);
        }else{
            salariosem=(40*16)+((horas-40)*20);
            //JOptionPane.showMessageDialog(null," El salario del trabajador Obrero es: "+salariosem2);
            
        }
        JOptionPane.showMessageDialog(null," El salario del trabajador Obrero es: "+salariosem);
    }
    
    
}
