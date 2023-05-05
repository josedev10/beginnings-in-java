package ejercicioproductoimpar;

import javax.swing.JOptionPane;

public class Ejercicioproductoimpar {

    public static void main(String[] args) {
        long producto = 1;
        int i;
        for (i = 1; i <= 20; i += 2) {
            producto*=i;

        }
        JOptionPane.showMessageDialog(null," El producto de los 10 números impares: "+producto);
    }

}
