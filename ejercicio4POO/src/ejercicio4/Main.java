package ejercicio4;

import java.util.Scanner;

public class Main {

    /*Ejercicio 4: Construir un programa para una competencia de atletismo, el 
    programa debe gestionar una serie de atletas caracterizados por su número de 
    atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos 
    del atleta ganador de la carrera.*/
    public static int indiceMenorTiempo(Atleta atleta[]){
        float tiempo;
        int indice=0;
        
        tiempo=atleta[0].getTiempoCarrera();
        
        for(int i=1;i<atleta.length;i++){
            if(atleta[i].getTiempoCarrera() < tiempo){
                tiempo=atleta[i].getTiempoCarrera();
                indice=i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables a pedir
        String nombre;
        float tiempo;
        int numerodecorredor, numerodeparticipantes,indiceGanador;
        
        //pedir la cantidad de participantes con una validacion de entrada con el metodo hasNext()
        while(true){
            System.out.print("El número de participantes de la competencia es: ");
            if(entrada.hasNextInt()){
                numerodeparticipantes = entrada.nextInt();
                break;
            }else{
                System.out.println("Error: entrada invalida, intenta de nuevo con un entero");
                entrada.nextLine();
            }
        }
        
        //declarar el objeto con array
        Atleta atleta[]=new Atleta[numerodeparticipantes];
        
        //bucle for 
        for (int i = 0; i < atleta.length; i++) {
            
            //ojo: hay que estar pendiente de utilizar el entrada.nextLine(); para que todo salga bien
            entrada.nextLine();
            System.out.println("\nDigite los datos del atleta "+(i+1)+" : ");
            System.out.print("Digite el número del atleta: ");
            numerodecorredor=entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite el nombre del atleta: ");
            nombre=entrada.nextLine();
            System.out.print("Digite el tiempo de la carrera del atleta: ");
            tiempo=entrada.nextFloat();
            
            atleta[i]= new Atleta(numerodecorredor,nombre,tiempo);
        }
        indiceGanador=indiceMenorTiempo(atleta);
        
        System.out.println("\nEl ganador de la carrera es: ");
        System.out.println(atleta[indiceGanador].mostrarGanador());

    }
}
