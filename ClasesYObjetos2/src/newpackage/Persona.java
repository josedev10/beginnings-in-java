
package newpackage;

public class Persona {
    //atributos
    String nombre;
    int edad,dni;
    //metodos
    //metodo constructor
    public Persona(String name,int age){
        nombre=name;
        edad=age;
    }
    /*a esto se le conoce como sobrecarga de metodo constructor es 
una característica en Java que permite definir varios constructores para una clase 
con el mismo nombre, pero con diferentes parámetros.*/
    public Persona(int dni){
        this.dni=dni;
    }
    //a esto se le conoce como sobrecarga de metodos y se diferencian por la cantidad de parametros y sus tipos de datos
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He rrecorrido "+km+" kilometros");
    }
            
    /*public void Mostrardatos(){
        System.out.println("\nEl nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }*/
}
