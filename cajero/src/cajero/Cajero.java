package cajero;

import javax.swing.JOptionPane;

public class Cajero {

    public static void main(String[] args) {
        procesocajero pc = new procesocajero();

        int screencaja;
        JOptionPane.showMessageDialog(null, " Bienvenido a nuestro cajero");
        
        do {
            screencaja = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "------------------------------------\n"
                    + "   Menú de Opciones:                \n"
                    + " 1. Ingresar Dinero                 \n"
                    + " 2. Retirar Dinero                  \n"
                    + " 3. Salir                           \n"
                    + "                                    \n"
                    + "Saldo de cajero:        " + pc.saldo + "\n"
                    + "------------------------------------\n"));

            switch (screencaja) {
                case 1:
                    pc.procesopedir();
                    pc.ProcesoIngresar();
                    JOptionPane.showMessageDialog(null, " Usted ha ingresado " + pc.monto + "  exitosamente");
                    break;
                case 2:
                    pc.procesopedir();
                    pc.ProcesoRetirar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, " Usted ha salido, gracias por usar nuestros cajeros");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opcion Errada");
                    break;
            }

        } while (screencaja != 3);
    }

}
