import java.util.Scanner;

public class Divisionsprogramm {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe mir die erste Zahl:");
        float zahl1 = sc.nextFloat();
        System.out.println("Gebe mir die zweite Zahl:");
        float zahl2 = sc.nextFloat();
        float division = zahl1 / zahl2;
        System.out.printf("Die Division der beiden Zahlen ergibt %.2f", division);

        sc.close();
    }
}
