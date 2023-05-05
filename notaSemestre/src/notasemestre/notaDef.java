package notasemestre;

import javax.swing.JOptionPane;

public class notaDef {

    int i, n, j;
    double temp;
    String temp2, cad=" ";
    String Estud[] = new String[21];
    double pp[] = new double[21];
    double sp[] = new double[21];
    double nf[] = new double[21];
    double def[] = new double[21];

    public void capN() {
        n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número de Estudiantes: "));
    }

    public void capNotas() {
        for (i = 1; i <= n; i++) {
            Estud[i] = JOptionPane.showInputDialog(" Ingresa nombre del Estudiante: " + i);
            pp[i] = Double.parseDouble(JOptionPane.showInputDialog(""
                    + " Ingresa la nota del Primer parcial: "));
            sp[i] = Double.parseDouble(JOptionPane.showInputDialog(""
                    + " Ingresa la nota del Segundo parcial: "));
            nf[i] = Double.parseDouble(JOptionPane.showInputDialog(""
                    + " Ingresa la nota del Tercer parcial: "));
        }

    }

    public void calNotas() {
        for (i = 1; i <= n; i++) {
            def[i] = (pp[i] * 0.3) + (sp[i] * 0.3) + (nf[i] * 0.4);
        }

    }

    public void Ordenar() {
        for (i = 1; i < n; i++) {
            for (j = (i + 1); j <= n; j++) {
                if (def[i] > def[j]) {
                    temp = def[i];
                    def[i] = def[j];
                    def[j] = temp;

                    temp2 = Estud[i];
                    Estud[i] = Estud[j];
                    Estud[j] = temp2;
                }
            }
        }
    }

    public void MostrarNotas() {
        for (i = 1; i <= n; i++) {
            //cad1+="\nEl estudiante: "+Estud[i]+" \nGanó la asignatura en: "+def[i]+" ";
            //cad2+="\nEl estudiante: "+Estud[i]+" \nPerdió la asignatura en: "+def[i]+" ";
            if (def[i] >= 3) {
                cad+= "\nEl estudiante: " + Estud[i] + " \nGanó la asignatura en: "
                        + "" + def[i]+"\n"+" ";
            } else {
                cad+= "\nEl estudiante: " + Estud[i] + " \nPerdió la asignatura en: "
                        + "" + def[i]+"\n"+" ";
            }
        }
        JOptionPane.showMessageDialog(null,cad);
    }
}