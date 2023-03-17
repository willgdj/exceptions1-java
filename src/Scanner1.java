import java.util.Locale;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Voce digitou: " + x);


       sc.close();
    }

}
