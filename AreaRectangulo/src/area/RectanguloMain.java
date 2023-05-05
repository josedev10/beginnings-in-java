
package area;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Dame el valor de la base: ");
        int base=entrada.nextInt();
        System.out.print("\nDame el valor de la altura: ");
        int altura=entrada.nextInt();
        
        //Esta es la creacion del objeto que me sirve de una para enviar los datos de base y altura a la clase Rectangulo
        Rectangulo mensajero=new Rectangulo(base,altura);
        
        //System.out.println("\nEl area del rectangulo es: "+mensajero.CalcularArea());
        mensajero.MostrarArea();
        
    }
}
