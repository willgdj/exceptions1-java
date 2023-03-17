package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo1,codigo2,quantidade1,quantidade2;
        double valor1,valor2,total;


        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total= quantidade1 * valor1 + quantidade2 * valor2 ;
        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        sc.close();


    }
}
