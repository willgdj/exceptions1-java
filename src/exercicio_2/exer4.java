package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num;
        double total,horasTrabalhadas,valorHora;
        num = sc.nextInt();
        valorHora = sc.nextDouble();
        horasTrabalhadas = sc.nextDouble();

        total = horasTrabalhadas * valorHora;

        System.out.printf("O funcionario numero " + num + " tem a receber R$ %.2f",total);

        sc.close();


    }
}
