
package matrizdiagonalsecundaria;

public class MatrizDiagonalSecundaria {
//Hacer una matriz 7x7 y hacer que la diagonal secundaria sea 1 y el resto 0 en java
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                /*En este código, se crea una matriz 7x7 de enteros y se utiliza 
                un bucle anidado para recorrer la matriz. Si la suma de los índices de fila 
                y columna es igual a 6 (7-1), lo que significa que se encuentra en la 
                diagonal secundaria, se establece el valor en 1. De lo contrario, 
                el valor se establece en 0. Finalmente, se imprime la matriz por consola.*/
                if (i + j == matriz.length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
