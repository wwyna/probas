import java.util.Scanner;

public class SchalterWahl {
    static void main() {
        int startZahl = (int) (Math.random() * 127);

        System.out.print("Anfangszustand: ");
        System.out.println(String.format("%8s", Integer.toBinaryString(startZahl)).replace(' ', '0'));

        Scanner sc = new Scanner(System.in);

        System.out.print("Wähle Schalter (1-8): ");
        int input = sc.nextInt(); // 3

        int schalter = 1; // 00000001
        schalter = schalter << input - 1; // 00001000

        int ergebnis = startZahl ^ schalter;
        System.out.print("Endzustand: ");
        System.out.println(String.format("%8s", Integer.toBinaryString(ergebnis)).replace(' ', '0'));

        sc.close();
    }
}
