package operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");
        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        String s2 = entrada.next();

        System.out.println("2".equals(s2.trim()));//trim tira os espaços em branco
        System.out.println("s2: "+s2);

        entrada.close();
    }
}
