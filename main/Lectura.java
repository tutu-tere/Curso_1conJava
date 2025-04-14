import java.util.Scanner; //hay que importar la clase Scanner para poder usarla, ya que no es parte de la libreria java.lang
// Scanner es una clase que permite leer datos de entrada del usuario, como texto, números, etc.
public class Lectura {
  public static void main(String[] args) {
    //Clase llamada scanner para leer datos
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe el nombre de tu pelicula favorita: ");
    String pelicula = teclado.nextLine();
    System.out.println("Escribe la fecha de lanzamiento:");
    int fechaLanzamiento = teclado.nextInt();
    System.out.println("Qué nota le das a esta pelicula?");
    double nota = teclado.nextDouble();

    System.out.println(pelicula + " fue lanzada en " + fechaLanzamiento + " y le diste una nota de " + nota);
  
    //Cerramos el scanner para evitar fugas de memoria
    teclado.close();}
}