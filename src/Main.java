/*
Titel = Schleifen
Autor: Salmo Bashar 12.05.2026
BFI-Leoben
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Eingabe
        System.out.print("Eingabe z: ");
        double z = scanner.nextDouble();
        int i = 2;

        do {
            z *= i;
            System.out.println("z = " + z);
            i++;
        } while (i <= 9);

        // Reset i
        i = 2;

        do {
            z /= i;
            System.out.println("z = " + z);
            i++;
        } while (i <= 9);

        // Endergebnis (= Eingabe)
        System.out.println("\nErgebnis (= Eingabe): " + z);
        System.out.println("ENDE");

        scanner.close();
    }
}