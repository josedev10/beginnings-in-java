
package desplazarnpos;

import javax.swing.JOptionPane;

public class nposiciones {
    /*Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números 

eneros y desplace N posiciones en el arreglo (N es digitado por el usuario)*/

    int i,n=10,des,j;
    int a[]=new int[11];
    int b[]=new int[11];
    String cad="";
    
    public void GuardarA(){
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(i+" Ingresa el número: "));
        }
    }
    public void desplazarA(){
        des=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa las posiciones a desplazar: "));
        j=1;
        for(i=(n-des)+1;i<=n;i++){
            b[j]=a[i];
            j++;
        }
        j=des+1;
        for(i=1;i<=n-des;i++){
            b[j]=a[i];
            j++;
        }
    }
    public void mostrarA(){
        for(i=1;i<=n;i++){
            cad+=i+". "+b[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,cad);
    }
}
