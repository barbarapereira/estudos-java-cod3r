package operadores;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner valor  = new Scanner(System.in);
        System.out.print("Entre com a média do aluno: ");
        double media = valor.nextDouble();

        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
        System.out.println("O aluno está: " + resultadoFinal);
        valor.close();
    }
}
