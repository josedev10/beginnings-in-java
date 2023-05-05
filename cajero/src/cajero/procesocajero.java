
package cajero;

import javax.swing.JOptionPane;

public class procesocajero {
    float saldo=1000,monto;
    
    public void procesopedir(){
        monto=Float.parseFloat(JOptionPane.showInputDialog(" Introduce el monto: "));
       
    }
    public void ProcesoIngresar(){
        saldo+=monto;
    }
    public void ProcesoRetirar(){
        if(monto<=saldo){
            saldo-=monto;
            JOptionPane.showMessageDialog(null," Usted ha retirado "+monto+" exitosamente");
        }else{
            JOptionPane.showMessageDialog(null," lo sentimos, fondo insuficiente");
        }
    }
    
}
