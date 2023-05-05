
package operadoresporconsola;

import java.util.Scanner;

public class OperadoresporConsola {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        float num1,num2,suma,resta,multi,divi,mod;
        
        System.out.println("Digite dos nùmero: ");
        num1= Entrada.nextFloat();
        num2= Entrada.nextFloat();
        
        suma=num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        divi=num1/num2;
        mod=num1%num2;
        
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicaciòn es: "+multi);
        System.out.println("la Division es: "+divi);
        System.out.println("El residuo es: "+mod);
    }
    
}
