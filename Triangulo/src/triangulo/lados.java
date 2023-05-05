/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

import javax.swing.JOptionPane;


public class lados {
    float ldo1,ldo2,ldo3;
    public void capLado1(){
        ldo1=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el primer lado: "));
    }
    public void capLado2(){
        ldo2=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el segundo lado: "));
    }
    public void capLado3(){
        ldo3=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el tercer lado: "));
    }
    public void comparar(){
        if (ldo1==ldo2 || ldo1==ldo3 || ldo2==ldo3){
            JOptionPane.showMessageDialog(null," El triangulo es Isósceles ");
    }else{
            if (ldo1==ldo2 && ldo1==ldo3){
             JOptionPane.showMessageDialog(null," El triangulo es Equilátero ");   
            }else{
                JOptionPane.showMessageDialog(null," El triangulo es Escaleno ");   
            }
        }
        
    }
}
