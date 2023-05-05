
package ejercicio6;

public class Complejo {
    //atributos
    private double real;
    private double imaginario;
    
    //constructor
    public Complejo(double real,double imag){
        this.real=real;
        imaginario=imag;
    }
    //se crea el metodo sumar que retornara un objeto complejo
    public Complejo sumar(Complejo otro){
        double sumaReal = this.real + otro.real;
        double sumaImag = this.imaginario + otro.imaginario;
        return new Complejo(sumaReal, sumaImag);
    }
    public Complejo multiplicar(Complejo otro) {
        double prodReal = this.real * otro.real - this.imaginario * otro.imaginario;
        double prodImag = this.real * otro.imaginario + this.imaginario * otro.real;
        return new Complejo(prodReal, prodImag);
    }

    //un metodo que retornara un boolean, con un parametro de la clase de objeto complejo
    public boolean equals(Complejo otro) {
        return this.real == otro.real && this.imaginario == otro.imaginario;
    }

    //un metodo que retorna un objeto de la clase complejo y tiene parametro un entero
    public Complejo multiplicarPorEntero(int entero) {
        double prodReal = this.real * entero;
        double prodImag = this.imaginario * entero;
        return new Complejo(prodReal, prodImag);
    }
    //imprime al objeto de la clase complejo
    public String imprimir( Complejo a){
        return a.real+" + "+a.imaginario+" i";
    }
}
