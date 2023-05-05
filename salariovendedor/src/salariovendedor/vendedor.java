
package salariovendedor;

import javax.swing.JOptionPane;


public class vendedor {
    float salario,comision=0;
    int ventas,ventas2,i=1;
    public void capVentas(){
        ventas=Integer.parseInt(JOptionPane.showInputDialog(""
                + " Ingresa el número de ventas del vendedor: "));
        
    }
    public void Procesos(){
        while(i<=ventas){
            ventas2=Integer.parseInt(JOptionPane.showInputDialog(" ingresa el valor de la venta "+i+": "));
            comision+=(ventas2*0.05);
            i++;
        }
        salario=1000+(150*ventas)+comision;
    }
    public void Mostrar(){
        JOptionPane.showMessageDialog(null," El salario del vendedor es: "+salario+"dolares");
    }
}
