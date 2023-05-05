package matrices;

import javax.swing.JOptionPane;

public class Matrices {

    public static void main(String[] args) {
        int i, m, n, j, par = 0, sum = 0;
        String cad = "", matriz = "";//****
        int a[][] = new int[10][10];
        n = Integer.parseInt(JOptionPane.showInputDialog(""
                + " Ingresa el nùmero de filas: "));
        m = Integer.parseInt(JOptionPane.showInputDialog(""
                + " Ingresa el nùmero de columnas: "));
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" a[" + i + "," + j + "]"));
                matriz += a[i][j] + " ";//*********
            }
            matriz += "\n";//********
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (a[i][j] % 2 == 0) {
                    par += 1;
                }
                //cad+=" a["+i+","+j+"]"+"="+a[i][j]+" ";
                sum += a[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, matriz);
        JOptionPane.showMessageDialog(null, " La suma es: " + sum);
        JOptionPane.showMessageDialog(null, " La cantidad de pares es: " + par);
        //System.out.println(matriz);
        //JOptionPane.showMessageDialog(null,cad);
    }
}
