
package poli;
//clase padre

//las variables de la clase vehiculo con metodo de acceso protected
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    //constructor de la clase vehiculo
    public Vehiculo(String matricula,String marca,String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    //mostrar datos con retorno en String
    public String mostrarDatos(){
        return "La matricula es: "+matricula+"\nLa marca es: "+marca+ "\nEl modelo es: "+modelo;
    }
}
