
package poli;

//subclase perteneciente a vehiculo
public class VehiculoDeportivo extends Vehiculo{
    
    //variable a necesitar para la clase VehiculoDeportivo
    private int cilindrada;
    
    //constructor
    public VehiculoDeportivo(String matricula,String marca,String modelo,int cilindrada){
        super(matricula,marca,modelo);
        this.cilindrada=cilindrada;
    }
    //sobre escritura de mostrar datos
    @Override
    public String mostrarDatos(){
        return"\nLa matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nLa cilindrada es: "+cilindrada;
    }
}
