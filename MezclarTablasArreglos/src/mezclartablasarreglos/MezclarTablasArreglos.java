
package mezclartablasarreglos;

public class MezclarTablasArreglos {
/*Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en 
    una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.*/
    public static void main(String[] args) {
        mezclar mt=new mezclar();
        mt.GuardarA();
        mt.TercerTabla();
        mt.MostrarTerceraTabla();
    }
    
}
