
package ejercicioaleatorio;

import javax.swing.JOptionPane;

public class EjercicioAleatorio {

    public static void main(String[] args) {
        int num,cont=0,aleatorio;
        
        aleatorio=(int) (Math.random() * 100);
        
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número a adivinar o cercano: "));
            
            if(num>=aleatorio){
                if(num==aleatorio){
                    
                }else{
                JOptionPane.showMessageDialog(null, "El número "+num+" es mayor al adivinar");}
            }else{
                JOptionPane.showMessageDialog(null, "El número "+num+" es menor al adivinar");
            }
            
            cont++;
        }while(num!=aleatorio);
        
        if(cont==1){
        JOptionPane.showMessageDialog(null," Se intento una vez");  
        }else{
            JOptionPane.showMessageDialog(null," Se intento: "+cont+" veces"); 
        }
    }
    
}
