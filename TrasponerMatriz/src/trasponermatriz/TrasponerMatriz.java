
package trasponermatriz;

import java.util.Scanner;
//Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
public class TrasponerMatriz {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][]=new int[3][3];
        
        System.out.println("Digite la matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Digite matriz ["+i+"] ["+j+"] :");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //trasponer la matriz: 
        
        int temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                temp = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=temp;
            }
        }
        System.out.println("\nLa matriz traspuesta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
