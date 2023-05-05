
package ejemplo;

public class Main {
    public static void main(String[] args){
        //SerVivo servivo=new SerVivo(); no se puede instanciar un objeto de una clase abstracta
        Plantas planta=new Plantas();
        AnimalCarnivoro animalC=new AnimalCarnivoro();
        AnimalHerbivoro animalH=new AnimalHerbivoro();
        
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
