
package ventasmayor2000;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VentasMayor2000 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        float ventas[]=new float[30];
        int contador=0;
        
        for(int i=0;i<5;i++){
            System.out.print("Digite la venta ("+(i+1)+"):");
            try{//se agrega el bloque try catch donde se cree puede haber una excepcion
            ventas[i]=scanner.nextFloat();
            if(ventas[i]>2000){
                contador++;
            }
            }catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número flotante.");
                scanner.next(); // Limpiar el buffer del scanner
                i--; // Reintentar el ingreso de la venta
            }
        }
        
        System.out.println("");
        if(contador==0){
            System.out.println("No hay ventas mayores a 2000");
        }else{
            System.out.println("Las ventas mayores a 2000 son: "+contador);
        }
    }  
}
