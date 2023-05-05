
package sumarmatrices;

import javax.swing.JOptionPane;

/*Ejercicio 2: Crear y cargar dos matrices de tamaño
 3x3, sumarlas y mostrar su resultado.*/
public class sumamatriz {
    int dim=3,suma=0;
    int matriz1[][]=new int[dim][dim];
    int matriz2[][]=new int[dim][dim];
    int matriz3[][]=new int[dim][dim];
    String cad="",cad2="",cad3="";
    
    
    public void cargarMatrices(){
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                matriz1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite elemento ["+i+"] ["+j+"] de la matriz 1:"));
                cad+=String.format("%3d", matriz1[i][j]);
            }
            cad+="\n";
        }
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                matriz2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite elemento ["+i+"] ["+j+"] de la matriz 2:"));
                cad2+=String.format("%3d", matriz2[i][j]);
            }
            cad2+="\n";
        }
    }
    public void ProcesoSumar(){
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
                suma+=matriz3[i][j];
                cad3+=String.format("%3d",matriz3[i][j]);
            }
            cad3+="\n";
        }
    }
    public void MostrarMatrices(){
    JOptionPane.showMessageDialog(null,cad+"\n"+cad2+"\nLa suma de las dos matrices es: \n\n"+cad3+"\nLa suma total es: "+suma);
}
}
