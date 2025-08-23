import java.util.Scanner;

public class firstBetween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = sc.nextInt();
        System.out.println("Enter Secondd Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        if (a < b && a > b) {

            System.out.println(" Grether than " + (a < b));
            System.out.println(" Less Than  " + (a < b));

        }
        if (b < c && c > b) {
            System.out.println(" Grether than " + (c > b));
            System.out.println(" Less Than  " + (c < b));

        } else {
            System.out.println("Sumthig Miss");
        }

    }
}
