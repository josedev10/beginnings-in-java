
package ejerciciocalculadora;

import javax.swing.JOptionPane;


public class Ejerciciocalculadora {

    public static void main(String[] args) {
        /*calcu co=new calcu();
         char calOp;
        
        do{
            calOp=JOptionPane.showInputDialog("-------------------------\n"
                    + "    Menú para Calcular   \n\n"
                    + " S--->  sumar            \n"
                    + " R--->  Restar           \n"
                    + " M--->  Múltiplicar      \n"
                    + " D--->  Dividir          \n"
                    + " x--->  Terminar         \n"
                    + "-------------------------\n").charAt(0);
            switch(calOp){
                case 'S':
                case 's': 
                    co.CapNo1();
                    co.capNo2();
                    co.suma();
                    co.MostrarSol();
                    break;
                case 'R':
                case 'r':
                    co.CapNo1();
                    co.capNo2();
                    co.resta();
                    co.MostrarSol();
                    break;
                case 'M':
                case 'm':
                    co.CapNo1();
                    co.capNo2();
                    co.multiplicar();
                    co.MostrarSol();
                    break;
                case 'd':
                case 'D':
                    co.CapNo1();
                    co.capNo2();
                    co.dividir();
                    co.MostrarSol();
                    break;
                case 'x':
                    JOptionPane.showMessageDialog(null," Usted ha terminado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null," caracter Errado :( ");
                    break;
                
                       
            }
        }while(calOp!='x');*/
        
        int op1,op2,suma,resta, div,multi;
        char operacion;
        
        op1=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el primer número"));
        op2=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el segundo número: "));
        
        operacion=JOptionPane.showInputDialog(" Ingresa el caracter de la operación a realizar: ").charAt(0);
        
        switch(operacion){
            case 's':
            case 'S':
                suma=op1+op2;
                JOptionPane.showMessageDialog(null, "la operación es: "+suma);
                break;
            case 'r':
            case 'R':
                resta = op1 - op2;
                JOptionPane.showMessageDialog(null, "la operación es: " + resta);
                break;
            case 'M':
            case 'm':
                multi = op1 * op2;
                JOptionPane.showMessageDialog(null, "la operación es: " + multi);
                break;
            case 'd':
            case 'D':
                div = op1 / op2;
                JOptionPane.showMessageDialog(null, "la operación es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, " caracter Errado");
                
        }
    }
    
}
