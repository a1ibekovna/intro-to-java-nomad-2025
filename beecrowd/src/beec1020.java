import java.util.Scanner;

public class beec1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int years = days / 365;
        days %= 365;
        int months = days / 30;
        int remainingDays = days % 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(remainingDays + " dia(s)");
    }
}
