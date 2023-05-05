package divisiblesentresi;

import javax.swing.JOptionPane;

public class entresi {

    int num1, num2;

    public void CapNums() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el Primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el segundo número: "));
    }

    public void ProcDivi() {
        if (num1 % num2 == 0) {
            JOptionPane.showMessageDialog(null, "Si son Divisibles entre sí");
        } else {
            if (num2 % num1 == 0) {
                JOptionPane.showMessageDialog(null, "Si son Divisibles entre sí");

            } else {
                JOptionPane.showMessageDialog(null, " No son divisibles entre sí");
            }
        }
    }
}
