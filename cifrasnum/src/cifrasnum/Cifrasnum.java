
package cifrasnum;

import javax.swing.JOptionPane;

public class Cifrasnum {

    public static void main(String[] args) {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número: "));
        
        if(num>=100000 || num<=-100000){
            JOptionPane.showMessageDialog(null, ""
                    + "no te puedo decir :( \nTiene que ser un número del 0 al 99.999" );
        }else{
            if(num>=10000 || num<=-10000){
                JOptionPane.showMessageDialog(null," El número "+num+" tiene 5 cifras");
            }else{
                if(num>=1000 || num<=-1000){
                    JOptionPane.showMessageDialog(null," El número "+num+" tiene 4 cifras");
                }else{
                    if(num>=100 || num<=-100){
                        JOptionPane.showMessageDialog(null," El número "+num+" tiene 3 cifras");
                    }else{
                        if(num>=10 || num<=-10){
                            JOptionPane.showMessageDialog(null," El número "+num+" tiene 2 cifras");
                        }else{
                            JOptionPane.showMessageDialog(null," El número "+num+" tiene 1 cifras");
                        }
                    }
                }
            }
        }
    }
    
}
