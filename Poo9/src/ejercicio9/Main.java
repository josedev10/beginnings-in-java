package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/*Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y 
al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.*/
public class Main {
    

//queremos que este fuera del metodo main, pero que este para esta clase, asi que lo declaramos en un metodo static
    /*En primer lugar, se define un arreglo de objetos de la superclase Poligono. Este arreglo, denominado poligono, 
    se utilizará para almacenar los objetos de las subclases Rectangulo y Triangulo. */
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    //creamos un metodo static para el metodo scanner, y para que no lo hagamos todo en el metodo main
    /*El programa utiliza una clase Scanner para solicitar la entrada del usuario y un ArrayList 
    para almacenar los objetos Polígono en el arreglo.*/
    static Scanner entrada=new Scanner(System.in);

    public static void main(String[] args) {
        //ya tenemos el metodo para llenar los poligonos
        
        llenarPoligono();
        //falta, el metodo para mostrar el area y los datos de cada poligono
        mostrarPoligonos();
        

    }
    
    //creamos un metodo static con acceso publico y con retorno void donde se llenara a los poligonos
    /*El método llenarPoligono() es el encargado de pedir al usuario la información necesaria para crear un polígono 
    y almacenarlo en el arreglo. Este método utiliza un bucle do-while para permitir al usuario ingresar varios 
    polígonos si lo desea. Dentro del bucle, se utiliza otro bucle do-while para asegurarse de que el usuario ingrese 
    un número válido (1 o 2) para indicar si el polígono es un rectángulo o un triángulo. */
    public static void llenarPoligono(){
        //se crea la variable opcion para saber que tipo de poligono se ira a digitar
        int opcion;
        //se crea una variable char para saber si el bucle continua pidiendole otro poligono al usuario
        char respuesta;
        do{
            //se crea un do-while para que el usuario solo pueda digitar los numeros 1 o 2, o sino seguir pidiendole hasta que ingrese correctamenta
            do{
                System.out.println("Digite que poligono es: ");
                System.out.println(" 1. rectangulo");
                System.out.println(" 2. Triangulo");
                System.out.print("Opcion: ");
                //se guarda lo digitado por el usuario en la variable opcion con el objeto del metodo scanner
                opcion=entrada.nextInt();
                //la condicion para que el bucle continue
            }while(opcion<1 || opcion >2);
            
            //un switch para que el programa haga dependiendo de que opcion fue digitada
            switch(opcion){
                /*Si el usuario elige un rectángulo, se llama al método llenarRectangulo() para pedir al usuario 
                los lados del rectángulo y crear un objeto de la subclase Rectangulo. Si el usuario elige un triángulo, 
                se llama al método llenarTriangulo() para pedir al usuario los lados del triángulo y crear un objeto 
                de la subclase Triangulo. En ambos casos, el objeto creado se agrega al arreglo poligono mediante 
                el método add().*/
                case 1: 
                    //llenar un rectangulo
                    llenarRectangulo();
                    break;
                case 2: 
                    //llenar un triangulo
                    llenarTriangulo();
                    break;
            }
            //se le pide al usuario si quiere seguir digitando
            System.out.print("\nquiere digitar otro poligono(s/n): ");
            respuesta=entrada.next().toLowerCase().charAt(0);
            System.out.println("");
            
            /*las comillas simples (' ') se usan para definir caracteres individuales, 
            mientras que las comillas dobles (" ") se usan para definir cadenas de caracteres. */
            //los caracteres para que el bucle siga
           
        }while(respuesta=='s');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.println("Digite el lado 1: ");
        lado1=entrada.nextDouble();
        System.out.println("Digite el lado 2: ");
        lado2=entrada.nextDouble();
        System.out.println("Digite el lado 3: ");
        lado3=entrada.nextDouble();
        
        Triangulo triangulo=new Triangulo(lado1,lado2,lado3);
        //aqui se aplica el polimorfismo, ya que un objeto de la subclase Triangulo se guardara en un arreglo de objetos de la clase poligono
        poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.println("Digite el lado 1: ");
        lado1=entrada.nextDouble();
        System.out.println("Digite el lado 2: ");
        lado2=entrada.nextDouble();
        
        Rectangulo rectangulo=new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }
    /*El método mostrarPoligonos() recorre el arreglo poligono y muestra 
    la información de cada polígono, incluyendo su tipo y sus lados, así como su área calculada mediante el método `*/
    public static void mostrarPoligonos(){
        //recorriendo el arreglo de poligonos
        for(Poligono i: poligono){
            //se muestra con el elemento i, que haria como el iterador, y el metodo toString que diferenciara segun parametros para mostrar
            //se dara cuenta el toString si es un rectangulo o un triangulo dependiendo de cada iteracion
            System.out.println(i.toString());
            //se muestra el area de cada poligono
            System.out.println("El area es: "+i.area());
            System.out.println("");
            
        }
        /*También hay dos métodos separados para llenar un rectángulo y un triángulo. 
        Cada método solicita al usuario los datos necesarios y crea un objeto correspondiente 
        a la subclase (Rectángulo o Triángulo), que se agrega al arreglo utilizando polimorfismo*/
    }
}
