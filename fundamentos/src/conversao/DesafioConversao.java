package conversao;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Entre com o 1º salário R$" );
        String sal1 = valor.next().replace(",",".");

        System.out.print("Entre com o 2º salário R$ ");
        String sal2 = valor.next().replace(",",".");;

        System.out.print("Entre com o 3º salário R$ ");
        String sal3 = valor.next().replace(",",".");;


        double s1 = Double.parseDouble(sal1);
        double s2 = Double.parseDouble(sal2);
        double s3 = Double.parseDouble(sal3);
        double somaSal = s1 + s2 + s3;
        double mediaSal = somaSal/3;

        System.out.println("Toatl salárioem 3 meses R$ " + somaSal);
        System.out.println("sua média salarial R$ " + mediaSal);
        valor.close();
    }
}
