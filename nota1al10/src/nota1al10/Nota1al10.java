
package nota1al10;

import javax.swing.JOptionPane;

public class Nota1al10 {

    
    public static void main(String[] args) {
        int nota;
        
        //nota=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la nota: "));
        nota=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la nota: "));
        /*if(nota<=10 && nota>0){
            if(nota<=8){
                if(nota<=6){
                    if(nota<=4){
                        if(nota<=2){
                            JOptionPane.showMessageDialog(null," La nota "+nota+" es insuficiente");
                        }else{
                            JOptionPane.showMessageDialog(null," La nota "+nota+" es suficiente");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null," La nota "+nota+" es bien");
                    }
                }else{
                    JOptionPane.showMessageDialog(null," La nota "+nota+" es notable");
                }
            }else{
                JOptionPane.showMessageDialog(null," La nota "+nota+" es sobresaliente");
            }
        }else{
            JOptionPane.showMessageDialog(null," nota erronea");
        }*/
    switch(nota){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:JOptionPane.showMessageDialog(null," La calificaciòn es insuficiente");
        break;
        case 6:JOptionPane.showMessageDialog(null," La calificaciòn es suficiente");
        break;
        case 7:JOptionPane.showMessageDialog(null," La calificaciòn es buena");
        break;
        case 8:JOptionPane.showMessageDialog(null," La calificaciòn es notable");
        break;
        case 9:
        case 10:JOptionPane.showMessageDialog(null," La calificaciòn es sobresaliente");
            break;
        default:JOptionPane.showMessageDialog(null," La calificaciòn es erronea");
            
    }
    
    }
    
}
