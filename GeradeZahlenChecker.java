import java.util.Scanner;

public class GeradeZahlenChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe mir eine beliebige, gerade Ganzzahl ein:");
        int zahl = sc.nextInt();

        System.out.println("Ist die Zahl gerade? " + (zahl % 2 == 0));

        sc.close();
    }
}
