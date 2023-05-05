
package eliminaelemento;

import javax.swing.JOptionPane;

public class Elimina {
    int i,n,e,sw,p;
    int a[]=new int[7];
    String cad=" ",cad2=" ";
    public void GenerarA(){
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la dimensión: "));
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un elemento: "));
            cad2+="A["+a[i]+"]"+" ";
        }
    }
    public void procElimina(){
        e=Integer.parseInt(JOptionPane.showInputDialog(""
                + " Ingresa el elemento a buscar: "));
        i=1;
        sw=0;
        while(i<=n && sw==0){
            if(e==a[i]){
                sw=1;
                p=i;
            }
            i++;
        }
        if(sw==0){
            JOptionPane.showMessageDialog(null,"El elemento no se encontró ");
        }else{
            for(i=p;i<n;i++){
                a[i]=a[i+1];
            }
            n--;
            for(i=1;i<=n;i++){
                cad+="A["+a[i]+"]";
            }
            JOptionPane.showMessageDialog(null, cad2+"\n"+cad);
        }
    }
    
}
