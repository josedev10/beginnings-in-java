
package poli;

public class VehiculoTurismo extends Vehiculo {
        
    private int numeropuertas;
    
    public VehiculoTurismo(String matricula,String marca,String modelo,int numeropuertas){
        super(matricula,marca,modelo);
        this.numeropuertas=numeropuertas;
    }
    @Override
    public String mostrarDatos(){
        return "\nLa matricula es: "+matricula+"\nLa marca es: "+marca+
                "\nEl modelo es: "+modelo+"\nNumero de puertas es: "+numeropuertas;
    }
}

