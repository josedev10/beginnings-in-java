
package ecuacion2grado;

import java.util.Scanner;

public class Ecuacion2Grado {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calcular ecuacion de 2do grado: ");
        System.out.println("Digite a:");
        double a=scanner.nextDouble();
        System.out.println("Digite b: ");
        double b=scanner.nextDouble();
        System.out.println("Digite c: ");
        double c=scanner.nextDouble();
        
        double discriminante=Math.pow(b, 2)-(4*a*c);

        if(discriminante>0){
            
            double x1=(-b+Math.sqrt(discriminante))/(2*a);
            double x2=(-b-Math.sqrt(discriminante))/(2*a);
            
            System.out.println("El valor de x1 es: "+x1+"\n"
                    + "El valor de x2 es: "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}
