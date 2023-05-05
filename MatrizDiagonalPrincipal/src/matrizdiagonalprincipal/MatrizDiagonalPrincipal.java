
package matrizdiagonalprincipal;

public class MatrizDiagonalPrincipal {
/*Hacer una matriz 7x7 y hacer que la diagonal principal sea 1 y el resto 0*/
    public static void main(String[] args) {
        int length=7;
        int matriz[][]=new int[length][length];
        
        /*for(int i=0;i<length;i++){
            matriz[i][i]=1;
        }*/
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        System.out.println("Matriz 7x7: \n");
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
