import java.util.Scanner;

public class oddChake {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number Is Odd : ");
        } else {
            System.out.println("Number Is Not Odd :");
        }
    }
}
