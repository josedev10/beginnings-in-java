
package insertarelemento;

import javax.swing.JOptionPane;

public class Insertar {
    int i,n,k,e;
    int a[]=new int[7];
    String cad=" ",cad2=" ";
    public void generarA(){
        n=Integer.parseInt(JOptionPane.showInputDialog(""
                + " Ingresa la Dimensión del arreglo: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(""
                    + " Ingresa elemento: "));
            cad2+="A["+a[i]+"]"+" ";
        }
    }
    public void procesoIns(){
        e=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa elemento a introducir: "));
        k=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la posición del elemento: "));
        if(k<=n){
            for(i=(n+1);i>k;i--){
                a[i]=a[i-1];
            }
            a[k]=e;
            n++;
        }
    }
    public void mostrarA(){
        for(i=1;i<=n;i++){
            cad+="A["+a[i]+"]"+" ";
        }
        JOptionPane.showMessageDialog(null, cad2+"\n"+cad);
    }
}
