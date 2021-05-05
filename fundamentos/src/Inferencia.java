package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        var b ="variavel";
        System.out.println(b);
        // não consegue atribuir outro tipo para a variável
        //b = "outra atribuição";
        b = "...";
        a = 4;
        System.out.println(a);
        System.out.println(b);
        /*Não funciona
        var c;
        c = 7
        a declaração e a atribuição precisa ser feita na mesma linhaB
         */
    }
}
