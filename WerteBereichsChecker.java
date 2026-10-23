import java.util.Scanner;

public class WerteBereichsChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int zufall1 = (int) (Math.round(Math.random() * 100));
        int zufall2 = (int) (Math.round(Math.random() * 100 + 1));

        System.out.println("Gebe mir eine beliebige Ganzzahl zwischen " + Math.min(zufall1, zufall2) + " und " + Math.max(zufall1, zufall2) + " ein:");
        int zahl = sc.nextInt();

        System.out.println(Math.min(zufall1, zufall2) <= zahl && zahl <= Math.max(zufall1, zufall2));

        sc.close();
    }
}
