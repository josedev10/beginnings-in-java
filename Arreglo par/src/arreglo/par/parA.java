/*
 */
package arreglo.par;

import javax.swing.JOptionPane;

public class parA {
    int i,n;
    String cad=" ";
    int sum=0;
    int a[]=new int[8];
    public void GeneraA(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la dimensión del arreglo: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa los números: "));
            cad+=a[i]+" ";
        }
    }
    public void Procesos(){
        for(i=1;i<=n;i++){
            if(a[i]%2==0){
                sum+=a[i];
            }
        }
        JOptionPane.showMessageDialog(null, ""+""
                + "El arreglo: "+cad+"\n"
                + "La suma de los números pares del arreglo es: "+sum);
    }
}
