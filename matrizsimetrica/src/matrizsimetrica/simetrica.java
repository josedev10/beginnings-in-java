
package matrizsimetrica;

import javax.swing.JOptionPane;

/*Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.*/
public class simetrica {
    int matriz[][],numfil,numcol;
    boolean simetrica=true;
    String cad="",msg="";
    
        public void dimensionMatriz(){
        numfil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la dimensión de las filas de la primera matriz: "));
        numcol=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la dimensión de las columnas de la primera matriz: "));
        
        matriz=new int[numfil][numcol];
        }
        
        public void llenarMatriz(){
            for(int i=0;i<numfil;i++){
                for(int j=0;j<numcol;j++){
                    matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite Matriz["+i+"] ["+j+"] :"));
                    cad+=String.format("%3d",matriz[i][j]);
                }
                cad+="\n";
            }
        }
        public void evaluar(){
            if(numfil==numcol){
                int i=0;
                int j=0;
                while(i<numfil&&simetrica==true){
                    while(j<numcol&&simetrica==true){
                        if(matriz[i][j]!=matriz[j][i]){
                            simetrica=false;
                        }
                        j++;
                    }
                    i++;
                }
            }else{
                simetrica=false;
            }
        }
        public void MostrarMatriz(){
            if(simetrica==true){
                msg="Ambas matrices son simetricas";
            }else{
                msg="no son simetricas";
            }
            JOptionPane.showMessageDialog(null,cad+"\n"+msg);
        }
        
}
