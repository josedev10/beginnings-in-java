
package arreglomedia;

import javax.swing.JOptionPane;

public class media {
    int i,neg=0,pos=0,cero=0;
    float[] a=new float[7];
    float sumneg,sumpos,medianeg,mediapos;
    
    public void almacenarA(){
        for(i=1;i<=5;i++){
            a[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el número: "));
        }
    }
    public void ProcesoMedia(){
        for(i=1;i<=5;i++){
            if(a[i]<=0){
                if(a[i]==0){
                    cero++;
                }else{
                    neg++;
                    sumneg+=a[i];
                }
            }else{
                pos++;
                sumpos+=a[i];
            }
        }
        medianeg=sumneg/neg;
        mediapos=sumpos/pos;
        
    }
    public void MostrarA(){
        JOptionPane.showMessageDialog(null,"la media de los números es: \n"
                + "números positivos es: "+mediapos+""
                        + "\1nnúmeros negativos es: "+medianeg+""
                                + "\nY el número de ceros es: "+cero);
    }
}
