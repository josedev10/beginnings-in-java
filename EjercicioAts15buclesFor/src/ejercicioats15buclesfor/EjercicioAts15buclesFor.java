
package ejercicioats15buclesfor;

import javax.swing.JOptionPane;

public class EjercicioAts15buclesFor {

    public static void main(String[] args) {
        int edad,i,mayorest=0,mayored=0,sumaed=0,mediaed;
        float esta,mediaest,sumaest=0;
        
        for(i=1;i<=5;i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la edad del estudiante: "));
            esta=Float.parseFloat(JOptionPane.showInputDialog(" Ingresa la estatura del estudiante:"));
            sumaed+=edad;
            sumaest+=esta;
            if(edad>18){
                mayored++;
            }
            if(esta>1.75){
                mayorest++;
            }
        }
        mediaest=sumaest/5;
        mediaed=sumaed/5;
        
        JOptionPane.showMessageDialog(null,""
                + "\nLa Edad media es: "+mediaed+""
                        + "\nLa Estatura media: "+mediaest+""
                                + "\nLa cantidad de estudiantes mayores a 18: "+mayored+""
                                        + "\nLa canrtidad de estudiantes que miden mas de 1.75 son: "+mayorest);
    }
    
}
