import java.util.Scanner;

public class MatheFunktion {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe mir die erste Zahl:");
        int zahl1 = sc.nextInt();
        System.out.println("Gebe mir die zweite Zahl:");
        int zahl2 = sc.nextInt();

        int abs1 = Math.abs(zahl1);
        int abs2 = Math.abs(zahl2);
        int min = Math.min(zahl1, zahl2);
        int multipiziert = Math.multiplyExact(zahl1, zahl2);

        System.out.println("Die Absolutwerte sind: " + abs1 + ", " + abs2);
        System.out.println("Die kleinere Zahl ist: " + min);
        System.out.println("Beide Zahlen multipliziert ergeben: " + multipiziert);

        sc.close();
    }
}
