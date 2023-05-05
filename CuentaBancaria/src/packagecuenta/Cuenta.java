
package packagecuenta;
/*Programa para modelar una cuenta bancaria: Crea una clase "Cuenta" que tenga los atributos 
"numeroCuenta", "saldo" y "titular". Agrega métodos para depositar, retirar y consultar saldo.*/
public class Cuenta {
    private double numeroCuenta;
    private float saldo;
    private String titular;
    
    public Cuenta(double numCuenta,float saldo,String titular){
        this.numeroCuenta=numCuenta;
        this.saldo=saldo;
        this.titular=titular;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void depositar(float deposito){
        saldo+=deposito;
    }
    public void retirar(float retiro){
        saldo-=retiro;
    }
    
    
}
