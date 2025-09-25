import java.util.Scanner;

public class beec1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double m = (a * 3.5 + b * 7.5) / 11.0;

        System.out.printf("MEDIA = %.5f%n", m);
        sc.close();
    }
}