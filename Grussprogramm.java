import java.util.Scanner;

public class Grussprogramm {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gebe mir deinen Vornamen: ");
        String vorname = sc.nextLine();
        System.out.print("Gebe mir deinen Nachnamen: ");
        String nachname = sc.nextLine();

        String vollername = vorname + " " + nachname;
        System.out.println("Willkommen " + vollername + "!");

        sc.close();
    }
}
