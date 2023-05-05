package valormayor;

import javax.swing.JOptionPane;

public class mayor {

    int num1, num2;

    public void CapNums() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));
    }

    public void ProcesoMostrar() {
        if (num1 <= num2) {
            if (num1 == num2) {
                JOptionPane.showMessageDialog(null, "los números son iguales");
            } else {
                JOptionPane.showMessageDialog(null, "el número: " + num2 + " Es Mayor a: " + num1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "el número: " + num1 + " Es Mayor a: " + num2);
        }
    }
}
