
package numeroprimo;

import javax.swing.JOptionPane;

public class primo {
    int i=2,sw=0,num,d;
    public void capNum(){
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un número entero: "));
    }
    public void Proceso(){
        while(i<num && sw==0){
            if(num%i==0){
                sw=1;
                d=i;     
            }
            i++;
        }
    }
    public void Mostrar(){
        if(sw==0){
           JOptionPane.showMessageDialog(null," El número "+num+" es primo ");
        }else{
            JOptionPane.showMessageDialog(null," El número: "+num+", no es primo\n"
                    + ""+" el "
                    +d+ " lo dividió");
        }
    }
    
}
