
package poli;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;
    
    public VehiculoFurgoneta(String matricula,String marca,String modelo,int carga){
        super(matricula,marca,modelo);
        this.carga=carga;
    }
    @Override
    public String mostrarDatos(){
        return "\nLa matricula es: "+matricula+"\nLa marca es: "+marca+
                "\nEl modelo es: "+modelo+"\nLa carga es: "+carga+" kilos";
    }
    
}
