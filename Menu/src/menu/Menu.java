
package menu;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        Operaciones mo=new Operaciones();
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("----------------------\n"
                    + "   Menú Principal   \n"
                    + " 1. Sumar           \n"
                    + " 2. Restar          \n"
                    + " 3. Multiplicar     \n"
                    + " 4. Dividir         \n"
                    + " 0. Terminar        \n"
                    + "----------------------"));
            switch(op){
                case 1:
                    mo.capOp1();
                    mo.capOp2();
                    mo.calSuma();
                    mo.Resultado();
                    break;
                case 2:
                    mo.capOp1();
                    mo.capOp2();
                    mo.calResta();
                    mo.Resultado();
                    break;
                case 3:
                    mo.capOp1();
                    mo.capOp2();
                    mo.calMulti();
                    mo.Resultado();
                    break;
                case 4:
                    mo.capOp1();
                    mo.capOp2();
                    mo.calDivisi();
                    mo.Resultado();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, " Usted ha terminado..");
                    break;
                default:
                    JOptionPane.showMessageDialog(null," Valor Errado..");
                    break;      
            }    
        }while(op!=0);
    }
    
}
