package iniciarcesion3intentos;

/* Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas 
la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
«Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
import java.util.Scanner;

public class IniciarCesion3Intentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, password;

        System.out.println("REGISTRO DE USUARIO ");
        System.out.print("Digite el nombre del usuario: ");
        user = scanner.nextLine();
        System.out.print("Digite la contraseña: ");
        password = scanner.nextLine();

        char iniciar;

        System.out.println("Desea iniciar cesion: (digite s para si y n para no)");
        iniciar = scanner.next().charAt(0);
        scanner.nextLine();

        if (iniciar == 's') {
            int intento = 0;
            boolean iniciado = false;

            do {
                String userTemp;
                String passwordTemp;

                if (intento == 0) {
                    System.out.println("Digite el usuario: ");
                    userTemp = scanner.nextLine();
                    System.out.println("Digite la contraseña: ");
                    passwordTemp = scanner.nextLine();
                } else {
                    System.out.println("Digite el usuario: (" + (intento + 1) + "/3)");
                    userTemp = scanner.nextLine();
                    System.out.println("Digite la contraseña: (" + (intento + 1) + "/3)");
                    passwordTemp = scanner.nextLine();
                }
                if (userTemp.equals(user) && passwordTemp.equals(password)) {
                    System.out.println("Enhora buena, has iniciado");
                    iniciado = true;
                } else {
                    intento++;
                    iniciado = false;
                }
            } while (intento != 3 && iniciado == false);
        }else{
            System.out.println("Gracias, por usar nuestro servicio");
        }


    }

}
