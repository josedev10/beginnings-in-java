
package notaestudiante;

import java.util.Scanner;

public class NotaEstudiante {

    public static void main(String[] args) {
        /*estudiante ce=new estudiante();
        ce.capNotas();
        ce.Calcular();
        ce.Mostrar();*/
        Scanner entrada=new Scanner(System.in);
        
        String nom;
        float parti,par1,par2,par3,notaf;
        
        System.out.println(" Ingresa el nombre del Estudiante: ");
        nom=entrada.next();
        System.out.println(" Ingresa la nota de participación: ");
        parti=entrada.nextFloat();
        System.out.println(" Ingresa la nota del primer parcial: ");
        par1=entrada.nextFloat();
        System.out.println(" Ingresa la nota del segundo parcial: ");
        par2= entrada.nextFloat();
        System.out.println(" Ingresa la nota del último examen: ");
        par3=entrada.nextFloat();
        
        parti*=0.10;
        par1*=0.25;
        par2*=0.25;
        par3*=0.40;
        
        notaf=parti+par1+par2+par3;
        
        System.out.println("El Estudiante: "+nom+" ,tiene una nota final de: "+notaf);
    }
    
}
