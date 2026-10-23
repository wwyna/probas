import java.util.Scanner;

public class WerteBereichsChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int zufall1 = (int) Math.round(Math.random() * 101);
        int zufall2 = (int) Math.round(Math.random() * 101);
        int unterGrenze = Math.min(zufall1, zufall2);
        int oberGrenze = Math.max(zufall1, zufall2);

        System.out.println("Gebe mir eine beliebige Ganzzahl zwischen " + unterGrenze + " und " + oberGrenze + " ein:");
        int zahl = sc.nextInt();

        System.out.println(unterGrenze <= zahl && zahl <= oberGrenze);

        sc.close();
    }
}
