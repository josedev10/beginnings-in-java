package porconsola;

import java.util.Scanner;

public class PorConsola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num;
        //String cad;
        char letra;
        //System.out.print("Digite un número: ");
        //System.out.print("Digite una cadena: ");
        System.out.print("Digite la letra: ");
        letra=input.next().charAt(0);
        //num = input.nextFloat();
        //cad = input.nextLine();
        //System.out.println("El número es: " + num);
        //System.out.println("La cadNena es: " + cad);
        System.out.println("la letra es: "+letra);

    }
 
}
