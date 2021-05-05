package operadores;

public class DesafioOperadoresAritimeticos {
    public static void main(String[] args) {

      int equacao1Pow = (int)Math.pow(6*(3+2),2);
      int equacao1Div = equacao1Pow / (3*2);
        System.out.println("parte 1 eq: " +equacao1Div);

      int equacao2Pow = (int)Math.pow(((1-5)*(2-7))/2,2);
      System.out.printf("(Eq1: %d - Eq2 %d)³ / 10³", equacao1Div, equacao2Pow);

      int superior = (int)Math.pow(equacao1Div - equacao2Pow,3);
      int inferior = (int) Math.pow(10,3);
        System.out.printf("\n%d / 10³", superior);
    System.out.println("\nresultado: " + (superior / inferior));






    }
}
