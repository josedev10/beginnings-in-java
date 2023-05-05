
package ejercicio2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int x,y;
        String movimiento;
        
        PosicionObjeto obj1;
        do{
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
        }while(x>20 || y>20);
        obj1=new PosicionObjeto(x,y);
        
        do{
            
            movimiento=JOptionPane.showInputDialog("Ingrese accion del objeto: \n"
                    + " w. Arriba\n"
                    + " s. Bajar\n"
                    + " a. Izquierda\n"
                    + " d. Derecha\n"
                    + " e. salir\n");
            
            switch(movimiento){
                case "w":
                    obj1.arriba();
                    obj1.tablero();
                    obj1.moverObjeto();
                    obj1.MostrarPosicion();
                    break;
                case "s":
                    obj1.abajo();
                    obj1.tablero();
                    obj1.moverObjeto();
                    obj1.MostrarPosicion();
                    break;
                case "a":
                    obj1.izquierda();
                    obj1.tablero();
                    obj1.moverObjeto();
                    obj1.MostrarPosicion();
                    break;
                case "d":
                    obj1.derecha();
                    obj1.tablero();
                    obj1.moverObjeto();
                    obj1.MostrarPosicion();
                    break;
                case "e":
                    JOptionPane.showMessageDialog(null,"Gracias por utilizarme :)");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Movimiento desconocido");
                    
            }
            
        
        }while(!"e".equals(movimiento));
        
        
    }
}
