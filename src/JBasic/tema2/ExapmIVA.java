package JBasic.tema2;

public class ExapmIVA {
  static void calPrice (double a) {
    double result = a*.12;
    System.out.println ( "EL va valor del IVA es de la funcion void es: " +result );
  }
  
  static double ivaCal(double a){
    double result = a*.12;
    return result;
  }
  
  public static void main(String[] args) {
    double precioP = 100;
    calPrice(precioP);
    System.out.println("EL va valor del IVA  de la funcion con retorno es: " +ivaCal(precioP));
  }
}
