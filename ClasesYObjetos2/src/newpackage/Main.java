
package newpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Digite su nombre: ");
        String nombre=entrada.next();
        System.out.print("Digite su edad: ");
        int edad=entrada.nextInt();
        
        Persona p1=new Persona(nombre,edad);
        p1.correr();
        Persona p2=new Persona(836824);
        p1.correr(17);
        
    }
}
