/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author enriq
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, codigo, litros, articulo1 = 0, facturasMay = 0;
        float Preciolitro, factura=0, facturastotales = 0;

        while ( i <= 2) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el codigo del articulo " + i + " :"));
            litros = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la cantidad de litros del artculo " + i + " :"));
            
            switch(codigo){
                case 1:
                    factura=(float) litros*0.6f;
                    break;
                case 2:
                    factura=(float) litros*3f;
                    break;
                case 3:
                    factura=(float) litros*1.25f;
                    break;
                default:
                    JOptionPane.showMessageDialog(null," El articulo o producto no se encuentra \n"
                            + "Solo se tiene disponible a los productos 1, 2, 3-");
                    i=0;
                    break;
                    
            }     

            facturastotales += factura;

            if (codigo == 1) {
                articulo1 += litros;
            }
            if (factura > 600) {
                facturasMay++;
            }
            if(codigo<4 || codigo>0){
               i++; 
            }
        }
        JOptionPane.showMessageDialog(null, " La facturacion total es: " + facturastotales + ""
                + " \nLas cantidades vendidas en litro del artculo 1 es: " + articulo1 + ""
                + " \nLas facturas mayores a 600 son: " + facturasMay);
    }

}
