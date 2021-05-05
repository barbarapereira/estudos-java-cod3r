package operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("==> Tabela Verdade E (AND) <==");
        System.out.println("true && true: "+( true && true));
        System.out.println("true && false: "+( true && false));
        System.out.println("false && true: "+( false && true));
        System.out.println("false && false: "+(false && false));
        System.out.println("======================================\n");

        System.out.println("==> Tabela Verdade OU (OR) <==");
        System.out.println("true || true: "+( true || true));
        System.out.println("true || false: "+( true || false));
        System.out.println("false || true: "+( false || true));
        System.out.println("false || false: "+(false || false));
        System.out.println("======================================\n");

        System.out.println("==> Tabela Verdade OU Exclusivo (XOR) <==");
        System.out.println("true ^ true: "+( true ^ true));
        System.out.println("true ^ false: "+( true ^ false));
        System.out.println("false ^ true: "+( false ^ true));
        System.out.println("false ^ false: "+(false ^ false));
        System.out.println("======================================\n");

        System.out.println("==> Tabela Verdade Negação (!) <==");
        System.out.println("!true: "+( !true));
        System.out.println("!false: "+(!false));
        System.out.println("======================================\n");










    }
}
