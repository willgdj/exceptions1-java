import java.util.Scanner;

public class exercicio3_pt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N %2 == 0){
            System.out.println("O numero " + N + " é par");
        }
        else  {
            System.out.println("O numero " + N + " é impar");
        }
        sc.close();
    }
}
