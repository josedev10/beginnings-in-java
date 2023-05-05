
package desplazarposiciona;

import javax.swing.JOptionPane;

/*Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo: 
el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.*/
public class posicionA {
    int i,n=5,j;
    int a[]=new int[11]; 
    int b[]=new int[11]; 
    String cad="";
    
    public void GuardarA(){
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número "+i+" : "));
            b[i]=a[i];
        }
        
    }
    public void ProcesoPosición(){
        j=2;
        for(i=1;i<n;i++){
           b[j]=a[i];
           j++;
            
        }
        b[1]=a[n];
    }
    public void MostrarA(){
        for(i=1;i<=n;i++){
            cad+=i+". "+b[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,cad);
    }
}
//piensa un poco mejor bruto, lo pudiste hacer en decreciente, PIENSA!!!!!!!
