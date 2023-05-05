
package ordenararreglo;

import javax.swing.JOptionPane;

public class ordenar {
    int i,n,j,temp;
    int a[]=new int[8];
    String cad=" ",cador=" ";
    public void Generar(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la Dimensión del Arreglo: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa elemento: "));
            cad+=a[i]+" ";
        }
    }
    public void Ordenar(){
        for(i=1;i<n;i++){
            for(j=(i+1);j<=n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public void Mostrar(){
        for(i=1;i<=n;i++){
            cador+=a[i]+" ";
        }
        JOptionPane.showMessageDialog(null,"Arreglo original: "+cad+""
                + "\nArreglo Ordenado: "+cador);
    }
}
