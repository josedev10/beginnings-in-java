
package menuarreglo1;

import javax.swing.JOptionPane;

public class MenuArreglo1 {

    public static void main(String[] args) {
        Alternativa ma=new Alternativa();
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("----------------------------\n"
                    + "    MENÚ PRINCIPAL     \n"
                    + " 1. Generar            \n"
                    + " 2. Mostrar            \n"
                    + " 3. Sumar              \n"
                    + " 0. Cerrar             \n"
                    + "----------------------------"));
            switch(op){
                case 1:
                    ma.GenerA();
                    break;
                case 2:
                    ma.MostrarA();
                    break;
                case 3:
                    ma.SumarA();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null," Se ha cerrado..");
                default:
                    JOptionPane.showMessageDialog(null," no se permite este valor..");
            }
        }while(op!=0);
    }
    
}
