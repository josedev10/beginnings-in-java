package arreglon10;

import javax.swing.JOptionPane;

public class arreglo {

    int i, n;
    int a[] = new int[11];
    String cad = "";

    public void GenerarA() {
        n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la dimensión del arreglo: "));
        for (i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un valor: "));
            cad += a[i] + " ";
        }
    }

    public void MostrarA() {
        System.out.println("los valores del arreglo: " + cad);

    }
}
