import java.util.Scanner;

public class Desafio_app_Bank {
  public static void main(String[] args) {
    String nombreCliente = "Tony Stark"; // nombre del cliente
    String tipoCuenta = "Corriente"; // tipo de cuenta
    double saldo = 1599.99; // saldo inicial
    double montoRetiro = 0.0; // monto a retirar
    double montoDeposito = 0.0; // monto a depositar
    
    // Mostrar información del cliente y opciones
    System.out.println("**********************************");
    System.out.println("\nNombre del cliente: " + nombreCliente);
    System.out.println("Tipo de cuenta: " + tipoCuenta);
    System.out.println("Saldo disponible: " + saldo);
    Scanner teclado = new Scanner(System.in);
    System.out.println("**Escriba el numero de la opción deseada**");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Retirar dinero");
    System.out.println("3. Depositar dinero");
    System.out.println("4. Salir");
    int opcion = teclado.nextInt();

  }
  
}
