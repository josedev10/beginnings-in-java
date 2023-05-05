
package ejerciciocalculadora;

import javax.swing.JOptionPane;

public class calcu {
    int no1,no2,sol;
    
    public void CapNo1(){
        no1=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el primer número"));
    }
    public void capNo2(){
        no2=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el segundo número: "));
    }
    public void suma(){
        sol=no1+no2;
    }
    public void resta(){
        sol=no1-no2;
    }
    public void multiplicar(){
        sol=no1*no2;
    }
    public void dividir(){
        sol=no1/no2;
    }
    public void MostrarSol(){
        JOptionPane.showMessageDialog(null, " La solución es: "+sol);
    }
}
