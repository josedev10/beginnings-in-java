
package insertarorden;

import javax.swing.JOptionPane;

/*Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos 
los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.*/

public class iordenA {
    int i,j,cant=5,n,sitio;
    int a[]=new int[11];
    String cad="";
    boolean creciente=false;
    
    public void pedirA(){
        do{
            for(i=1;i<=cant;i++){
                a[i]=Integer.parseInt(JOptionPane.showInputDialog(i+" Digita un número: "));
            }
            for(i=1;i<cant;i++){
                
            if(a[i]<a[i+1]){
                creciente=true;
            }else{
                creciente=false;
                break;
            }
            
            }
            if(creciente==false){
                JOptionPane.showMessageDialog(null,"Intenta de nuevo, los números no están en creciente");
            }
            
        }while(creciente==false);
    }
    public void OrdenareInsertar(){
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número N: "));
        while(a[j]<n && j<=cant){
            sitio++;
            j++;
        }
        
        for(i=cant+1;i>sitio;i--){
            a[i]=a[i-1];
        }
        a[sitio]=n;
    }
    public void MostrarA(){
        cant++;
        for(i=1;i<=cant;i++){
            cad+=a[i]+" ";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
