
package area;

public class Rectangulo {
    //se pone private por que esas variables solo la quiero utilizar en esta clase
    private int base=0;
    private int altura=0,area;
    //la sintasis es asi public "nombre de la clase" y los datos a necesitar, que se enviara desde la clase principal
    public Rectangulo(int base,int altura){
        //se pone this por que voy a utilizar las variables de esta clase
        this.base=base;
        this.altura=altura;
    }
    /*public int CalcularArea(){
        //utilizo return para que el metodo al momento de la invocacion me muestre el area
        int area=base*altura;
        return area;
    }*/
    public void CalcularArea(){
        area=base*altura;
    }
    
    public void MostrarArea(){
        CalcularArea();
        System.out.println("\nEl area del rectangulo es: "+area);
    }
}
