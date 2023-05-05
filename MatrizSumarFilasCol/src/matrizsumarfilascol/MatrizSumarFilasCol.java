
package matrizsumarfilascol;

import java.util.Scanner;

public class MatrizSumarFilasCol {
/*Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.*/

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][],nfila,ncolumna,sumafila,sumacol;
        
        System.out.print("Cuantas filas de la matriz: ");
        nfila=entrada.nextInt();
        System.out.print("Cuantas columnas de la matriz: ");
        ncolumna=entrada.nextInt();
        
        matriz=new int[nfila][ncolumna];
        //int fila[]=new int[nfila],col[]=new int[ncolumna];
        
        for(int i=0;i<nfila;i++){
            for(int j=0;j<ncolumna;j++){
                System.out.print("Digite matriz ["+i+"] ["+j+"] : ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz: ");
        for(int i=0;i<nfila;i++){
            for(int j=0;j<ncolumna;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(int i=0;i<nfila;i++){
            sumafila=0;
            for(int j=0;j<ncolumna;j++){
                sumafila+=matriz[i][j];
            }
            //fila[i]=sumafila;
            System.out.print("\nla suma de la fila "+i+" es: "+sumafila);
        }
        for(int j=0;j<ncolumna;j++){
            sumacol=0;
            for(int i=0;i<nfila;i++){
                sumacol+=matriz[i][j];
            }
            System.out.print("\nLa suma de la columna "+j+" es: "+sumacol);
            //col[j]=sumacol;
        }
        System.out.println("");
        /*System.out.println("\nLa suma es: ");
        for(int i=0;i<nfila;i++){
            System.out.println("fila "+i+" : "+fila[i]);
        }
        for(int i=0;i<ncolumna;i++){
            System.out.println("columna "+i+" : "+col[i]);
        }*/
    }
    
}
