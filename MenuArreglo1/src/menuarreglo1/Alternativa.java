
package menuarreglo1;

import javax.swing.JOptionPane;

public class Alternativa {
    int i,n;
    int a[]=new int[7];
    String cad = " ";
    public void GenerA(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa Dimensión: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa Elemento: "));
        }
    }
    public void MostrarA(){
        for(i=1;i<=n;i++){
            cad+="A["+a[i]+"]"+" ";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
    public void SumarA(){
        int sum=0;
        for(i=1;i<=n;i++){
            sum+=a[i];
        }
        JOptionPane.showMessageDialog(null," La suma es: "+sum);
    }
}
