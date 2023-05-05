
package ejercicio9;

/*Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y 
al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.*/

//se hace la clase poligono, clase padre y tiene que ser abstracta para tener metodos abstractos
/*Se define la clase Poligono como abstracta, lo que significa que no se puede crear objetos 
directamente a partir de ella. Será una clase padre que tendrá métodos y variables que podrán ser 
heredados por sus subclases (Rectangulo y Triangulo)*/
public abstract class Poligono {
    //la variable tiene que ser protected para que las clases hijas tengan acceso a la variable 
    protected int numeroLados;
    //metodo constructor
    public Poligono(int numeroLados){
        this.numeroLados=numeroLados;
    }
    
    //metodo getter para obtener el numero de lados
    public int getNumeroLados(){
        return numeroLados;
    }
    
    //metodo toString() o mostrarDatos(), su sintaxis es asi por herencia de java
    /* */
    @Override
    public String toString(){
        return "numero de lados: "+numeroLados;
    }
    /*Se define el método abstracto area() que será utilizado para calcular el área 
    del polígono. Este método es abstracto porque no se le proporciona una implementación 
    en la clase Poligono, sino que se espera que cada subclase (Rectangulo y Triangulo) implemente su propio método area() */
    //se declara el metodo abstracto de area, por que no se piensa instanciar en la clase Poligono
    public abstract double area();
}
