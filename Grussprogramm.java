import java.util.Scanner;

public class Grussprogramm {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe mir deinen Vornamen:");
        String vorname = sc.next();
        System.out.println("Gebe mir deinen Nachnamen:");
        String nachname = sc.next();
        String vollername = vorname + " " + nachname;
        System.out.println("Willkommen " + vollername);

        sc.close();
    }
}
