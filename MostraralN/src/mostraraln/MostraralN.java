
package mostraraln;

import javax.swing.JOptionPane;

public class MostraralN {

    public static void main(String[] args) {
        int n,i;
        String cad=" ";
        
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número N: "));
        
        for(i=1;i<n;i++){
            cad+=i+" ";
        }
        for(i=1;i>n;i--){
            cad+=i+" ";
        }
        if(n==1){
            JOptionPane.showMessageDialog(null, "Los números del 1 al N es: 1 ");
        }
        
        JOptionPane.showMessageDialog(null, "Los números del 1 al N son: "+cad);
        
    }
    
}
