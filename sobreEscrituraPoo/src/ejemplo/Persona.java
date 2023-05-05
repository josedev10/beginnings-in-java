
package ejemplo;

public class Persona extends Animal{
    
    //@Override señala que el metodo comer se esta sobre escribiendo para esta clase
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
