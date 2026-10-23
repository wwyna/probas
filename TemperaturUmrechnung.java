import java.util.Scanner;

public class TemperaturUmrechnung {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gebe mir eine Temperatur in Grad Celcius ein: ");
        float celcius = sc.nextFloat();

        System.out.printf("%.1f°C entsprechen %.1f°F und %.2fK.", celcius, celcius * 1.8 + 32, celcius + 273.15);

        sc.close();
    }
}
