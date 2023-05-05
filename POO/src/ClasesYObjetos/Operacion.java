
package ClasesYObjetos;

//import javax.swing.JOptionPane;

public class Operacion {
    //atributos
    //int numero1,numero2;
    //int suma,resta,multiplicacion,division;
    
    //metodo
    
    /*public void PedirNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));
    }*/
    public int Sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    public int Restar(int numero1,int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    public int Multiplicar(int numero1,int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public int Dividir(int numero1,int numero2){
        int division=numero1/numero2;
        return division;
    }
    public void MostrarResultado( int resta,int multiplicacion,int division){
        //System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
    
}
