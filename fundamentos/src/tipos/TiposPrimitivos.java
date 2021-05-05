package tipos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //informações do funcionário

        //tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_113L;

        //tipos numéricos reais - ponto flutuante
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_779.1;

        //tipos booleano
        boolean estaDeFerias = true;

        //tipo caractere
        char status = 'A';

        //dias de empresa
        System.out.println("dias de empresa: " + anosDeEmpresa * 365);

        //número de viagens
        System.out.println("número de vôos: " + numeroDeVoos / 2);

        //pontos por real
        System.out.println("pontos acumulados em R$" + pontosAcumulados / vendasAcumuladas);

        System.out.println("O ID: " + id + " ==> Ganha RS"+ salario);
        System.out.println("Funcionário está de ferias: " + estaDeFerias);
        System.out.println("Status do funcionário: " + status);
        //

        //
    }

}
