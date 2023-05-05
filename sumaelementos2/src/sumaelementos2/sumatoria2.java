
package sumaelementos2;

import javax.swing.JOptionPane;

public class sumatoria2 {
    int i,dim,suma=0;
    int edad[]=new int[7];
    String cad="";
    public void Dimension(){
        dim=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa la dimensión del arreglo: "));
    }
    public void Generar(){
        for(i=1;i<=dim;i++){
            edad[i]=Integer.parseInt(JOptionPane.showInputDialog(""
                    + " Ingresa edad: "+i));
        }
    }
    public void Sumatoria(){
        for(i=1;i<=dim;i++){
            if(i%2==0){
                edad[i]=0;
            }
            //suma=suma+edad[i];
        }
       //JOptionPane.showMessageDialog(null, suma+"="+suma+"+"+edad[i]);
        //suma=suma+edad[i];
        
    }
    public void Mostrar(){
        //for(i=dim;i>=1;i--){/*esto es para mostrar los numero en retroceso*/
        for(i=1; i<=dim;i++){
            cad=cad+edad[i]+" ";
        }
        JOptionPane.showMessageDialog(null,cad);
    }
    
    
}

    

