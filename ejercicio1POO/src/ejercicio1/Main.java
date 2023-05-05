
package ejercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void  main(String[] args){
        //DATO: la instancicion de objetos tambien se puede hacer igual que en los arreglos y matrices
        Cuadrilatero c1;
        float lado1,lado2;
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if(lado1==lado2){
            c1=new Cuadrilatero(lado1);
        }else{
            c1=new Cuadrilatero(lado1,lado2);
        }
        
        if(lado1==lado2){
            System.out.println("El perimetro del cuadrado es: " + c1.getPerimetro());
            System.out.println("El Area del cuadrado es:  " + c1.getArea());
        }
        else{
            System.out.println("El perimetro del cuadrilatero es: " + c1.getPerimetro());
            System.out.println("El Area del cuadrilatero es:  " + c1.getArea());
        }
    }
}
