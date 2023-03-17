package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class exerwill {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc = sc.nextInt();
        double valorHora = sc.nextDouble();
        double HorasTrab = sc.nextDouble();

        double total = valorHora * HorasTrab;

        System.out.printf("O funcionario numero:  " + numFunc + " tem o valor R$  %.2f a receber." , total );

        sc.close();

    }
}
