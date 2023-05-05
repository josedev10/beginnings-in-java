
package ejemplo;


public class Main {
    public static void main(String[] args){
        Persona persona=new Persona();
        Perro perro=new Perro();
        Vaca vaca=new Vaca();
        
        persona.comer();
        perro.comer();
        //la vaca como no esta sobre escrita entonces solo imprime lo heredado por la clase Animal del metodo comer()
        vaca.comer();
    }
}
