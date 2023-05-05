package packagecuenta;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;

        do {
            System.out.println("Digite la cantidad de usuarios: ");
            amount = scanner.nextInt();

        } while (amount < 0);

        Cuenta usuario[] = new Cuenta[amount];
        usuarios(usuario);
        iniciarUsuario(usuario);
        if (iniciarUsuario(usuario) == -1) {
            System.out.println("No se ha podido encontrar la cuenta");
        } else {
            accionesCuenta(usuario);
        }

    }

    private static void usuarios(Cuenta usuario[]) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < usuario.length; i++) {
scanner.nextLine();
            System.out.println("Digite el nombre del titular de cuenta: ");
            String nombreTitular = scanner.nextLine();
            double numeroCuenta = Math.random() * 9000_000L + 1000_000L;
            System.out.println("el numero de cuenta es: "+numeroCuenta);
            usuario[i] = new Cuenta(numeroCuenta, 0, nombreTitular);
        }
    }

    private static int iniciarUsuario(Cuenta usuario[]) {
        String titular;
        double numeroCuenta;
        int indice = -1;
        boolean find = false;
        char intentar;

        do {
            titular = JOptionPane.showInputDialog("Ingresa el nombre del titular: ");
            numeroCuenta = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número de cuenta de: " + titular));

            for (int i = 0; i < usuario.length; i++) {
                if (titular.equals(usuario[i].getTitular()) && numeroCuenta == usuario[i].getNumeroCuenta()) {
                    indice = i;
                    find = true;
                }
            }

            if (find == false) {
                intentar = JOptionPane.showInputDialog(null, "quiere volver a intentar (s/n): ").toLowerCase().charAt(0);
                if (intentar == 'n') {
                    find = true;
                    return -1;
                }
            }

        } while (find == false);

        return indice;
    }

    private static void accionesCuenta(Cuenta usuario[]) {
        int opcion;
        char seguir;
        int indice = iniciarUsuario(usuario);
        do {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Hola " + usuario[indice].getTitular() + "!\n"
                        + "Digite su opcion: \n"
                        + " 1. retirar\n"
                        + " 2. Depositar\n"
                        + " 3. mirar el saldo\n"
                        + " 0. salir"));

                switch (opcion) {
                    case 1:
                        retirarCuenta(usuario[indice]);
                        break;
                    case 2:
                        depositarCuenta(usuario[indice]);
                        break;
                    case 3:
                        verSaldo(usuario[indice]);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "por favor, digite una de las opciones: ");
                }
            } while (opcion < 0 || opcion > 3);

            seguir = JOptionPane.showInputDialog("Digite s para salir ").charAt(0);
        } while (seguir != 's');

    }

    private static void retirarCuenta(Cuenta usuario) {
        float monto;

        monto = Float.parseFloat(JOptionPane.showInputDialog("Saldo: " + usuario.getSaldo() + "\nDigite el monto a retirar: "));

        if (monto <= usuario.getSaldo()) {
            usuario.retirar(monto);
            JOptionPane.showMessageDialog(null, "su retiro de: " + monto + " ha sido exitoso\nSu saldo actual es: " + usuario.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, saldo insuficiente");
        }
    }

    private static void depositarCuenta(Cuenta usuario) {
        float monto;

        monto = Float.parseFloat(JOptionPane.showInputDialog("Saldo: " + usuario.getSaldo() + "\nDigite el monto a depositar: "));
        usuario.depositar(monto);
        JOptionPane.showMessageDialog(null, "su deposito de :" + monto + " ha sido exitoso\nSu saldo actual es: " + usuario.getSaldo());
    }

    private static void verSaldo(Cuenta usuario) {
        JOptionPane.showMessageDialog(null, "La cuenta: " + (int) usuario.getNumeroCuenta() + "\nTitular: " + usuario.getTitular() + ""
                + "\nTiene un saldo de: " + usuario.getSaldo());
    }

}
