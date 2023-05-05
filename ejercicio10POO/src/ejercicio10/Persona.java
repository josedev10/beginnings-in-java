
package ejercicio10;

/*crear un programa para simular un equipo de futbol(futbolista,
entrenador y doctor), para lo cual tendremos lo siguiente:
- una super clase Persona, que tendrá los siguientes datos: 
nombre, apellido, edad.
-la sub clase futbolista tendra los siguientes datos: dorsal y
posicion
-la sub clase entrenador tendra de dato la estrategia que utiliza
-la sub clase doctor tendra de datos, la titulacion y los años de experiencia

hacer un menú donde se tengan las siguientes opciones: viaje de equipo, entrenamiento, 
partido de futbol,planificar entrenamiento,entrevista, curar lesion.*/
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona(String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad;
    }
    
    
}
