
package mayorelemento;

import javax.swing.JOptionPane;

public class mayor {
    int dim,i,may,p;
    int a[]=new int[6];
    String cad=" ";
    public void capDim(){
        dim=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la Dimensión del arreglo: "));
    }
    public void Generar(){
        for(i=1;i<=dim;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa elemento: "));
            cad=cad+a[i]+" ";
            
        }
    }
    public void procemay(){
        for(i=1;i<=dim;i++){
            if(a[i]>may){
                may=a[i];
                p=i;
            }
        }
        JOptionPane.showMessageDialog(null," El mayor es: "+may+"\nDel arreglo: "+cad+""
                + "\nEn la posición: "+"a["+p+"]");
            
    }
    
}
