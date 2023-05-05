
package sumaelementos;

import javax.swing.JOptionPane;

public class sumatoria {
    int i,dim,suma=0;
    int edad[]=new int[7];
    public void Dimension(){
        dim=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la dimensión del arreglo: "));
    }
    public void Generar(){
        for(i=1;i<=dim;i++){
            edad[i]=Integer.parseInt(JOptionPane.showInputDialog(""
                    + " Ingresa edad: "+i));
        }
    }
    public void Sumatoria(){
        for(i=1;i<=dim;i++){
            suma=suma+edad[i];
        }
        JOptionPane.showMessageDialog(null, " la suma es: "+suma);
    }
    
    
}
