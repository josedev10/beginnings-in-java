
package arreglospareseimpares;

import javax.swing.JOptionPane;

/*Ejercicio 13: Leer 10 enteros. Guardar en otra tabla los elementos pares 
de la primera, y a continuación los elementos
impares.*/
public class parimpar {
    int[] a=new int[11];
    int[] par=new int[11];
    int[] impar=new int[11];
    int i,n=10,j,cont1=0,cont2=0;
    String cad1="",cad2="",cad3="";
    
    public void GuardarElementos(){
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa Elemento: "));
            cad1+="a["+a[i]+"] ";
        }
    }
    public void GuardarporCondicion(){
        j=1;
        for(i=1;i<=n;i++){
            if(a[i]%2==0){
                par[j]=a[i];
                j++;
                cont1++;
            }
        }
        j=1;
        for(i=1;i<=n;i++){
            if(a[i]%2!=0){
                impar[j]=a[i];
                j++;
                cont2++;
            }
        }
    }
    public void MostrarArrays(){
        for(i=1;i<=cont1;i++){
            cad2+="a["+par[i]+"] ";
        }
        for(i=1;i<=cont2;i++){
            cad3+="a["+impar[i]+"] ";
        }
        JOptionPane.showMessageDialog(null,"Arreglo: \n"+cad1+""
                + "\n"+"Arreglo par: \n"+cad2+"\n"+"Arreglo impar: \n"+cad3);
    }
}
