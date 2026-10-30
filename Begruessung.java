import java.util.Scanner;

public class Begruessung {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib mir deinen Vorname: ");
        String vorname = sc.next();
        System.out.print("Gib mir deinen Nachname: ");
        String nachname = sc.next();
        System.out.print("Gib mir dein Geschlecht (m/w): ");
        String geschlecht = sc.next();
        System.out.print("Darf geduzt werden? (j/n): ");
        String duzen = sc.next();

        if (duzen.equals("j")) {
            System.out.println("Hallo " + vorname + ", ich heiße Dich willkommen!");
        } else if (duzen.equals("n")) {
            String anrede = "";
            if (geschlecht.equals("m")) {
                anrede = "Herr ";
            } else if (geschlecht.equals("w")) {
                anrede = "Frau ";
            }
            System.out.println("Guten Tag " + anrede + nachname + ", ich heiße Sie willkommen");
        } else {
            System.out.println("Bitte antworte mit j/n.");
        }

        sc.close();
    }
}
