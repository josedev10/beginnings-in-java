package horasequivalente;

import javax.swing.JOptionPane;

public class equivalente {

    int horas, semanas, dias, horas2;

    public void ObtHoras() {
horas=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el número de horas: "));
    }
    public void Procesos(){
        semanas=horas/(24*7);
        dias=horas%(24*7)/24;
        horas2=horas%24;
    }
    public void Mostrar(){
        JOptionPane.showMessageDialog(null,"son: "+semanas+" semanas "+dias+" dias "+horas2+" horas");
    }
}
