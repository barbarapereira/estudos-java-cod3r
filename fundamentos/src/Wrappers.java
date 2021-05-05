import java.util.Locale;

public class Wrappers {
    public static void main(String[] args) {
        //tipo primitivo: byte tipo Literal: Byte
        Byte by = 100;
        //short
        Short s = 1000;
        // int
        Integer i = 1000;
        //long
        Long l = 100000L;

        System.out.println(by.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 2);
        System.out.println(l / 3);

        Float f = 12345.1F;
        System.out.println(f);

        Double d = 212.423;
        System.out.println(d);

        Boolean boo = Boolean.parseBoolean("true");
        System.out.println(boo);
        System.out.println(boo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

    }
}
