import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.print("Entre com o primeiro valor: ");
        int valor2 = entrada.nextInt();

        System.out.println("Escolha a operação: \n" +
                "+ -> Soma\n" +
                "- -> Subtração\n" +
                "/ -> Divisão\n" +
                "* -> Multiplicação\n" +
                "% -> Módulo");
        String operacao = entrada.next();

        //logica

        int resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
        resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
        resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
        resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
        resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;

        System.out.println(valor1 + operacao + valor2 +" = " + resultado);

        entrada.close();

    }
}
