import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random arpa = new Random();
        int noppa1 = 1 + arpa.nextInt(6);
        int noppa2 = 1 + arpa.nextInt(6);
        int summa = noppa1 + noppa2;

        System.out.println("Nopan heitto: " + noppa1 + " + " + noppa2 + " = " + summa);

        if (summa == 7) {
            System.out.println("🎉 Onnea! Lucky 7!");
        } else {
            System.out.println("Yritä uudelleen!");
        }
    }
}
