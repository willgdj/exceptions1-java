import java.util.Locale;

public class teste1 {
    public static void main(String[] args) {
        double salario = 10.57584;
        String nome = "Maria";
        int idade = 31;
        System.out.printf("%.2f%n",salario);
        Locale.setDefault(Locale.US); //mudando a formatacao do double para 'US'
//        convertendo o double "12,12" para "12.12"
        System.out.printf("%.2f%n",salario);
//        printf formatando o valor em double
        System.out.printf("Resultado = %.2f metros%n", salario);
//        concatenando o valor com 'printf'
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome,idade,salario);
//        colocando variaveis formatadas com 'printf'; %f= double, %d= inteiro, %s= texto, %n= quebra de linha

    }
}
