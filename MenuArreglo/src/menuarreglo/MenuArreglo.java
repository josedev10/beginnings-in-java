
package menuarreglo;

import javax.swing.JOptionPane;

public class MenuArreglo {

    public static void main(String[] args) {
    OperaArreglo oma=new OperaArreglo();
    int op;
    do{
       op=Integer.parseInt(JOptionPane.showInputDialog("----------------------------\n"
               + "    Menú Del Arreglo    \n"
               + " 1. Generar Arreglo     \n"
               + " 2. Mostrar Arreglo     \n"
               + " 3. Mayor Elemento      \n"
               + " 4. Suma Elementos      \n"
               + " 0. Salir               \n"
               + "----------------------------"));
       switch(op){
           case 1:
               oma.GenerarArreglo();
               break;
           case 2:
               oma.MostrarArreglo();
               break;
           case 3:
               oma.Mayor();
               break;
           case 4:
               oma.Sumar();
               break;
           case 0:
               JOptionPane.showMessageDialog(null, " Usted ha Terminado..");
               break;
           default:
               JOptionPane.showMessageDialog(null, " Valor Errado");
       }
    }while(op!=0);
    }
    
}
