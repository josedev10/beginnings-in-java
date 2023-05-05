
package ejercicio;

public class Persona {
    //atributos de la clase persona
    //protected String nombre, si se pone asi no solamenete la variable nombre sera privada si no que las clases hijas podran utilizarla.
    private String nombre;
    private String apellidos;
    private int edad;
    
    //constructor de Persona
    public Persona(String nombre,String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    //metodo getter de nombre
    public String getNombre(){
        return nombre;
    }
    //metodo getter de apellidos
    public String getApellidos(){
        return apellidos;
    }
    
   //metodo getter de edad
    public int getEdad(){
        return edad;
    }
}
