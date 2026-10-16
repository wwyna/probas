import java.util.Scanner;

public class AdditionsprogrammEVA {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe mir die erste Zahl: ");
        int zahl1 = sc.nextInt();
        System.out.println("Gebe mir die zweite Zahl: ");
        int zahl2 = sc.nextInt();
        int summe = zahl1 + zahl2;
        System.out.println("Die Summer der beiden Zahlen ist " + summe);
    }
}
