import java.util.Scanner;

public class Personalien {
    static void main() {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Gebe mir deinen Vornamen: ");
        String vorname = sc.nextLine();
        sb.append(vorname + "; ");
        System.out.print("Gebe mir deinen Nachnamen: ");
        String nachname = sc.nextLine();
        sb.append(nachname + "; ");
        System.out.print("Gebe mir dein Geschlecht: ");
        String geschlecht = sc.nextLine();
        sb.append(geschlecht + "; ");
        System.out.print("Gebe mir dein Geburtsdatum: ");
        String geburtsdatum = sc.nextLine();
        sb.append("geb. " + geburtsdatum + "; ");
        System.out.print("Gebe mir deinen Beruf: ");
        String beruf = sc.nextLine();
        sb.append(beruf);

        System.out.println(sb);

        sc.close();
    }
}
