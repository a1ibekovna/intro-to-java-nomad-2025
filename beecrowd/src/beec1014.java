import java.util.Scanner;

public class beec1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextFloat();
        double y = sc.nextFloat();
        double consumption = x / y;
        System.out.printf("%.3f km/l%n", consumption);
    }
}
