
package dialaboral;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaLaboral {

    public static void main(String[] args) {
        //se crea un objeto scanner llamado scanner
        Scanner scanner = new Scanner(System.in);

        //se crea un ciclo while infinito hasta un break
        while (true) {
            //se pide al usuario el dia
            System.out.print("Digite el dia: ");
            //se utiliza el metodo trim() para que elimine cualquier espacion en blanco que el usuario digite
            String input = scanner.nextLine().trim();

            //se crea un bloque try para capturar las excepciones
            try {
                //se crea un objeto date del metodo LocalDate para convertir lo digitado por usuario a fecha
                LocalDate date = LocalDate.parse(input);
                //el objeto date se convierte a dayOfWeek
                DayOfWeek dayOfWeek = date.getDayOfWeek();

                //si el dia es sabado o domingo mostrara que no es laboral, del resto es laboral
                if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                    System.out.println("El dia " + input + " no es laboral");
                } else {
                    System.out.println("El dia " + input + " es laboral");
                }

                //se rompe el bucle
                break;
                //cualquier excepcion que suceda mostrara el mensaje 
            } catch (Exception e) {
                System.out.println("Lo siento, digite de nuevo");
            }
        }
//se cierra el scanner para guardar recursos
        scanner.close();
        /*Scanner scanner=new Scanner(System.in);
        String dia;
        boolean seguir=false;
        
        
        do{
            System.out.println("Digite el dia: ");
            dia = scanner.nextLine().toLowerCase();
            
            switch (dia) {

                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "Viernes":
                    System.out.println("El dia " + dia + " es laboral");
                    seguir=false;
                    break;
                case "sabado":
                case "domingo":
                    System.out.println("El dia " + dia + " no es laboral");
                    seguir=false;
                    break;
                default:
                    System.out.println("Lo siento, digite de nuevo");
                    seguir=true;
                    break;
            }
            
        }while(seguir==true);*/
        
    }
    
}        
    

    
        
   

