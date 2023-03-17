package exerxicio_5;

import java.util.Locale;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            v[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            if (v[i] < 0) {
                System.out.printf("%d\n", v[i]);
            }


        }
    }
}
