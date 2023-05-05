
package juego;

import java.util.Scanner;

public class AdivinaElNumero {
    Scanner scanner=new Scanner(System.in);
    String nombre;
    int numeroAleatorio;
    int numero;
    boolean salir=false;
    int num[]=new int[3];
    int nivel;
    int intentosEnLogro=0;
  
  public void nombre(){
      System.out.println("Digite su nombre: ");
      nombre=scanner.nextLine();
  }
  public void pedirdificultad(){
      int intento=3;
      int nivelTemp;
      
      do{
          while(true){
              System.out.println("Digite la dificultad del juego: \n"
                      + "1. facil\n"
                      + "2. media\n"
                      + "3. dificil\n");
              if(scanner.hasNextInt()){
                  nivelTemp=scanner.nextInt();
                  if(nivelTemp <4 && nivelTemp >0){
                      nivel=scanner.nextInt();
                      break;
                  }else{
                      System.out.println("Lo siento, numero fuera de los limites");
                  }
              }else{
                  System.out.println("Lo siento, introduce un entero");
              }
          }
          intento++;
      }while(intento<3);
      
      if(intento==3){
          nivel=1;
      }
      cantidadNumeros();
      generarNumero();
  }
  private void cantidadNumeros(){
      int acumular=100;
      for(int i=0;i<num.length;i++){
          num[i]=acumular;
          acumular*=2;
      }
  }
  private void generarNumero(){
      numeroAleatorio=(int) (Math.random()*num[nivel-1]);
  }
  public void pedirNumero(){
      numero=0;
      System.out.println("Digite el número: ");
      numero=scanner.nextInt();
  }
  
  public void cercaniaDelNumero(){
      int diferencia=Math.abs(numero-numeroAleatorio);
      
      if(diferencia>60){
          System.out.println("Estas demasiado frio");
      }else{
          if(diferencia>40){
              System.out.println("frio");
          }else{
              if(diferencia>20){
                  System.out.println("caliente");
              }else{
                  if(diferencia>10){
                      System.out.println("supeer caliente");
                  }else{
                      System.out.println("muuuuy hot");
                  }
              }
          }
      }
  }
  
}
