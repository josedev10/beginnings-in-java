package pracnum;

import javax.swing.JOptionPane;

public class cnum {

    int a[] = new int[6];
    int i;
    String cad = "";

    public void GenerarArreglo() {
        for (i = 1; i <= 5; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa los números: "));
        }
    }

    public void Mostrar() {
        for (i = 1; i <= 5; i++) {
            cad += a[i] + " ";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
