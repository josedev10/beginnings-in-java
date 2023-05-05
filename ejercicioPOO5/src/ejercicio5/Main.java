
package ejercicio5;

import java.util.Scanner;

public class Main {
    /*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para 
    ello defina los atributos necesarios que se requieren, proporcione métodos de 
    consulta, un método constructor e implemente métodos para calcular el perímetro y 
    el área de un triángulo, además implementar un método que a partir de un arreglo de 
    triángulos devuelva el área del triángulo de mayor superficie*/
    //clase public static para que sea de la clase y no del objeto, con retorno en tipo de dato double
    //contiene unos parametros de la clase TrianguloIsosceles y un objeto de array triangulo
    public static double trianguloMayorSuperficie(TrianguloIsosceles triangulo[]){
        //variable a necesitar
        double area;
        //int indice=0;
        
        //asignar a area lo que contiene el objeto triangulo en el arreglo posicion 0 en el metodo getter area
        area=triangulo[0].getArea();
        
        //recorrrer un bucle for con la condicion de buscar a la area mayor
        for(int i=1;i<triangulo.length;i++){
            if(area<triangulo[i].getArea()){
                //asignar a area, la area mayor encontrada
                area=triangulo[i].getArea();
                //indice=i;
            }
        }
        //retornar el valor de area 
        return area;
    }
    public static void main(String [] args){
        //creacion del scanner para poder digitar
        Scanner entrada=new Scanner(System.in);
        //variables a necesitar
        double lado,base;
        //creacion de variables para la cantidad de triangulos a digitar, tambien para guardar el indice, y para elegir un triangulo en especifico
        int cantidadtriangulos,areaMayorSuperficie,trianguloElegido=0;
        
        //validacion de entrada de datos para la cantidad de triangulos
        while(true){
            System.out.print("Digite la cantidad de triangulos: ");
            if(entrada.hasNextInt()){
                cantidadtriangulos=entrada.nextInt();
                break;
            }else{
                System.out.println("Error: digite una cantidad en números enteros");
                entrada.nextLine();//que nunca se olvide, siempre poner el nextLine para limpiar la entrada invalida
            }
        }
        
        //declarar el objeto con array
        TrianguloIsosceles triangulo[]=new TrianguloIsosceles[cantidadtriangulos];
        
        //bucle para llenar a cada objeto del arreglo
        for(int i=0;i<cantidadtriangulos;i++){
            
            //se comienza con entrada.nextLine() para que no salgan pegados los sout
            entrada.nextLine();
            System.out.println("\nDigite los datos del triangulo isosceles "+(i+1)+" : ");
            //validacion de entrada de la variable lado
            while(true){
                System.out.print("Digite uno de los lados: ");
                if(entrada.hasNextDouble()){
                    lado=entrada.nextDouble();
                    break;
                }else{
                    System.out.println("Error: digite el lado en números");
                    entrada.nextLine();
                }
            }
            //validacion de entrada de la variable base;
            
            while(true){
                System.out.print("Digite la base: ");
                if(entrada.hasNextDouble()){
                    base=entrada.nextDouble();
                    break;
                }else{
                    System.out.println("Error: digite la base en números");
                    entrada.nextLine();
                }
            }
            
            //terminar de instanciar los objetos y enviar los argumentos a necesitar
            triangulo[i]=new TrianguloIsosceles(lado,base);
            //imprimir el perimetro y area de cada triangulo digitado con el objeto y el metodo correspondiente
            System.out.println("\nEl perimetro del triangulo "+(i+1)+" : "+triangulo[i].getPerimetro());
            System.out.println("El area del triangulo "+(i+1)+" : "+triangulo[i].getArea());
        }
        
        //imprimir el area del triangulo de mayor superficie con la clase public static
        System.out.println("\nEl area del triangulo de mayor superficie es: "+trianguloMayorSuperficie(triangulo));
        
        //se le asigna a areaMayorSuperficie lo que contenga la clase public static
        /*areaMayorSuperficie=trianguloMayorSuperficie(triangulo);*/
        
        //validacion de entrada de que triangulo se desea ver
       /* while(true){
            System.out.print("\nDigita el triangulo isosceles a ver: ");
            if(entrada.hasNextInt()){
                trianguloElegido=entrada.nextInt();
                trianguloElegido--;
                break;
            }else{
                System.out.println("Error: Digite un número entero");
                entrada.nextLine();
            }
        }*/
        
       //mostrar los datos anteriores
        /*System.out.println("\nEl triangulo isosceles seleccionado es: "+(trianguloElegido+1));
        System.out.println(triangulo[trianguloElegido].mostrarDatos());
        System.out.println("\nEl triangulo isosceles con mayor superficie de area es : ");
        System.out.println(triangulo[areaMayorSuperficie].mostrarDatos());*/
    }
}

