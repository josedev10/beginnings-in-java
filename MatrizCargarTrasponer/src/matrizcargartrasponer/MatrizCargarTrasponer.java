
package matrizcargartrasponer;

//import javax.swing.JOptionPane;

public class MatrizCargarTrasponer {
/*utilizar dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda*/
    public static void main(String[] args) {
        int matriz[][]=new int[5][9];
        int matriz2[][]=new int[9][5];
        String cad="";
        
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                //matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite Matriz ["+i+"] ["+j+"] : "));
                matriz[i][j]=(int)(Math.random()*10);
                cad+=matriz[i][j]+"\t";
            }
            cad+="\n";
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                matriz2[j][i]=matriz[i][j];
            }
        }
        System.out.println("matriz original: \n\n"+cad);
        System.out.println("matriz traspuesta: \n");
        for(int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz2[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
