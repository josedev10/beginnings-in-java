
package iniciarcesion;

import javax.swing.JOptionPane;


public class cesion {
    String usu,contra;
    int i=1,sw=1;
    public void confirmar(){
        String u= "empleado",c= "54321";
        while(i<=3 && sw==1){
            usu=JOptionPane.showInputDialog(" Ingresa el usuario: ");
            contra=JOptionPane.showInputDialog(" Ingresa la contraseña: ");
            if(usu.equals(u) && contra.equals(c)){
            JOptionPane.showMessageDialog(null," Bienvenido: "+u);
            sw=2;
        }
        else{
                JOptionPane.showMessageDialog(null,"La información ingresada ha sido errónea :( "+""
                        + "\nintenta de nuevo" );
            }i++;
                }
    }
}
