import java.util.Random;
import java.util.Scanner;

public class WerteBereichsChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int zufall1 = rand.nextInt(100);
        int zufall2 = rand.nextInt(100);
        int unterGrenze = Math.min(zufall1, zufall2);
        int oberGrenze = Math.max(zufall1, zufall2);

        System.out.println("Gebe mir eine beliebige Ganzzahl zwischen " + unterGrenze + " und " + oberGrenze + " ein:");
        int zahl = sc.nextInt();

        System.out.println(unterGrenze <= zahl && zahl <= oberGrenze);

        sc.close();
    }
}
