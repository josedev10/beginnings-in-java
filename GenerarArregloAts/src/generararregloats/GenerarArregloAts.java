
package generararregloats;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GenerarArregloAts {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        int nElementos,i;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        
        char[] letras=new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo: ");
        for(i=0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un caracter: ");
            letras[i]=Entrada.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for(i=0;i<nElementos;i++){
            System.out.print(letras[i]+" ");
        }
        System.out.println(" ");
        
    }
    
}
