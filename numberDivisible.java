import java.util.Scanner;

public class numberDivisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        if (num % 7 == 0) 
        {
            if (num % 5 == 0) {
                System.out.println("Number Is Divisible by 5 But Not 7");

            } else
                System.out.println("Not Divisible Both");

        } else
            System.out.println("Not ");
    }
}
