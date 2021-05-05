package conversao;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double d = 1;//conversao implicita
        System.out.println("Double: " + d);

        float f = (float)1.12764957620654730;//casting - conversão explicita
        //pode perder informação na conversão explícita (CAST)
        System.out.println("Float: " + f);

        int i= 128;
        //idependente do valor, não consegue fazer a conversão
        //byte by = i;
        byte by = (byte) i;
        System.out.println(by);
        System.out.println(by + 2);

        double a = 1.99999;
         int b = (int) a;// esplícita (CAST)
        System.out.println(b);

    }
}
