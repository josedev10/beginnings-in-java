package mostrarstring;

import javax.swing.JOptionPane;

public class MostrarString {

    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog(" Ingresa el nombre: ");
        //JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + "!");
        System.out.println("Bienvenido " + nombre + "!");
    }

}
