public class Decisiones {

  public static void main(String[] args) {
    int fechaEstreno = 1999;

    if (fechaEstreno >= 1990 && fechaEstreno <= 1999) {
      System.out.println("La película es de los 90s");
    } else if (fechaEstreno >= 2000 && fechaEstreno <= 2009) {
      System.out.println("La película es de los 2000s");
    } else if (fechaEstreno >= 2010 && fechaEstreno <= 2019) {
      System.out.println("La película es de los 2010s");
    } else if (fechaEstreno >= 2020 && fechaEstreno <= 2023) {
      System.out.println("La película es de los 2020s");
    } else {
      System.out.println("La película no pertenece a ninguna década conocida.");
    }

  }
  
}