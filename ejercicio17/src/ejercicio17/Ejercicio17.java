
package ejercicio17;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    //Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.
    public static void main(String[] args) {
        int i, codigo,litros,articulo1=0,facturasMay=0;
        float Preciolitro, factura, facturastotales=0;
        
        for(i=1;i<=5;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el codifgo del articulo "+i+" :"));
            litros=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la cantidad de litros del artculo "+i+" :"));
            Preciolitro=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el precio por litro del articulo "+i+" :"));
            
            factura=litros*Preciolitro;
            facturastotales+=factura;
            
            if(codigo==1){
                articulo1+=litros;
            }
            if(factura>600){
                facturasMay++;
            }
        }
        JOptionPane.showMessageDialog(null," La facturacion total es: "+facturastotales+""
                + " \nLas cantidades vendidas en litro del artculo 1 es: "+articulo1+""
                        + " \nLas facturas mayores a 600 son: "+facturasMay);
    }
    
}
