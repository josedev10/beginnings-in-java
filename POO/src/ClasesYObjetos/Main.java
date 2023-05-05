package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));

        Operacion op = new Operacion();

        System.out.println("La suma es: "+op.Sumar(n1, n2));
        int resta = op.Restar(n1, n2);
        int multi = op.Multiplicar(n1, n2);
        int div = op.Dividir(n1, n2);
        op.MostrarResultado(resta, multi,div);
    }

}
