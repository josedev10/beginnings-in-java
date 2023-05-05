
package ejercicio;

//añadiendole a la clase estudiante el extends se refiere a que hereda, y hereda de la clase Persona
public class Estudiante extends Persona{
    /*Atrbutos de la clase Estudiante, no es necesario escribir nombre,apellidos y edad por que ya lo hereda de la clase persona
    entonces solo se le suman las variables que se utilizaran exclusivamenete en esta clase*/
    private int codigoEstudiante;
    private float notaFinal;
    
    //constructor de la clase Estudiante
    public Estudiante(String nombre,String apellidos,int edad,int codigoEstudiante,float notaFinal){
        /*con super le estamos diciendo a java que nombre,apellidos y edad ya estan inicializados en la clase Persona*/
        super(nombre,apellidos,edad);
        //pero la otras variables si faltan por inicializar, asi que se inicializan
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal=notaFinal;
        
    }
    public void mostrarDatos(){
        /*la variable de nombre,apellido y edad no se pueden utilizar a menos con 
        el metodo getter o quitandole el encapsulamiento a la clase padre con protected*/
        System.out.println("Nombre: "+getNombre()+""
                + "\nApellido: "+getApellidos()+""
                        + "\nEdad: "+getEdad()+""
                                + "\nCodigo del estudiante: "+codigoEstudiante+""
                                        + "\nNota final: "+notaFinal);
    }
    
}
