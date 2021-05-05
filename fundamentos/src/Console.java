import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia");

        System.out.printf("Megasena: %d %d %d %d %d %d\n",1, 2, 3, 4, 5, 6);

        //entrar com os dados
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Entre como seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Entre como sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();
    }
}
