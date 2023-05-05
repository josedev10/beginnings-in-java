package areacirculo;
import javax.swing.JOptionPane;
public class AreaCirculo {

    public static void main(String[] args) {
        String texto;
        texto = JOptionPane.showInputDialog("Ingresa un radio: ");
        double radio = Double.parseDouble(texto);
        double area=Math.PI*Math.pow(radio,2);
        System.out.println("El area de un circulo: "+area);
        //JOptionPane.showMessageDialog(null,"El area de un circulo: "+area);
    }

}
