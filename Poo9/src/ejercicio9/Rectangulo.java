
package ejercicio9;
/*La clase Rectangulo es una subclase de la clase Poligono, por lo que hereda todos 
los atributos y métodos de la clase padre. Además, esta clase tiene sus propios atributos 
privados lado1 y lado2 que corresponden a los lados del rectángulo*/
public class Rectangulo extends Poligono {
    //encapsulamiento
    private double lado1;
    private double lado2;
    
    //no es necesario pedir al constructor en los perimetros el numero de lados
    public Rectangulo(double lado1,double lado2){
        //se escribe 2, por que 2 son los numeros de lados que se necesitan para el rectangulo
        /*El constructor de la clase Rectangulo recibe dos parámetros correspondientes a los 
        lados del rectángulo. Al momento de instanciar un objeto de esta clase, se llama al 
        constructor de la clase Poligono mediante super(2) con el valor 2 que corresponde al 
        número de lados de un rectángulo */
        super(2);
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    
    /*metodo toString en el cual se mostrara la informacion del poligono rectangulo, se utiliza super.toString para mostrar
    el metodo toString de la clase Poligono*/
    /*El método toString() de la clase Rectangulo sobreescribe el método toString() de 
    la clase Poligono para mostrar la información del rectángulo. Se utiliza super.toString() para mostrar el 
    método toString() de la clase Poligono y se agrega la información de los lados del rectángulo. */
    @Override
    public String toString(){
        return "Rectangulo: \n"+super.toString()+"\nLado 1: "+lado1+"\nLado 2: "+lado2;
    }
    
    //se sobre escribe el metodo area de Poligono
    /*Finalmente, la clase Rectangulo sobreescribe el método area() de la clase Poligono para calcular 
    el área del rectángulo, que es simplemente el producto de los lados lado1 y lado2 */
    @Override
    public double area(){
        return lado1*lado2;
    }
    
}
