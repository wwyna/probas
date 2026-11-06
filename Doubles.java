public class Doubles {
    static void main() {
        int wert = 1;
        int endzahl = 128;

        while (wert <= endzahl) {
            String komma = "";

            if (wert != endzahl) {
                komma = ", ";
            } else {
                komma = "";
            }
            System.out.print(wert + komma);
            wert = wert * 2;
        }
    }
}
