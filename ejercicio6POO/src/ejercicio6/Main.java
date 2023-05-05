
package ejercicio6;

import java.util.Scanner;

public class Main {
    /*Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero*/
    
    public static void main(String[] args){
        //creamos un scanner
        Scanner sc = new Scanner(System.in);

        //pedimos el 1er numero complejo
        System.out.println("Ingrese el primer número complejo (en formato a+bi):");
        //declaramos un objeto de la clase complejo que le sera asignado lo que contenga el metodo estatico crearNumeroComplejo con el argumento digitado por el usuario
        Complejo c1 = crearNumeroComplejo(sc.next());
        //pedimos el segundo numero complejo
        System.out.println("Ingrese el segundo número complejo (en formato a+bi):");
        //se hace lo mismo que lo anterior, solo se declara otro objeto
        Complejo c2 = crearNumeroComplejo(sc.next());

        //se crea la variable opcion para crear el menú de opciones
        int opcion;
        //se crea el bucle do-while para el menú
        do {
            //se imprime el menú y sus opciones
            System.out.println("\nElija una opción:");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comparar 2 números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("0. Salir");
            //el numero digitado por el usuario se guarda en opcion con scanner
            opcion = sc.nextInt();

            //se crea un switch para cada caso de opciones
            switch (opcion) {
                case 1:
                    /*se crea un nuevo objeto de la clase complejo que se llamara suma, esta contendra a la invocacion del método
                    sumar con el argumento c2*/
                    Complejo suma = c1.sumar(c2);
                    System.out.println("La suma es: " + c1.imprimir(suma));
                    break;
                case 2:
                    Complejo prod = c1.multiplicar(c2);
                    System.out.println("El producto es: " + c1.imprimir(prod));
                    break;
                case 3:
                    boolean iguales = c1.equals(c2);
                    System.out.println("Los números complejos son " + (iguales ? "iguales" : "diferentes"));
                    break;
                case 4:
                    System.out.println("Ingrese un entero:");
                    int entero = sc.nextInt();
                   Complejo prodEntero = c1.multiplicarPorEntero(entero);
                    System.out.println("El producto es: " + c1.imprimir(prodEntero));
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break; 
            }
            //el bucle dara vueltas hasta que se digite el número 0
        } while (opcion != 0);
    }
    //se crea la clase estatica que retornara un objeto de la clase complejo y tendra un parametro tipo String
    //// Método para crear un objeto Complejo a partir de un String en formato "a+bi"
private static Complejo crearNumeroComplejo(String s) {
    // se guarda en indiceMas un entero de la cadena s buscando el indice de "+"
    int indiceMas = s.indexOf("+");
    //se guarda en indiceI un entero de la cadena s buscando el indice de "i"
    int indiceI = s.indexOf("i");
    /*se guarda en una variable tipo double como real lo que contenga la cadena del substring donde comienza en el indice 0 hasta encontrar
    a "+" que es el indice y esa cadena es convertida en double*/
    double real = Double.parseDouble(s.substring(0, indiceMas));
    /*se guarda en la variable imag lo que contenga la cadena convertida a double, la cadena es un substring que comienza en la posicion de 
    indiceMas o sea "+" una posicion adelante hasta llegar a indiceI*/
    double imag = Double.parseDouble(s.substring(indiceMas + 1, indiceI));
    //Esta línea crea un nuevo objeto "Complejo" con los valores de "real" e "imag" y lo devuelve como resultado de la función.
    return new Complejo(real, imag);
}

    
                                   
}