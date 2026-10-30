import java.util.Scanner;

public class AbschreibeTest {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte tippe 'Keep It SimpeL sTupiD': ");
        String eingabe = sc.nextLine();

        if (!eingabe.equals("Keep It SimpeL sTupiD")) {
            System.out.println("Die Eingabe war leider nicht korrekt!");
        }

        sc.close();
    }
}
