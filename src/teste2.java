import java.util.Locale;

public class teste2 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age =30;
        int code=5290;
        char gender= 'F';

        double pincel1 = 2100.0;
        double pincel2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.US);
        System.out.printf("Products: %n" +
                "%s, whice price is $ %.2f %n" +
                "%s, whice price is $ %.2f", product1,pincel1,product2,pincel2);
        System.out.println("");

        System.out.printf("Record : %d years old, code %d and gender: %s", age,code,gender);
        System.out.println("");

        System.out.printf("Measue wiht eight decimal places: %f %n" +
                "Rouded (three dcimal places) %.3f %n" +
                "US decimal point: %.3f", measure,measure,measure);
        double b,B,h,area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b+B)/2.0 *h;
        System.out.println(area);
    }
}
