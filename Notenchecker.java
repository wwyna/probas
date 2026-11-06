import java.util.Scanner;

public class Notenchecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gebe eine Note ein: ");
        int note = sc.nextInt();

        String[] textformen = {"sehr gut", "gut", "befriedigend", "ausreichend"}; // Alternativ auch mit if-else/switch möglich

        switch (note) {
            case 1, 2, 3, 4:
                System.out.println("Du hast mit der Note " + textformen[note - 1] + " bestanden!");
                break;
            case 5, 6:
                System.out.println("Du hast leider nicht bestanden :(");
                break;
            default:
                System.out.println("Ungültige Note. Bitte wiederholen.");
        }

        sc.close();
    }
}
