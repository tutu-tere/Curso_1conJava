import java.util.Scanner;

public class Desafio_app_Bank {
  public static void main(String[] args) {
    String nombreCliente = "Tony Stark"; // nombre del cliente
    String tipoCuenta = "Corriente"; // tipo de cuenta
    double saldo = 1599.99; // saldo inicial
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
    
      switch (opcion) {
        case 1:
          // Consultar saldo
          System.out.println("Su saldo actualizado es: " + saldo + "$");
          break;
        case 2:
          // Retirar dinero
          System.out.println("Ingrese el monto a retirar: ");
          double valorRetiro = teclado.nextDouble(); // leer el monto a retirar
          if (valorRetiro > saldo) {
            System.out.println("No tiene suficiente saldo para realizar esta operación.");
          } else {
            saldo -= valorRetiro; // restar el monto del saldo
            System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo + "$");
          }
          break;
          case 3:
          // Depositar dinero
          System.out.println("Ingrese el monto a depositar: ");
          double valorDeposito = teclado.nextDouble(); // leer el monto a depositar
          saldo += valorDeposito; // sumar el monto al saldo
          System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo + "$");
          break;
          case 9:
          // Salir del programa
          System.out.println("Gracias por usar nuestra app bancaria. Hasta luego!");
          break;
          default:
          // Opción inválida
          System.out.println("Opción inválida. Por favor, elija una opción válida.");
      }
  }

   
   teclado.close(); // cerrar el scanner para evitar fugas de memoria 

  }
  
}
