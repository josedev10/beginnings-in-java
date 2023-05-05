
package pkg2numerosrandom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2;
        int numeroRandom[]=new int[10];
        
        try{
            
        
        System.out.println("Digite el numero 1: ");
        num1=scanner.nextInt();
        System.out.println("Digite el numero 2: ");
        num2=scanner.nextInt();
        
        System.out.println("Los numeros son: ");
        for(int i=0;i<numeroRandom.length;i++){
            numeroRandom[i]=(int) Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numeroRandom[i]);
        }
        }catch(Exception e){
            System.out.println("Digite un número");
        }
        scanner.close();
    }
    
    
    
}
