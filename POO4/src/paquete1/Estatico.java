
package paquete1;

public class Estatico {
    private static String frase="primera frase";
    public static int sumar(int a,int b){
        int suma=a+b;
        return suma;
    }
    
    public static void main(String[] args){
        /*Estatico ob1=new Estatico();
        Estatico ob2=new Estatico();
        
        ob2.frase="segunda frase";
        
        aqui lo que pasa es que los objetos se crean copias de String frase para imprimir
        System.out.println(""+ob1.frase);
        System.out.println(""+ob2.frase);
        
        cuando es un atributo o metodo estatico o static no le pertenece a un objeto le pertenece a la clase
        */
        
        Estatico.frase="hola";
        System.out.println(""+Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(5, 2));
        //repasa mejor este los miembros estaticos de la clase
        
    }
}
