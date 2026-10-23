import java.util.Scanner;

public class Grundrechenarten {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe mir die erste Zahl:");
        float zahl1 = sc.nextFloat();
        System.out.println("Gebe mir die zweite Zahl:");
        float zahl2 = sc.nextFloat();

        float plus = zahl1 + zahl2;
        float minus = zahl1 - zahl2;
        float mal = zahl1 * zahl2;
        float geteilt = zahl1 / zahl2;

        System.out.printf("%s + %s = %.1f \n", zahl1, zahl2, plus);
        System.out.printf("%s - %s = %.1f \n", zahl1, zahl2, minus);
        System.out.printf("%s * %s = %.1f \n", zahl1, zahl2, mal);
        System.out.printf("%s / %s = %.2f \n", zahl1, zahl2, geteilt);

        sc.close();
    }
}
