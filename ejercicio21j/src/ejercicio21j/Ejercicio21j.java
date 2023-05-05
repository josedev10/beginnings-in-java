package ejercicio21j;

import javax.swing.JOptionPane;

public class Ejercicio21j {

    public static void main(String[] args) {
        int numero, i;
        boolean hay_negativo = false;

        for (i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el numero: "));

            if (numero < 0) {
                hay_negativo = true;
            }
        }
        if (hay_negativo == true) {
            JOptionPane.showMessageDialog(null, "Hay por lo menos un número negativo");
        } else {
            JOptionPane.showMessageDialog(null, "No hay números negativos");
        }
    }

}
