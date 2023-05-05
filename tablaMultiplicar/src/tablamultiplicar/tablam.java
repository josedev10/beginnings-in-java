
package tablamultiplicar;


public class tablam {
    int i,tabla,num;
   
    public void Proceso(){
      for(tabla=1;tabla<=5;tabla++){
          System.out.println("----------------\n");
          System.out.println("la tabla del: "+tabla+"\n");
          
          for(i=1;i<=10;i++){
              num=tabla*i;
              System.out.println(tabla+" x "+i+" = "+num);
          }
      }  
    }
    
}
