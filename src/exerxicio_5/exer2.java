package exerxicio_5;

import java.util.Locale;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma,media;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double v [] = new double[n];

        for (int i = 0; i < n; i ++ ){
            System.out.println("Digite um número: ");
            v[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i = 0; i < n; i ++){
            soma += v[i];
        }
        media = soma /n;

        System.out.println("Valores: ");
        for (int i = 0; i < n; i ++){
            System.out.printf("%.1f", v[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
