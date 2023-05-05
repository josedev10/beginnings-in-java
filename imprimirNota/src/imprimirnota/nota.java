package imprimirnota;

import javax.swing.JOptionPane;

public class nota {

    float nota1, nota2, nota3, suma;

    public void Pedirnota() {
        nota1=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la primera nota: "));
        nota2=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la segunda nota: "));
        nota3=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la tercera nota: "));
    }
    public void SumaNota(){
        suma=nota1+nota2+nota3;
    }
    public void MostrarNota(){
        JOptionPane.showMessageDialog(null,"La suma de las notas es: "+suma);
    }
}
