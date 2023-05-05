
package generararreglo;

import javax.swing.JOptionPane;

public class arreglo1 {
    int i,dim;
    int a[]=new int[5];
    String arreglo="";
    public void Dimension(){
        dim=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la Dimensión del Arreglo: "));
    }
    public void GenerarArreglo(){
        for(i=1;i<=dim;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Introduce el elemento: "));
        }
    }
    public void Mostrar(){
        for(i=1;i<=dim;i++){
            arreglo=arreglo+"a["+i+"]= "+a[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,arreglo);
    }
    
}
