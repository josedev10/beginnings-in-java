
package pedirfno30;

import javax.swing.JOptionPane;

public class Pedirfno30 {

    public static void main(String[] args) {
        int dd,mm,aa;
        
        dd=Integer.parseInt(JOptionPane.showInputDialog(" Digite el día: "));
        mm=Integer.parseInt(JOptionPane.showInputDialog(" Digite el mes: "));
        aa=Integer.parseInt(JOptionPane.showInputDialog(" Digite el año: "));
        
        if(aa!=0){
            if(mm<13 && mm>0){
                if((dd<32 && dd>0) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)){
                    JOptionPane.showMessageDialog(null, " la fecha: " + aa + "-" + mm + "-" + dd + " es correcta");
                }else{
                    if((dd<31 && dd>0) && (mm==4 || mm==6 || mm==9 || mm==11)){
                        JOptionPane.showMessageDialog(null, " la fecha: " + aa + "-" + mm + "-" + dd + " es correcta");
                    }else{
                        if(dd<29 && dd>0){
                            JOptionPane.showMessageDialog(null, " la fecha: " + aa + "-" + mm + "-" + dd + " es correcta");
                        }else{
                          JOptionPane.showMessageDialog(null," fecha incorrecta, día incorrecto");  
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null," fecha incorrecta, mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null," fecha incorrecta, año incorrecto");
        }
    }
    
}
