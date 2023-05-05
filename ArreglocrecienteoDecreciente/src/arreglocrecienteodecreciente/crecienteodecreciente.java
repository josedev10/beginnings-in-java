
package arreglocrecienteodecreciente;

import javax.swing.JOptionPane;

public class crecienteodecreciente {
    int i,n=10;
    int a[]=new int[11];
    String cad="";
    boolean creciente=false,decreciente=false;
    
    public void GuardarA(){
        for(i=1;i<=n;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número "+i+" : "));
            cad+=a[i]+" ";
        }
    }
    public void ProcesoA(){
            for(i=1;i<=n-1;i++){
                if(a[i]<a[i+1]){
                    creciente=true;
                }
                if(a[i]>a[i+1]){
                    decreciente=true;
                }
            }
    }
    public void Mostrar(){
        if(creciente==true && decreciente==false){
            JOptionPane.showMessageDialog(null,"El arreglo "+cad+" està en orden creciente");
        }
        else if(creciente==false && decreciente==true){
            JOptionPane.showMessageDialog(null,"El arreglo "+cad+" està en orden decreciente");
        }
        
        else if(creciente==true && decreciente==true){
            JOptionPane.showMessageDialog(null,"El arreglo "+cad+" està en desorden");
        }
        else if(creciente==false && decreciente==false){
            JOptionPane.showMessageDialog(null,"El arreglo "+cad+" está con todos los números iguales");
        }
            
    }
    
}
