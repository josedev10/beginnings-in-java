
package buscartabla;

import javax.swing.JOptionPane;

/* Leer 10 enteros ordenados creciente mente. Leer N y buscarlo en la tabla. 
Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.*/
public class buscar {
    int[] a=new int[10];
    int n,i,j,pos=-1;
    boolean creciente=false;
    String cad="",message="";
    
    public void pedirnums(){
        do{
            for(i=0;i<10;i++){
                a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa número "+(i+1)+" : "));
            }
            for(i=0;i<9;i++){
            if(a[i]<a[i+1]){
                creciente=true;
            }else{
                creciente=false;
                break;
            }}
            if(creciente==false){
                JOptionPane.showMessageDialog(null,"Los números no están en orden creciente");
            }
            
        }while(creciente==false);
    }
    public void pedirn(){
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa N a buscar: "));
    }
    public void buscarn(){
        i=0;
        while(a[i]<10 && pos==-1){
            if(a[i]==n){
                pos=i;
            }
            i++;
        }
        if(pos==-1){
            message="N no se encuentra";
        }
        if(pos!=-1){
            message="se encuentra en la posición: a["+pos+"]";
        }
    }
    public void MostrarA(){
        for(i=0;i<10;i++){
            cad+=a[i]+" ";
        }
        JOptionPane.showMessageDialog(null,"Arreglo: \n"+cad+"\nN: "+n+"\n"+message);
    }
}