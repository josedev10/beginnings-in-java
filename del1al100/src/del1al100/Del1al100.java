
package del1al100;

import javax.swing.JOptionPane;

public class Del1al100 {

    public static void main(String[] args) {
        int n;
        String cad=" ";
        
        for(n=100;n>=0;n-=7){
            cad+=n+"\n ";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
    
}
