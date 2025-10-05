import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tervetuloa Lucky7-peliin!");
        System.out.print("Arvaa numero 1–7: ");
        int arvaus = scanner.nextInt();

        int oikeaNumero = random.nextInt(7) + 1;

        if (arvaus == oikeaNumero) {
            System.out.println("Onneksi olkoon! Arvasit oikein!");
        } else {
            System.out.println("Väärin! Oikea numero oli: " + oikeaNumero);
        }

        System.out.println("Ohjelman suoritus päättyi.");
        scanner.close();
    }
}
