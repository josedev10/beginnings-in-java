package busquedasecuencial;

import javax.swing.JOptionPane;

public class Busquedasecuencial {

    /*Búsqueda secuencial. Se utiliza cuando el vector no está ordenado o no puede ser ordenado previamente. 
    Consiste en buscar el elemento comparándolo secuencial mente (de ahí su nombre) con cada elemento 
    del vector hasta encontrarlo, o hasta que se llegue al final.*/
    public static void main(String[] args) {
        int[] arreglo;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la dimension del arreglo: "));
        arreglo = new int[n];
        int i, hallado;
        boolean encontrar = false;
        String cad = "", msg;
        for (i = 0; i < n; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + (i + 1) + " del arreglo: "));
            cad += arreglo[i] + " ";
        }
        hallado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a buscar: "));
        i=0;
        while (i < n && encontrar == false) {
            if (arreglo[i]==hallado) {
                encontrar = true;
            } 
            i++;
        }
if (encontrar == true) {
                msg = "\nEl número a buscar: "+hallado+"\nPosicion del arreglo encontrado: "+(i-1);
            } else {
                msg = "\nno se encontro a " + hallado + " en el arreglo";
            }
JOptionPane.showMessageDialog(null,"Arreglo: \n"+cad+msg);
    }
}
