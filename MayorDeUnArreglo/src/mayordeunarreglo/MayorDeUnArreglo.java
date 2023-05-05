
package mayordeunarreglo;

import java.util.Arrays;


public class MayorDeUnArreglo {

    
    public static void main(String[] args) {
        int array[]=new int[5];
        int numMayor=0;
        
        for(int i=0;i<5;i++){
            array[i]=(int)(Math.random()*100);
        }
        
        System.out.println("Arreglo: " + Arrays.toString(array));
        
        for(int i=0;i<5;i++){
            if(array[i]>numMayor){
             numMayor = array[i];
            }
        }
        
        System.out.println("El número mayor es: "+numMayor);
    }
    
}
