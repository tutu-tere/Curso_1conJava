public class Mensaje {
  public static void main(String[] args) {
  
  String saludo = "Hola, mi nombre es ";
  String nombre = "Alicia ";
  String continuacion = "y mi edad es ";
  int edad = 17;
  String mensaje = String.format("%s%s%s%d años", saludo, nombre, continuacion, edad);
  System.out.println(mensaje);

  }
}

