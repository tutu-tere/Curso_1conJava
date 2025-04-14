public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

    int fechaEstreno = 1999;
    boolean incluidoEnElPlan= true;
    double calificacion = 8.7;
    
    String sinopsis = """
    Un programador informático descubre que la realidad 
    que conoce es una simulación creada por máquinas para dominar a la humanidad.
    Fue estrenada en:""" + fechaEstreno;
    System.out.println(sinopsis);

    int clasificacion = (int)calificacion/2;
    System.out.println("Clasificación: " + clasificacion + " Estrellas" );
  
}
}