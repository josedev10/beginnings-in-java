
package salariosemanal;

import javax.swing.JOptionPane;

public class salario {

    float salxh, horast, salario;

    /*public void Introducir() {
        salxh = Float.parseFloat(JOptionPane.showInputDialog(""
                + " Ingresa el salario por hora: "));
        horast = Float.parseFloat(JOptionPane.showInputDialog(""
                + " Ingresa el número de horas trabajadas: "));
    }*/

    public void Proceso() {
        salario = salxh * horast;
    }

    public void Mostrar() {
        System.out.println("El salario semanal del trabajador es: " + salario);
    }
}
