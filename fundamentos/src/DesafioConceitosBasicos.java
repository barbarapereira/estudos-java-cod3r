import java.util.Scanner;

public class DesafioConceitosBasicos {
    public static void main(String[] args) {
        //Ex-1: convereter Fahrenheit para Celsius
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o valor do grau em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double c = ((valor - 32) * 5/9);

        System.out.printf("\n %.1f Fº representa %.1f em Cº", fahrenheit, c);

        entrada.close();
        */

        //Ex-2: convereter Celsius para Fahrenheit
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double f = (celsius * 9/5) + 32;
        System.out.printf("\n%.1f ºC representa %.1f ºF", celsius, f);
        */

        //Ex-3: IMC
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o seu peso? ");
        double peso = entrada.nextDouble();

        System.out.print("Qual o seu altura? ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura,2);

        String classificacao = imc <= 18.5 ? "Magreza" : "erro";
        classificacao = imc >= 18.5 && imc <= 24.9 ? "Normal": classificacao;
        classificacao = imc >= 25 && imc <= 29.9 ? "Sobrepeso": classificacao;
        classificacao = imc >= 30 && imc <= 39.9 ? "Obesidade": classificacao;
        classificacao = imc > 40 ? "Obesidade Grave": classificacao;

        System.out.printf("\nIMC = %.1f. Sua classificação é: %s", imc, classificacao );

        entrada.close();
         */

        //Ex-4: resultado ao quadrado e ao cubo
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com um valor: ");
        double valor = entrada.nextDouble();

        double quadrdo = Math.pow(valor,2);
        double cubo = Math.pow(valor,3);
        System.out.printf("\nO número %.1f² =  %.1f  \nO número %.1f³ =  %.1f", valor, quadrdo,valor, cubo);
        entrada.close();

         */

        //Ex-5: Calculo da área
       /* Scanner entrada = new Scanner(System.in);
        System.out.print("Valor da base: ");
        double base = entrada.nextDouble();

        System.out.print("Valor da altura: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        System.out.printf("\nBase: %.1f \nAltura %.1f \nÁrea = %.1fcm²", base, altura, area);
        entrada.close();
         */

        //Ex-6: Equação de 2º grau Baskara
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor da a: ");
        double a = entrada.nextDouble();

        System.out.print("Valor da b: ");
        double b = entrada.nextDouble();

        System.out.print("Valor da c: ");
        double c = entrada.nextDouble();

        double delta = (Math.pow(b,2) - 4 * a * c);

        System.out.printf("\na: %.1f \nb: %.1f \nc: %.1f \nΔ = %.1f", a, b, c, delta);
        entrada.close();
    }
}
