package arregloorden2;

import java.util.Scanner;

public class Arregloorden2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamArreglo;
        System.out.println("Ingrese tamaño arreglo: ");
        tamArreglo = entrada.nextInt();
        int numeros[] = new int[tamArreglo];
        int j = tamArreglo;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese numeros");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Muestro numeros inversos");
        for (int i = 0; i < (numeros.length / 2); i++) {
            j--;
            if (tamArreglo % 2 == 0) {
                System.out.print(" " + numeros[i]);
                System.out.print(" " + numeros[j]);
            } else {
                System.out.print(" " + numeros[i]);
                System.out.print(" " + numeros[j]);
            }
        }
        if (tamArreglo % 2 != 0) {
            System.out.print(" " + numeros[(numeros.length / 2)] + "\n");
        }
    }

}

    

