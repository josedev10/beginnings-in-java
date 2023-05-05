
package pruebaexcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PruebaExcepciones {
//Método que lanza excepciones verificadas (checked exceptions) FileNotFoundException y IOException
    public void lectorArchivos() throws FileNotFoundException, IOException{
         // Se crea un objeto de la clase File con la ruta del archivo que se quiere leer
        File archivo=new File("C:\\Users\\enriq\\OneDrive\\Escritorio\\matrices\\jailbreak.txt");
        // Se crea un objeto de la clase FileReader que recibe como parámetro el objeto de tipo File
        FileReader lectorArchivos=new FileReader(archivo);
        // Se crea un objeto de la clase BufferedReader que recibe como parámetro el objeto de tipo FileReader para leer el archivo
        /*Además, se está usando la clase BufferedReader para leer el archivo línea por línea. Esta clase también puede lanzar 
        una excepción de tipo IOException si ocurre algún error durante la lectura del archivo */
        BufferedReader bf=new BufferedReader(lectorArchivos);
        String linea;
        
        // Se lee cada línea del archivo mientras no sea null
        while((linea=bf.readLine())!=null){
            //El método readLine() de la clase BufferedReader se utiliza para leer cada línea del archivo
            System.out.println(linea);
            //En cada iteración del bucle, la variable linea se actualiza con la línea leída del archivo
        }
        // Se cierra el objeto BufferedReader
        bf.close();
    }
    // Método que llama al método lectorArchivos() dentro de un bloque try-catch para manejar las excepciones verificadas
    public void leerarchivo2(){
        //el try es el metodo que intetara leer el archivo si no encuentra excepciones verificadas
        try{
            lectorArchivos(); // Se llama al método que lanza excepciones verificadas
        }catch(FileNotFoundException ex){
            //el primer catch es si try encontro una excepcion, de tipo FileNotFound que seria el problema mas cercano a suceder
            JOptionPane.showMessageDialog(null,"El archivo no se ha encontrado, verifique la ruta del archivo");
        } catch (IOException e) {
            //el segundo catch es si try y el primer catch no pudieron hacer su trabajo, entonces seria otro tipo de problema
            /*e.getMessage() para mostrar al usuario un mensaje que explica la excepción que se ha producido.
            Esto puede ayudar al usuario a entender lo que ha sucedido y a solucionar el problema o buscar ayuda si es necesario.*/
            JOptionPane.showMessageDialog(null,"sea encontrado una excepcion vereficada"+e.getMessage());
        }finally{
            System.out.println("se ha completado la lectura del archivo de texto");
        }
    }
    
    
    //metodo principal
    public static void main(String[] args){
       // Se crea un objeto de la clase PruebaExcepciones
        PruebaExcepciones prueba=new PruebaExcepciones();
        // Se llama al método leerarchivo2() que maneja las excepciones verificadas
        prueba.leerarchivo2();
        
        
        
        
       /* //excepciones verificadas( IOException)
        //lectura de un archivo de texto txt
        //no es culpa del programador
        //las excepciones verificadas java te obliga a que soluciones
        BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\enriq\\OneDrive\\Escritorio\\matrices\\jailbreak.txt"));
    
        String linea;
        
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }*/
       
       /*
       //excepciones no verificas (RunTimeException)
       //division entre cero
       //si es culpa del programador
        //estos problemas obviamente la tiene que solucionar el programador, pero Java no obliga hacerlo
       int num=5,num2=0,resultado;
       
       resultado=num/num2;
       
        System.out.println("El resultado es: "+resultado);*/
       
}
}
