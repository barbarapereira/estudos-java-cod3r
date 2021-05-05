package tipos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(4));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!"));
        System.out.println(s + "!!");
        System.out.println("inicia coma  palavra Boa? "
                + s.startsWith("Boa"));
        System.out.println("qtd de caracteres da string: " + s.length());
        System.out.println("está escrito igual idependente se é maiusculo?: "
                + s.equals("boa tarde"));
        System.out.println("está escrito igual idependente se é maiusculo?: "
                + s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 15;
        var salario = 13224.34F;

        System.out.println("Nome: "+ nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalário R$" + salario);
        System.out.printf("O senhor %s %s tem %d anos e ganha %.2f.\n",nome ,sobrenome, idade, salario/5);
        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f.\n",nome ,sobrenome, idade + idade, salario);
        //imprime a partir do 5º caractere
        System.out.println(frase.substring(5));



    }
}
