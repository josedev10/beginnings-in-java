
package cambiaespej;

import javax.swing.JOptionPane;

public class nEspej {
    int i,j,n,temp;
    String cad=" ",cad2=" ";
    int a[]=new int[7];
    public void GenerarA(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa Dimensión: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa Elemento: "));
            cad2+="a["+a[i]+"]"+" ";
        }
    }
    public void ProcCamb(){
        j=n;
        for(i=1;i<=Math.round(n/2);i++){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        for(i=1;i<=n;i++){
            cad+="a["+a[i]+"]"+" ";
        }
        JOptionPane.showMessageDialog(null,cad2+"\n"+cad);
    }
}
