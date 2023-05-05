
package ejercicio10;

import java.util.Scanner;


public class Main {
    static Scanner entrada=new Scanner(System.in);
    
    
    public static void main(String[] args){
        menuOpciones();
        entrada.close();
    }
    public static void menuOpciones(){
       int opcion;
       char seguirMenu;
       do{
           do{
            System.out.println("Buen dia, que vamos hacer hoy: ");
            System.out.println(" 1. Viaje de equipo");
            System.out.println(" 2. Entrenamiento");
            System.out.println(" 3. partido de futbol");
            System.out.println(" 4. Planificar entrenamiento");
            System.out.println(" 5. entrevista");
            System.out.println(" 6. Curar lesion ");
            System.out.print("Opcion: ");
            
            opcion=entrada.nextInt();
        }while(opcion < 1 || opcion > 6);
           
           switch(opcion){
               case 1: 
                   viajeEquipo();
                   break;
               case 2:
                   entrenamiento();
                   break;
               case 3:
                   partidoFutbol();
                   break;
               case 4:
                   planificarEntrenamiento();
                   break;
               case 5:
                   entrevista();
                   break;
               case 6:
                   curarLesion();
                   break;
           }
           
           System.out.println("\nDesea volver al menú: (s/n)");
           seguirMenu=entrada.next().toLowerCase().charAt(0);
           System.out.println("");
       }while(seguirMenu=='s');
       
    }
public static void viajeEquipo(){
        String destino;
        
        entrada.nextLine();
        System.out.print("Digite el destino a donde el equipo tendrá que viajar: ");
        destino = entrada.nextLine();
        
        System.out.println("\nviajaremos a "+destino);
}

public static void entrenamiento(){
    int jugadores;
    String estrategia,nombre,apellido;
    int edad;
    
    entrada.nextLine();
    System.out.println("Digite el nombre del entrenador: ");
    nombre=entrada.nextLine();
    System.out.println("Digite apellido del entrenador: ");
    apellido=entrada.nextLine();
    System.out.println("Digite la edad del entrenador: ");
    edad=entrada.nextInt();
    entrada.nextLine();
    System.out.println("Digite la estrategia del entrenador: ");
    estrategia=entrada.nextLine();
    System.out.println("Digite jugadores a entrenar: ");
    jugadores=entrada.nextInt();
    
    Entrenador entrenador=new Entrenador(estrategia,nombre,apellido,edad);
    
    System.out.println("\nLos "+jugadores+" jugadores seran entrenados por: \n"+entrenador.toString());
    
    
}
public static void partidoFutbol(){
    
    Futbolista jugadores[]=new Futbolista[2];
    
    for(int i=0;i<jugadores.length;i++){
        entrada.nextLine();
        System.out.println("Digite los datos del jugador "+(i+1)+" : ");
        System.out.println("Digite nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Digite apellido: ");
        String apellido=entrada.nextLine();
        System.out.println("Digite edad: ");
        int edad=entrada.nextInt();
        System.out.println("Digite dorsal: ");
        int dorsal=entrada.nextInt();
        System.out.println("Digite posicion: ");
        String posicion=entrada.nextLine();
        
        jugadores[i]=new Futbolista(dorsal,posicion,nombre,apellido,edad);
    }
    
    String nombreEntrenador;
    entrada.nextLine();
    System.out.println("nombre del entrenador: ");
    nombreEntrenador=entrada.nextLine();
    
    Persona entrenador=new Persona(nombreEntrenador,"",0);
    
    System.out.println("\nEl entrenador "+nombreEntrenador+" tiene esta plantilla: \n");
    for(int i=0;i<jugadores.length;i++){
        System.out.println(jugadores[i].toString());
        System.out.println("");
    }  
}
public static void planificarEntrenamiento(){
        String entrenamiento[]={
            "ejercicios de recuperación",
            "movimiento en la cancha",
            "definición",
            "control",
            "jugadas preparadas"
        };
            
     System.out.println("Se ha pactado una fecha de entrenamiento para la próxima semana\n"
                + "Este entrenamiento se enfocará en: "+entrenamiento[(int) (Math.random() * 5)] );
}
public static void entrevista(){
    
    String respuesta[]={
        "la contesto bien",
        "no le gusto a los patrocinadores",
        "deberia mejorar la calidad del entrevistador"
    };
    
    System.out.println("Jugador a entrevistar: ");
    entrada.nextLine();
        System.out.println("Digite nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Digite apellido: ");
        String apellido=entrada.nextLine();
        System.out.println("Digite edad: ");
        int edad=entrada.nextInt();
        System.out.println("Digite dorsal: ");
        int dorsal=entrada.nextInt();
        System.out.println("Digite posicion: ");
        String posicion=entrada.nextLine();
        
        Persona futbolista=new Futbolista(dorsal,posicion,nombre,apellido,edad);
        
        entrada.nextInt();
        System.out.println("El jugador: "+futbolista.getNombre()+" "+futbolista.getApellido()+respuesta[(int)(Math.random()*4)]);
}
public static void curarLesion(){
    entrada.nextLine();
    System.out.println("Jugador a curar: ");
        System.out.println("Digite nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Digite apellido: ");
        String apellido=entrada.nextLine();
        System.out.println("Digite edad: ");
        int edad=entrada.nextInt();
        System.out.println("Digite dorsal: ");
        int dorsal=entrada.nextInt();
        System.out.println("Digite posicion: ");
        String posicion=entrada.nextLine();
        
        Persona futbolista=new Futbolista(dorsal,posicion,nombre,apellido,edad);
         entrada.nextLine();
        System.out.println("Doctor a laborar: ");
        System.out.println("Digite nombre: ");
        String nombreD=entrada.nextLine();
        System.out.println("Digite apellido: ");
        String apellidoD=entrada.nextLine();
        System.out.println("Digite edad: ");
        int edadD=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite titulacion: ");
        String titulo=entrada.nextLine();
        System.out.println("Digite años de experiencia: ");
        int añosExperiencia=entrada.nextInt();
        
        Persona doctor=new Doctor(titulo,añosExperiencia,nombre,apellido,edad);
        
        System.out.println("\nEl doctor "+doctor.getNombre()+" "+doctor.getApellido()+" esta curando a :"+"\n"+futbolista.toString());
}
}
