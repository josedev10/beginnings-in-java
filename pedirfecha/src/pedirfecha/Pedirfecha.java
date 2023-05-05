package pedirfecha;

import javax.swing.JOptionPane;

public class Pedirfecha {

    public static void main(String[] args) {
        int d, m, a;

        d = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el día: "));
        m = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el mes: "));
        a = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el año: "));

        if (d <= 30 && d >= 1) {
            if (m <= 12 && m >= 1) {
                if (a != 0) {
                    JOptionPane.showMessageDialog(null, " la fecha: " + a + "-" + m + "-" + d + " es correcta");
                }else{
                    JOptionPane.showMessageDialog(null, " La fecha es incorrecta, año incorrecto");
                } 
                
            }else{
                JOptionPane.showMessageDialog(null, " La fecha es incorrecta, mes incorrecto");
            }

        }else{
            JOptionPane.showMessageDialog(null, " La fecha es incorrecta, dia incorrecto");
        }
    }
}
