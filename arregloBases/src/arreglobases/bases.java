package arreglobases;

import javax.swing.JOptionPane;

public class bases {

    int i, n;
    String cad = " ", cad2 = " ";
    int bases[] = new int[8];
    int resultados[] = new int[8];

    public void GenerarA() {
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Dimensión números de Bases: "));
        for (i = 1; i <= n; i++) {
            bases[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número entero"));
            cad2 += bases[i] + " ";
        }
    }

    public void ProcesosA() {
        for (i = 1; i <= n; i++) {
            if (bases[i] == 0) {
                resultados[i] = 1;
            } else {
                if (bases[i] % 2 == 0) {
                    resultados[i] = bases[i] * bases[i] * bases[i];
                } else {
                    resultados[i] = bases[i] * bases[i] * bases[i] * bases[i];
                }
            }
        }
    }

    public void MostrarA() {
        for (i = 1; i <= n; i++) {
            cad += resultados[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Resultados: " + cad + "\n" + "bases: " + cad2);
        //JOptionPane.showMessageDialog(null, cad2);

    }

}
