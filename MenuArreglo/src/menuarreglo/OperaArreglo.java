
package menuarreglo;

import javax.swing.JOptionPane;

public class OperaArreglo {
    int i,n,may=0,sum=0;
    int a[]=new int[7];
    //String cad=" ";
    public void GenerarArreglo(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la Dimensión del Arreglo: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa elemento: "+i));
        }
    }
    public void MostrarArreglo(){
        String cad="";
        for(i=1;i<=n;i++){
            cad+=a[i]+", ";
        }
        JOptionPane.showMessageDialog(null," Arreglo A: "+"["+cad+"]");
    }
    public void Mayor(){
        for(i=1;i<=n;i++){
            if(a[i]>may){
                may=a[i];
            }
        }
        JOptionPane.showMessageDialog(null," El mayor es: "+may);
    }
    public void Sumar(){
        for(i=1;i<=n;i++){
            sum+=+a[i];//sum=sum+a[i];
        }
        JOptionPane.showMessageDialog(null," La suma es: "+sum);
    }
}
