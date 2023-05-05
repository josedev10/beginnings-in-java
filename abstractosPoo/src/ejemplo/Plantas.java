
package ejemplo;

public class Plantas extends SerVivo {
    //sobre escribe al metodo alimentarse de la clase SerVivo
    @Override
    public void alimentarse(){
        System.out.println("se alimenta por la fotosintesis");
    }
}
