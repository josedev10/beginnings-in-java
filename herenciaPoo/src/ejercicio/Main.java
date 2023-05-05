
package ejercicio;

public class Main {
    public static void main(String [] args){
        //se declara y instancia un objeto, se inicializa el objeto
        //que no se olvide a los numeros float se le agrega la f
        Estudiante estudiante=new Estudiante("jose","guerrero",18,39472, 42.1f);
        
        //se invoca al metodo mostrar datos de la clase Estudiante con el objeto estudiante
        estudiante.mostrarDatos();
    }
}
