package guardarymostrararreglo;

import javax.swing.JOptionPane;

public class arregloGyM {

    int i;
    int[] num = new int[7];
    String cad = "";

    public void GuardarA() {
        for (i = 1; i <= 5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número " + i + " : "));
        }
    }

    public void MostrarA() {
        for (i = 5; i >=1; i--) {
            cad += num[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Los números ingresados son: " + cad);
    }

}
