package determinaredad;

import javax.swing.JOptionPane;

public class Edad {

    int Edad;

    public void capEdad() {
        Edad = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la Edad: "));
    }

    public void Determinar() {
        if (Edad <= 8) {
            JOptionPane.showMessageDialog(null, "La Edad de: " + Edad + ""
                    + " Es de Primera Infancia");
        } else {
            if (Edad <= 12) {
                JOptionPane.showMessageDialog(null, "La Edad de: " + Edad + ""
                        + " Es de Segunda Infancia");
            } else {
                if (Edad <= 15) {
                    JOptionPane.showMessageDialog(null, "La Edad de: " + Edad + ""
                            + " Es de Preadolescencia");
                } else {
                    if (Edad <= 18) {
                        JOptionPane.showMessageDialog(null, "La Edad de: " + Edad + ""
                                + " Es de Adolescencia");
                    } else {
                        JOptionPane.showMessageDialog(null, "La Edad de: " + Edad + ""
                                + " Es de Mayor de Edad");
                    }
                }
            }
        }
    }

}
