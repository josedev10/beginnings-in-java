
package ejemplo;

public class AnimalCarnivoro extends Animal {
    
    //sobre escribe al metodo alimetarse de la clase Animal
    @Override
    public void alimentarse(){
        System.out.println("El animal se alimenta de carne");
    }
}
