package operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == a);

        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double nome = 5.3;
        boolean temBomComportamento = true;
        boolean possouPorMedia = nome >= 7;//op relacionais
        boolean desconto = temBomComportamento && possouPorMedia;//op lógicos

        System.out.println("Tem desconto? " + desconto);

    }
}
