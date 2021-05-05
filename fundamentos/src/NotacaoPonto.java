import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        //substitui ao parâmetro passado por uma palavra passada na sequencia
        s = s.replace("X","Senhora");
        //concactena a informação passada ao final do atributos
        s = s.concat("!!!");
        // transforma as letras para maiúsculo
        s = s.toUpperCase();

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        //int a = 3; "a." => não vai funcionar com tipos primitivos
        String y = "bom dia X"
                .replace("X", "Lu")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
    }
}
