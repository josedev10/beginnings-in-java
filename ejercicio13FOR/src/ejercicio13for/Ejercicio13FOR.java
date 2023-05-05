
package ejercicio13for;

import javax.swing.JOptionPane;

public class Ejercicio13FOR {

    public static void main(String[] args) {
        int i,num,neg=0,cero=0,pos=0,sumaneg=0,sumapos=0;
        float mediapos,medianeg;
               
        for(i=1;i<=5;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un número: "));
            if(num<=0){
                if(num<0){
                    neg++;
                    sumaneg+=num;
                }else{
                    cero++;
                }
            }else{
                pos++;
                sumapos+=num;
            }
        }
        mediapos=sumapos/pos;
        medianeg=sumaneg/neg;
        
        JOptionPane.showMessageDialog(null,""
                + "La media de números positivos es: "+mediapos+""
                        + " , negativos es: "+medianeg+" y la cantidad de cero es: "+cero);
                
    }
    
}
