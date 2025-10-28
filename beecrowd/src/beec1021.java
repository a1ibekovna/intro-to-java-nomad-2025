import java.util.Locale;
import java.util.Scanner;

public class beec1021{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();
        int cents = (int)Math.round(value * 100);

        System.out.println("NOTAS:");
        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        for (int note : notes) {
            System.out.printf("%d nota(s) de R$ %.2f%n", cents / note, note / 100.0);
            cents %= note;
        }

        System.out.println("MOEDAS:");
        int[] coins = {100, 50, 25, 10, 5, 1};
        for (int coin : coins) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", cents / coin, coin / 100.0);
            cents %= coin;
        }
    }
}
