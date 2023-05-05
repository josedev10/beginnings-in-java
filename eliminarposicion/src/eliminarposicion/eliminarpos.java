
package eliminarposicion;

import javax.swing.JOptionPane;

/* Leer por teclado una tabla de 10 elementos numéricos enteros y una posición
(entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.*/
public class eliminarpos {
    int i,can=10,posc;
    int[] a=new int[11];
    boolean poscorrecta=false;
    String cad="";
    
    public void capNums(){
        for(i=1;i<=can;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número "+i+" : "));
        }}
    
        public void capPosic(){
        do{
            posc=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la posición a eliminar: "));
            if(posc<0 && posc>9){
                poscorrecta=false;
            }else{
                poscorrecta=true;
            }
            if(poscorrecta==false){
                JOptionPane.showMessageDialog(null," Intenta de nuevo, la posición debe estar entre 0 y 9");
            }
            
        }while(poscorrecta==false);
          
    }
    public void EliminarElemento(){
        can--;
        for(i=posc;i<=can;i++){
            a[i]=a[i+1];
        }
    }
    public void MostrarA(){
        for(i=1;i<=can;i++){
            cad+=a[i]+" ";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
