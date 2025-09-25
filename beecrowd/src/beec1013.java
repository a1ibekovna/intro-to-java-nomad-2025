import java.util.Scanner;

public class beec1013{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maior = A;
        if(B > maior) maior = B;
        if(C > maior) maior = C;
        System.out.println(maior + " eh o maior");
    }
}
