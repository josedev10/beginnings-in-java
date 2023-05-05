
package ejercicio3;

import java.util.Scanner;
/*Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados 
por su marca, modelo y precio, imprima las propiedades del vehículo más barato. 
Para ello, se deberán leer por teclado las características de cada vehículo y 
crear una clase que represente a cada uno de ellos.*/
public class Principal {
    //8. se crea una clase publica y estatica para que le pertenezca a la clase y no al objeto
    /*9. lo dentro del parentesis(Vehiculo autos[]) viene siendo el parametro que 
    vendria siendo como "tipo de objeto o dato" la clase vehiculo y "El objeto o la variable" que es un array de objetos*/
    public static int indiceAutoMBarato(Vehiculo autos[]){
        //10.se crea a las variables precio para guardar al precio del bucle y se crea a indice para guardar la posicion en i del precio
        float precio;
        int indice=0;
        
        //11. se guarda en precio lo que contiene la posicion 0 del arreglo autos con el metodo getter precio
        precio=autos[0].getPrecio();
        //12. se corre un bucle for hasta que i sea menor a lo que contenga el arreglo autos, de forma creciente
        for(int i=1;i<autos.length;i++){
            //13. si lo que tiene precio es mayor al arreglo autos en posicion i con el metodo getter de precio entonces
            if(autos[i].getPrecio()< precio){
                //14. si se cumple la condicion entonces lo que tenga el arreglo en posicion i con el metodo getter precio se le asignara a precio
                precio=autos[i].getPrecio();
                //15. y en indice se guardara la posicion del arreglo autos donde sucede este cambio
                indice=i;
            }
        }
        //16. y entonces a la final retornamos el valor entero de la clase estatica con el return indice
        return indice;
    }
    
    public static void main(String[] args){
        //1. se crea un scanner para poder digitar 
        Scanner entrada=new Scanner(System.in);
        //2. se crea las variables a utilizar
        String marca,modelo;
        float precio;
        /*3. se crea la variable numeroVehiculos para saber cuantos vehiculos a digitar, 17.se crea la variable indiceBarato 
        para guardar el valor a retornar de la clase static*/
        int numeroVehiculos,indiceBarato;
        
        //4. se digita la cantidad de vehiculos
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos=entrada.nextInt();
        
        //5. aqui se crea la declaracion del objeto, y el objeto es un arreglo asi que se le da el tamaño del arreglo
        Vehiculo autos[]=new Vehiculo[numeroVehiculos];
        
        //6. se crea un bucle for para llenar los datos de cada objeto del arreglo
        for(int i=0;i<numeroVehiculos;i++){
            //tip: para que no salgan pegados los sout debe comenzar con un entrada.nextLine();
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+" : ");
            System.out.println("Introduzca la marca: ");
            marca=entrada.nextLine();
            System.out.println("Introduzca el modelo: ");
            modelo=entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            precio=entrada.nextFloat();
            
            //7. se termina de instanciar los objetos y se le envia los argumentos a necesitar
            autos[i]=new Vehiculo(marca,modelo,precio);
        }
        
        /*18. se le asigna a indiceBarato lo que contiene la invocacion del metodo de la clase static con un argumento de
        "autos" nombre del arreglo */
        indiceBarato= indiceAutoMBarato(autos);
        
        /* 19. se crea dos sout para imprimir, el primer sout contiene un salto de linea al incio para separarse del ultimo sout y 
        el segundo sout invoca al metodo del objeto-arreglo en la posicion de la variable indiceBarato que se le acaba de asignar,
        el nombre del metodo y sin argumentos*/
        System.out.println("\nEl auto mas barato es: ");
        System.out.println(autos[indiceBarato].mostrarDatos());
    }
}
