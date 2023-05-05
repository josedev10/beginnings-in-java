
package alumnosnotasejercicio19;

import javax.swing.JOptionPane;

public class AlumnosNotasEjercicio19 {

    public static void main(String[] args) {
        int aprobados=0,reprobados=0,condicionados=0,i;
        float nota;
        
        for(i=1;i<=6;i++){
            do{
              nota=Float.parseFloat(JOptionPane.showInputDialog(""
                      + " Ingresa la calificación en un intervalo de 0-10: "));  
            }while(nota<0 || nota > 10);
            
            if(nota==4){
                condicionados++;
            }else{
                if(nota>=5){
                    aprobados++;
                }else{
                    reprobados++;
                }
            }
        }
        if(aprobados>0){
            JOptionPane.showMessageDialog(null," la cantidad de aprobados: "+aprobados);
        }
        if(reprobados>0){
            JOptionPane.showMessageDialog(null," la cantidad de reprobados: "+reprobados);
        }
        if(condicionados>0){
            JOptionPane.showMessageDialog(null," la cantidad de condicionados: "+condicionados);
        }
                
    }
}
