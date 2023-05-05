
package ejemplo;

public class AnimalHerbivoro extends Animal {
    
    //sobre escribe al metodo alimentarse de la clase Animal
    @Override
    public void alimentarse(){
        System.out.println("El animal se alimenta de hierbas");
    }
}
