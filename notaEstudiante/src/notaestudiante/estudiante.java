
package notaestudiante;

import javax.swing.JOptionPane;

public class estudiante {
    String Estud;
    float part,parc1,parc2,fin, califin;
    public void capNotas(){
        Estud=JOptionPane.showInputDialog(" Ingresa el nombre del estudiante: ");
        part=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la nota de participación: "));
        parc1=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la nota del primer parcial: "));
        parc2=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la nota del segundo parcial: "));
        fin=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la nota del último parcial: "));
    }
    public void Calcular(){
        califin=((part*0.10f)+(parc1*0.25f)+(parc2*0.25f)+(fin*0.40f));
    }
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, " El estudiante: "+Estud+""
                + " tiene una calificacion final de: "+califin);
    }
}
