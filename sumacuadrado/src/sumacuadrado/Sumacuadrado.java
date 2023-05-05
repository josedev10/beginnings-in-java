
package sumacuadrado;

import java.util.Scanner;

public class Sumacuadrado {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a,b,suma;
        System.out.println(" Ingresa a: ");
        a=entrada.nextDouble();
        System.out.println(" Ingresa b: ");
        b=entrada.nextDouble();
        
        suma=Math.pow(a,2)+Math.pow(b,2)+(2*a*b);
        
        System.out.println(" El cuadrado de una suma: "+suma);
        
    }
    
}
