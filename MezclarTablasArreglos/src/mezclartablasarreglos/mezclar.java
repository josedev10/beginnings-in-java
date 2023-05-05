
package mezclartablasarreglos;

import javax.swing.JOptionPane;

public class mezclar {
    int i,n=5,j;
    int tabla1[]=new int[n];
    int tabla2[]=new int[n];
    int tabla3[]=new int[n*2];
    String cad="";
    
    public void GuardarA(){
        for(i=0;i<n;i++){
          tabla1[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa los 10 números de la primera tabla:  "+(i+1)));   
        }
        for(i=0;i<n;i++){
                 tabla2[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa los 10 números de la segunda tabla:  "+(i+1)));
             }
    }
    public void TercerTabla(){
        j=0;
        for(i=0;i<n;i++){
          tabla3[j]=tabla1[i];
          j++;
          tabla3[j]=tabla2[i];
          j++;
        }
    }
    public void MostrarTerceraTabla(){
        for(i=0;i<(n*2);i++){
            cad+=tabla3[i]+" ";
        }
        JOptionPane.showMessageDialog(null,cad);
    }
}
