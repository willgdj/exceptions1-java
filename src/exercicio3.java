import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        if (N < 0){
            System.out.println("O numero " + N + " é negativo");
        }
        else {
            System.out.println("O numero " + N + " é positivo");
        }
        sc.close();

    }
}
