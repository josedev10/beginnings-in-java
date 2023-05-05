
package hypotenuse;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        double x;
        double y;
        double h;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter side x: ");
        x=scanner.nextDouble();
        System.out.println("Enter side y: ");
        y=scanner.nextDouble();
        
        h=Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotenuse is: "+h);
        
        scanner.close();
    }
    
}
