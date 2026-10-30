import java.util.Scanner;

public class Personalien {
    static void main() {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Gebe mir deinen Vornamen: ");
        sb.append(sc.nextLine() + "; ");
        System.out.print("Gebe mir deinen Nachnamen: ");
        sb.append(sc.nextLine() + "; ");
        System.out.print("Gebe mir dein Geschlecht: ");
        sb.append(sc.nextLine() + "; ");
        System.out.print("Gebe mir dein Geburtsdatum: ");
        sb.append("geb. " + sc.nextLine() + "; ");
        System.out.print("Gebe mir deinen Beruf: ");
        sb.append(sc.nextLine());

        System.out.println(sb);

        sc.close();
    }
}
