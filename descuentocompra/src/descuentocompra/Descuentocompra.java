
package descuentocompra;

import javax.swing.JOptionPane;


public class Descuentocompra {

    public static void main(String[] args) {
        float compra, compraApli;
        String cliente;
        
        cliente=JOptionPane.showInputDialog(" Ingresa el nombre del cliente: ");
        compra=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el valor de la compra: "));
        
        
        if(compra>300){
            compraApli=compra-(compra*0.20f);
            JOptionPane.showMessageDialog(null," La cantidad a pagar por la compra de "
                    + ""+cliente+" es: "+(int)compraApli);
        }else{
            JOptionPane.showMessageDialog(null," La cantidad a pagar por la compra de "
                    + ""+cliente+" es: "+(int)compra);
        }
    }
    
}
