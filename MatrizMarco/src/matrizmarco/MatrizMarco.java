
package matrizmarco;

public class MatrizMarco {
/*Ejercicio 7: Crear una matriz “marco” de tamaño 5x5: todos sus elementos deben 
    ser 0 salvo los de los bordes que deben ser 1. Mostrarla*/
    public static void main(String[] args) {
        int matriz[][]=new int[9][8];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==0 || i==matriz.length-1){
                    matriz[i][j]=1;
                }else if(j==0 || j==matriz[i].length-1){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        System.out.println("La matriz en forma de marco: \n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
