
package poli;

public class Main {
    
    public static void main(String[] args){
        //crear un arreglo de objetos, y declaracion de objetos
        Vehiculo misVehiculos[]=new Vehiculo[4];
        
        //instanciacion e inializacion de objetos con polimorfismo
        misVehiculos[0]=new Vehiculo("8280","langinhi","2000");
        //aqui toma el metodo constructor de la subclase VehiculoDeportivo
        misVehiculos[1]=new VehiculoDeportivo("01387","lazio","2002",15);
        misVehiculos[2]=new VehiculoTurismo("8368","ford","2012",4);
        misVehiculos[3]=new VehiculoFurgoneta("88353","foton","2016",2000);
        
        //mostrar arreglo de objetos con un bucle for each
        for(Vehiculo vehiculos:misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
