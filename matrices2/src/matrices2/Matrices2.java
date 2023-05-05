
package matrices2;


public class Matrices2 {

    public static void main(String[] args) {
        int i, j;
        int[][] datos = {{10, 7, 4, 1,},
        {11, 8, 5, 2,},
        {12, 9, 6, 3,}};

        for (j = datos[0].length-1; j >=0 ; j--) {
            for (i = 0; i <datos.length; i++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
//System.out.print("\n");

