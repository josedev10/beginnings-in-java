
package ejercicio9;

public class Triangulo extends Poligono {
    //encapsulamiento
    private double lado1;
    private double lado2;
    private double lado3;
    
    //constructor
    public Triangulo(double lado1,double lado2,double lado3){
        super(3);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    
    //metodo getter 
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    
    //se sobre escribe el metodo toString para la clase Triangulo
    @Override
    public String toString(){
        return "El triangulo: \n"+super.toString()+"\nLado 1: "+lado1+"\nlado 2: "+lado2+
                "\nLado 3: "+lado3;
    }
    
    //se sobre escribe el metodo area de la clase Poligono para retornar el area de un triangulo
    @Override
    public double area(){
        double p=(lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
}
