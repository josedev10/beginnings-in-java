/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package positivo;

import javax.swing.JOptionPane;

/**
 *
 * @author enriq
 */
public class abs {

    int num, pos;

    public void capNum() {
        num = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un número: "));
    }

    public void Procesos() {
        if (num < 0) {
            pos = num * (-1);
            JOptionPane.showMessageDialog(null, " El positivo de: " + num + " es: " + pos);
        } else {
            JOptionPane.showMessageDialog(null, " El numero es positivo " + num);
        }
    }
}
