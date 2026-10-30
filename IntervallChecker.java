import java.util.Scanner;

public class IntervallChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie eine Ganzzahl innerhalb des Intervalls [10,20] ein: ");
        int ganzZahl = sc.nextInt();

        if (ganzZahl >= 10 && ganzZahl <= 20) {
            System.out.println(ganzZahl + " liegt INNERHALB des Intervalls [10,20].");
        } else {
            System.out.println(ganzZahl + " liegt AUßERHALB des Intervalls [10,20].");
        }

        sc.close();
    }
}
