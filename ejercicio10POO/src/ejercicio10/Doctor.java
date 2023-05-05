
package ejercicio10;

public class Doctor extends Persona{
    private String titulo;
    private int añosExperiencia;
    
    public Doctor(String titulo,int añosExperiencia,String nombre,String apellido,int edad){
        super(nombre,apellido,edad);
        this.titulo=titulo;
        this.añosExperiencia=añosExperiencia;
    }
    
    public String getTitulacion(){
        return titulo;
    }
    public int getAñosExperiencia(){
        return añosExperiencia;
    }
    public void setTitulacion(String titulo){
        this.titulo=titulo;
    }
    public void setAñosExperiencia(int añosExperiencia){
        this.añosExperiencia=añosExperiencia;
    }
    @Override
    public String toString(){
        return "El doctor: \n"+super.toString()+"\nTiene titulación en: "+titulo+"\nAños de experiencia: "+añosExperiencia;
    }
}
