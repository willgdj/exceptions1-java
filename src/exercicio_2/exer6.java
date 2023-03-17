package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a,b,c,triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a+b)/2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n",triangulo);
        System.out.printf("circulo: %.3f%n",circulo);
        System.out.printf("trapezio: %.3f%n",trapezio);
        System.out.printf("quadrado: %.3f%n",quadrado);
        System.out.printf("retangulo: %.3f%n",retangulo);


    }
}
