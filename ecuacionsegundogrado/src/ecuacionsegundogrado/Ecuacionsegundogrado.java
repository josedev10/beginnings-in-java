package ecuacionsegundogrado;

import java.util.Scanner;

public class Ecuacionsegundogrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, x1, potencia, raiz, x2;

        System.out.println(" Ingresa la a: ");
        a = entrada.nextDouble();
        System.out.println(" Ingresa la b: ");
        b = entrada.nextDouble();
        System.out.println(" Ingresa la c: ");
        c = entrada.nextDouble();

        potencia = Math.pow(b, 2);
        raiz = Math.sqrt(potencia - (4 * a * c));

        x1 = (double) (-b + raiz) / (2 * a);
        x2 = (double) (-b - raiz) / (2 * a);
        System.out.println(" El valor de x es: " + "\n" + x1 + "\n" + x2);
    }

}
