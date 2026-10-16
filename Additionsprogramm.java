import java.util.Scanner;

public class Additionsprogramm {
    static void main() {
        int zahl1 = 1234;
        int zahl2 = 4321;
        int summe = zahl1 + zahl2;

        System.out.println(summe);

        Scanner sc = new Scanner(System.in);
        int meineZahl = sc.nextInt();
        sc.close();

        System.out.println(meineZahl + 1);
    }
}
