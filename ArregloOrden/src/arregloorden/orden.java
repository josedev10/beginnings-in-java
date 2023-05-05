
package arregloorden;

import javax.swing.JOptionPane;

public class orden {
    int i,j,n=6;
    int[] a=new int[n];
    String cad="";
    
    public void GuardarA(){
        for(i=0;i<n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número "+(i+1)+" : "));
        }
        //aqui se esta guardadndo los números
    }
    public void OrdenarA(){
        j=n;
        //la j presentara la misma cantidad de números ingresados, y se crea para poder retroceder la variable
        //sera la mitad de n (n/2) por que se busca coger de ambas partes de a[i] y a[j]
        for(i=0;i<(n/2);i++){
            j--;
            cad+=" "+a[i]+" "+a[j];  
            //
        }
        if(n%2!=0){
                cad+=" "+a[n/2];
                //se crea este if para la cantidad de números ingresados impar
            }
    }
    public void MostrarA(){
        JOptionPane.showMessageDialog(null,cad);
    }
}
