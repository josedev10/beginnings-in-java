
package convertirmasa;

import javax.swing.JOptionPane;


public class ConvertirMasa {

    public static void main(String[] args) {
        masa cm=new masa();
        
        int m;
        
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "------------------------------------\n"
                    + "   Menú de Opciones:                \n"
                    + " 1. Convertir a Tonelada            \n"
                    + " 2. Convertir a Gramo               \n"
                    + " 3. Convertir a Miligramo           \n"
                    + " 4. Convertir a Libra               \n"
                    + " 5. Convertir a Onzas               \n"
                    + " 0. Salir                           \n"
                    + "                                    \n"
                    + "------------------------------------\n"));
            switch(m){
                case 1:
                    cm.pedirkg();
                    cm.convTonelada();
                    JOptionPane.showMessageDialog(null," La conversion a Tonelada es: "+cm.convertido);
                    break;
                case 2:
                    cm.pedirkg();
                    cm.convGramo();
                    JOptionPane.showMessageDialog(null," La conversion a Gramo es: "+cm.convertido);
                    break;
                case 3:
                    cm.pedirkg();
                    cm.convMiligramo();
                    JOptionPane.showMessageDialog(null," La conversion a Miligramo es: "+cm.convertido);
                    break;
                case 4:
                    cm.pedirkg();
                    cm.convLibra();
                    JOptionPane.showMessageDialog(null," La conversion a Libra es: "+cm.convertido);
                    break;
                case 5:
                    cm.pedirkg();
                    cm.convOnzas();
                    JOptionPane.showMessageDialog(null," La conversion a Onzas es: "+cm.convertido);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opcion Equivocada");
                    break;
                    
            }
            
        }while(m!=0);
    }
    
}
