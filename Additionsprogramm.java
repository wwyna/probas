import java.util.Scanner;

public class Additionsprogramm {
    static void main() {
        int zahl1 = 1234;
        int zahl2 = 4321;
        int summe = zahl1 + zahl2;

        System.out.println(summe);

        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe: ");
        int meineZahl = sc.nextInt();
        sc.close(); // Braucht man nicht unbedingt, aber Standard

        System.out.println(meineZahl + 1);
    }
}
