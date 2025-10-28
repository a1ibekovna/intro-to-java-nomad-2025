import java.util.Scanner;

public class beec1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int speed = scan.nextInt();
        double distance = time * speed;
        double liters = distance / 12;
        System.out.printf("%.3f%n", liters);
    }
}

