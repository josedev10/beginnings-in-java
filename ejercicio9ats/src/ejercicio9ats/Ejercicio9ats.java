package ejercicio9ats;

import java.util.Scanner;

public class Ejercicio9ats {

    public static void main(String[] args) {
        /*Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo: 
el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.*/

        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9];
        for (int i = 8; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0]=ultimo;
        
        for(int i=0;i<10;i++){
            System.out.println(arreglo[i]+"\n");
        }
        
    }

}
