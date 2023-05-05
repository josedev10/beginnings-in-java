
package insertarenarregloats;

import javax.swing.JOptionPane;

public class insertarAts {
    /*
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números. Después se debe pedir un número y una posición
insertarlo, en la posición indicada, desplazando los que estén detrás.
 */
    
    int i,n=8,pos,e;
    int[] a=new int[11];
    String cad="",cad2="";
    
    public void generarA(){
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el elemento: "));
            cad2+=a[i]+" ";
        }
    }
    public void procesoInsertar(){
        JOptionPane.showMessageDialog(null,"\n\n\nInsertar\n\n\n");
        e=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el elemento a insertar: "));
        pos=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa en la posición a insertar"));
        if(pos<=n){
            for(i=(n+1);i>pos;i--){
                a[i]=a[i-1];
            }
            a[pos]=e;
            n++;
        }else{
            JOptionPane.showMessageDialog(null,"Lo siento,posición errada");
        }
    }
    public void MostrarA(){
        for(i=1;i<=n;i++){
            cad+=a[i]+" ";
        }
        JOptionPane.showMessageDialog(null,cad2+"\n"+cad);
    }
}
