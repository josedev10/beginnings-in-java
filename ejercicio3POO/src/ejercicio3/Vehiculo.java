
package ejercicio3;

public class Vehiculo {
    //creacion de variable con acceso privado para poder ser utilizada solo en la clase Vehiculo
    private String marca;
    private String modelo;
    private float precio;
    
    //constructor
    public Vehiculo(String marca,String modelo,float precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    //metodo getter
    public float getPrecio(){
        return precio;
    }
    //metodo para mostrar datos
    public String mostrarDatos(){
        return "La marca es: "+marca+"\nEl modelo es: "+modelo+"\nEl precio es: $"+precio;
    }
    
}
