
package ejercicio4;

public class Atleta {
    //atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;
    
    //constructor
    public Atleta(int numeroAtleta,String nombre,float tiempoCarrera){
        this.numeroAtleta=numeroAtleta;
        this.nombre=nombre;
        this.tiempoCarrera=tiempoCarrera;
    }
    //metodo Getter
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    //metodo con retorno String para mostrar
    public String mostrarGanador(){
        return "\nnúmero de atleta: "+numeroAtleta+"\ncon el nombre: "+nombre+""
                + "\nY un tiempo de carrera de: "+tiempoCarrera;
    }
}
