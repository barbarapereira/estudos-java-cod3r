package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
    double F = 48;
    //FINAL: determina que o valor é uma constante
    final int ajuste = 32;
    final double fator = 5.0 / 9;
    double C = (F - ajuste) * fator;
        System.out.println(C + "ºC");
    }
}
