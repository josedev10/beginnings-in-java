import java.util.Scanner;

public class EvaluacionSalud {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su nombre:");
    String nombre = sc.nextLine();

    System.out.println("Ingrese su edad:");
    int edad = sc.nextInt();

    System.out.println("Ingrese su peso en kilogramos:");
    double peso = sc.nextDouble();

    System.out.println("Ingrese su altura en metros:");
    double altura = sc.nextDouble();

    double imc = peso / (altura * altura);

    String resultadoIMC = "";

    if (imc < 18.5) {
      resultadoIMC = "Bajo peso";
    } else if (imc < 25) {
      resultadoIMC = "Peso saludable";
    } else if (imc < 30) {
      resultadoIMC = "Sobrepeso";
    } else {
      resultadoIMC = "Obesidad";
    }

    String resultadoEdad = "";

    if (edad >= 1 && edad <= 3) {
      resultadoEdad = "Edad saludable para un niño pequeño";
    } else if (edad >= 4 && edad <= 12) {
      resultadoEdad = "Edad saludable para un niño mayor";
    } else if (edad >= 13 && edad <= 17) {
      resultadoEdad = "Edad saludable para un adolescente";
    } else if (edad >= 18 && edad <= 64) {
      resultadoEdad = "Edad saludable para un adulto";
    } else if (edad >= 65) {
      resultadoEdad = "Edad saludable para un adulto mayor";
    } else {
      resultadoEdad = "Edad no válida";
    }

    String resultadoGeneral = "";

    if (resultadoIMC.equals("Peso saludable") && !resultadoEdad.equals("Edad no válida")) {
      resultadoGeneral = "Saludable";
    } else {
      resultadoGeneral = "No saludable";
    }

    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Altura: " + altura + " m");
    System.out.println("IMC: " + imc);
    System.out.println("Estado de peso: " + resultadoIMC);
    System.out.println("Estado de edad: " + resultadoEdad);
    System.out.println("Estado general de salud: " + resultadoGeneral);
  }
}

