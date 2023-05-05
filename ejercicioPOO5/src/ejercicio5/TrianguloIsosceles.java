
package ejercicio5;

public class TrianguloIsosceles {
    //atributos
    private double lado;
    private double base;
    
    //constructor
    public TrianguloIsosceles(double lado,double base){
        this.lado=lado;
        this.base=base;
    }
    
    //método Getter para perimetro
    public double getPerimetro(){
        double perimetro=(lado*2)+base;
        return perimetro;
    }
    
    //metodo Getter para area
    public double getArea(){
        double area=((base)*(Math.sqrt((Math.pow(lado,2))-(Math.pow(lado,2))/4)))/2;
        return area;
    }
    //metodo para mostrar string
    /*public String mostrarDatos(){
        return "base: "+base+"\nlado: "+lado+"\nEl triangulo tiene un perimetro de: "
                + ""+getPerimetro()+"\nEl triangulo tiene un area de: "+getArea();
    }*/
}
