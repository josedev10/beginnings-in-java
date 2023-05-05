package ordenamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamientoinsercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nelementos;
        int pos,temp;

        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de elementos del arreglo: "));

        arreglo = new int[nelementos];

        System.out.print("Digite el arreglo: \n");
        for (int i = 0; i < nelementos; i++) {
            System.out.print((i + 1) + ". Digite el número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i=0;i<nelementos;i++){
            pos=i;
            temp=arreglo[i];
            
            while((pos>0)&&(arreglo[pos-1]>temp)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=temp;
        }
        System.out.print("\nOrden ascendente: ");
        for(int i=0;i<nelementos;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
        System.out.print("\nOrden Descendente: ");
        for(int i=nelementos-1;i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }

}
