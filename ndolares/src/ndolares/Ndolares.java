
package ndolares;

import javax.swing.JOptionPane;

public class Ndolares {

    public static void main(String[] args) {
        float Guil, luis, juan, todos;
        
        Guil=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa el número de dolares de Guillermo: "));
        luis=Guil/2;
        juan=(Guil+luis)/2;
        todos=Guil+luis+juan;
        JOptionPane.showMessageDialog(null, ""
                + "El número de dolares de cada uno son: "+""
                + "\n"+"Guillermo: "+Guil+""
                        + "\nLuis: "+luis+""
                                + "\nJuan: "+juan+""
                                        + "\nY la de todos es: \n"+todos);
    }
    
}
