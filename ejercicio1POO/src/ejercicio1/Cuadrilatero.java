
package ejercicio1;
/*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud deberán 
introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará la 
longitud de uno de los lados al constructor.*/
public class Cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;
    
    //metodo constructor 1 (cuadrilatero)
    public Cuadrilatero(float a,float b){
        lado1=a;
        lado2=b;
    }
    //metodo constructor 2 (cuadrado)
    public Cuadrilatero(float a){
        lado1=lado2=a;
    }
    //metodo getter(obteniendo perimetro)
    public float getPerimetro(){
        float perimetro=2*(lado1+lado2);
        return perimetro;
    }
    //metodo getter(obteniendo area)
    public float getArea(){
        float area=lado1*lado2;
        return area;
    }
}
