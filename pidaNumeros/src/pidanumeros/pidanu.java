package pidanumeros;

import javax.swing.JOptionPane;

public class pidanu {

    int num, i = 1, n, mayores = 0, menores = 0, iguales = 0;

    public void capN() {
        n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa los números a pedir: "));
    }

    public void Proceso() {
        while (i <= n) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número: "));
            if (num <= 0) {
                if (num == 0) {
                    iguales += 1;
                } else {
                    menores += 1;
                }
            } else {
                mayores += 1;
            }
            i++;
        }
    }

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "Números menores:" + menores);
        JOptionPane.showMessageDialog(null, "Números iguales:" + iguales);
        JOptionPane.showMessageDialog(null, "Números mayores:" + mayores);

    }
}
