
package fusionartablas;

import javax.swing.JOptionPane;

/*Leer dos series de 10 enteros, que estarán ordenados crecientemente.

Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados*/

public class tablas2 {
    int[] a=new int[11];
    int[] b=new int[11];
    int[] c=new int[21];
    int i,n=10,j,temp=0;
    boolean verificarCreciente=false;
    String cad="";
    
    public void PedirTablas(){
        do{
            
            for(i=0;i<n;i++){
                a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa número "+(i+1)+" de la tabla 1: "));}
            for(i=0;i<n-1;i++){
                if(a[i]<a[i+1]){
                    verificarCreciente=true;
                }else{
                    verificarCreciente=false;
                    break;
                }
            }
            if(verificarCreciente==false){
                JOptionPane.showMessageDialog(null," Los números de la tabla 1 no estan en creciente");
            }
            
            
        }while(verificarCreciente==false);
        
        if(verificarCreciente==true){
            verificarCreciente=false;
        do{
            
            for(i=0;i<n;i++){
                b[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa número "+(i+1)+" de la tabla 2: "));}
            for(i=0;i<n-1;i++){
                if(b[i]<b[i+1]){
                    verificarCreciente=true;
                }else{
                    verificarCreciente=false;
                    break;
                }
            }
            if(verificarCreciente==false){
                JOptionPane.showMessageDialog(null," Los números de la tabla 2 no estan en creciente");
            }
            
        }while(verificarCreciente==false);
        }
    }
    public void fusionarT(){
        j=0;
        for(i=0;i<n;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
    }
    public void OrdenarFusion(){
        for(i=0;i<(n*2)-1;i++){
            for(j=i+1;j<(n*2);j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
    }
    public void MostrarA(){
        for(i=0;i<n*2;i++){
            cad+=c[i]+" ";
        }
        JOptionPane.showMessageDialog(null,cad);
    }
        
}
