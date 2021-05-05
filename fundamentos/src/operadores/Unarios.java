package operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.printf("a = %d b = %d", a, b);
        System.out.println("\n++a = " + ++a);
        System.out.println("b-- = " + b--);

        System.out.println("a++ = " + a++);// pós fixada

        System.out.println("a-- = " + a--);
        System.out.println("++a = " + ++a);// pré fixada - atribui o valor antes de comparar
        System.out.println("--b = "+ --b);
    }
}
