
package ejercicio2;

import javax.swing.JOptionPane;

/*Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto 
dentro de un tablero y actualice su posición dentro del mismo. Los movimientos 
posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa 
mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.*/

public class PosicionObjeto {
    private int x;
    private int y;
    private char tablero[][]=new char[20][40];
    private String cad="";
    
    public PosicionObjeto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void tablero(){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                tablero[i][j]='-';
            }
        }
    }
    public void abajo(){
        y+=1;
    }
    public void arriba(){
        y-=1;
    }
    public void derecha(){
        x+=1;
    }
    public void izquierda(){
        x-=1;
    }
    public void moverObjeto(){
        tablero[y][x]='.';
    }
    
    public void MostrarPosicion(){
        cad="";
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                cad+=tablero[i][j]+" ";
            }
           cad+="\n";   
        }
        JOptionPane.showMessageDialog(null,cad+"\nLa posicion ahora es: x["+x+"] y["+y+"]");
    }
}
