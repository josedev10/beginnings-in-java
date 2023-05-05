/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neg;

import javax.swing.JOptionPane;

/**
 *
 * @author enriq
 */
public class hallar {
    int i=1, num;
    public void capNum(){
        while (i<=15){
        num=Integer.parseInt(JOptionPane.showInputDialog(" ingrese un número: "));
        if(num<0){
            JOptionPane.showMessageDialog(null, " El número es negativo "+num);
        }else{
            JOptionPane.showMessageDialog(null, "el numero es positivo "+num );
        }
        i++;
        
    }
    
}
}