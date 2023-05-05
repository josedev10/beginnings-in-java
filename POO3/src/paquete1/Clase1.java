//Modificadores de acceso
package paquete1;

public class Clase1 {
    private int edad;
    private final String nombre;
    
    public Clase1(String nombre){
        this.nombre=nombre;
    }
    
    //metodo setter= para establecer la edad
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    //metodo Getter= para obtener o mostrar la edad
    public int getEdad(){
        return edad;
    }
    /*Esto es un ejemplo de encapsulamiento, 
    ya que el atributo edad solo puede ser accedido y modificado a través de los métodos SetEdad y GetEdad.*/

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }*/

   
    
    public void mostrarDatos(){
        //nombre="alejandro"; no se puede modificar el nombre por que no es una variable dice "final" entonces es una constante
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    //desde netbeans se puede hacer los setters y getters por insert code
    
}
