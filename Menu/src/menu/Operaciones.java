
package menu;

import javax.swing.JOptionPane;

public class Operaciones {
    double op1,op2,r;
    public void capOp1(){
        op1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa operador 1: "));
    }
    public void capOp2(){
        op2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa operador 2: "));
    }
    public void calSuma(){
        r=op1+op2;
    }
    public void calResta(){
        r=op1-op2;
    }
    public void calMulti(){
        r=op1*op2;
    }
    public void calDivisi(){
        r=op1/op2;
    }
    public void Resultado(){
        JOptionPane.showMessageDialog(null," El resultado es: "+r);
    }
}
