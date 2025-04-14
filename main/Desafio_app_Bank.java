import java.util.Scanner;

public class Desafio_app_Bank {
  public static void main(String[] args) {
    String nombreCliente = "Tony Stark"; // nombre del cliente
    String tipoCuenta = "Corriente"; // tipo de cuenta
    double saldo = 1599.99; // saldo inicial
    double montoRetiro = 0.0; // monto a retirar
    double montoDeposito = 0.0; // monto a depositar
    int opcion = 0; // variable para almacenar la opción elegida por el usuario
    
    // Mostrar información del cliente y opciones
    System.out.println("**********************************");
    System.out.println("\nNombre del cliente: " + nombreCliente);
    System.out.println("Tipo de cuenta: " + tipoCuenta);
    System.out.println("Saldo disponible: " + saldo);
    System.out.println("**********************************\n");

    String menu = """
    **Escriba el numero de la opción deseada**
    1 - Consultar saldo
    2 - Retirar
    3 - Depositar
    9 - Salir
        """;
    Scanner teclado = new Scanner(System.in);
    
    while (opcion !=9) {
    System.out.println(menu);
    opcion = teclado.nextInt(); // leer la opción elegida por el usuario  
    }

   
    

  }
  
}
