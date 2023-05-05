
package convertirmasa;

import javax.swing.JOptionPane;

public class masa {
    double convertido,kg;
    
    public void pedirkg(){
        kg=Double.parseDouble(JOptionPane.showInputDialog(" Ingresa los kilogramos a convertir: "));
    }
    public void convTonelada(){
        convertido=kg*0.001;
    }
    public void convGramo(){
        convertido=kg*1000;
    }
    public void convMiligramo(){
        convertido=kg*1000000;
    }
    public void convLibra(){
        convertido=kg*2.20462;
    }
    public void convOnzas(){
        convertido=kg*35.274;
    }
}
