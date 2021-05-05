package operadores;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Trabahout na Terça? ");
        boolean tabalhoDeTerca = entrada.nextBoolean();

        System.out.print("Trabalhou na Quinta? ");
        boolean trabalhoDeQuinta = entrada.nextBoolean();


        String tv50 = "Vamos comprar a TV de 50\"";
        String tv32 = "Vamos comprar a TV 32\"";
        String tomarSorvete = "vamos tomar sorvete no shopping!!";
        String saudavel = "Vamos ficar em casa sem sorvete, porém saudáveis <3";

        if(tabalhoDeTerca && trabalhoDeQuinta){
            System.out.println(tv50 + " e " + tomarSorvete);
        }
        else if(tabalhoDeTerca || trabalhoDeQuinta){
            System.out.println(tv32 + " e " + tomarSorvete);
        }
        else if(tabalhoDeTerca ^ trabalhoDeQuinta){
            System.out.println(tv32 + " e " + tomarSorvete);
        }
        else if(tabalhoDeTerca == !true && trabalhoDeQuinta == !true){
            System.out.println(saudavel);
        }
        else{
            System.out.println(saudavel);
        }
    }
}
